package com.xworkz.books.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.books.dto.BooksDto;
import com.xworkz.books.repo.BooksRepo;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	private BooksRepo repo;

	@Override
	public boolean validate(BooksDto dto, Model model) {

		boolean valid = true;
		if (dto != null) {
			if (dto.getBookName() == null || dto.getBookName().isEmpty()) {
				model.addAttribute("bookName", "Book Name is not valid");
				valid = false;
			}
			if (dto.getAuthor() == null || dto.getAuthor().isEmpty()) {
				model.addAttribute("author", "Author not valid");
				valid = false;
			}
			if (dto.getPublisher() == null || dto.getPublisher().isEmpty()) {
				model.addAttribute("publisher", "Publisher not valid");
				valid = false;
			}
			if (dto.getPublishedIn() == null || dto.getPublishedIn().isEmpty()) {
				model.addAttribute("publishedIn", "Published date not valid");
				valid = false;
			}
			if (dto.getLanguage() == null || dto.getLanguage().isEmpty()) {
				model.addAttribute("language", "Language is not matching");
				valid = false;
			}
			if (dto.getContent() == null || dto.getContent().isEmpty()) {
				model.addAttribute("content", "Content is not correct");
				valid = false;
			}
		} else {
			System.out.println("Dto is validated");
			valid = false;
		}

		return valid;
	}

	@Override
	public boolean save(BooksDto dto, Model model) {
		
		boolean status = validate(dto, model);
		if(status == true) {
			
			
			BooksDto find = repo.findByName(dto.getBookName(),model);
				if(find == null) {
					System.out.println("Dto is validated");
					return repo.save(dto);
				}
				model.addAttribute("find", "Book Name already exist");
				return false;
			
		}
		return status;
	}

	@Override
	public List<BooksDto> read() {
		
		return repo.read();
	}
	
	public BooksDto findByName(String bookName, Model model) {
		
		if(bookName!=null && !bookName.isEmpty()) {
			
			List<BooksDto> dto = read();
			
			if(dto != null) {
				
				return repo.findByName(bookName, model);
				
			}
			model.addAttribute("content", "Book Name is not valid");
			return null;
			
			
		}
		model.addAttribute("findBook", "Book Name is not valid");
		return null;
		
	}

}
