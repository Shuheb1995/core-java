package com.xworkz.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.books.dto.BooksDto;
import com.xworkz.books.service.BooksService;

@Controller
public class BooksController {

	@Autowired
	private BooksService service;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(BooksDto dto, Model model) {

		boolean save = service.save(dto, model);
		if (save) {
			model.addAttribute("saveBook", dto);
			return "Create";
		} else {
			return "Create";
		}
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(Model model) {

		List<BooksDto> dto = service.read();
		if(dto!=null) {
			model.addAttribute("readData", dto);
			return "Read";
			
		}
		else {
			return "Read";
		}

	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String read(String bookName , Model model) {
		
		BooksDto find = service.findByName(bookName, model);
		if(find !=null) {
			model.addAttribute("findContent", find);
			return "Content";
		}
		model.addAttribute("book", "Book Name is not valid");
		return "Read";
	}
	
	

}
