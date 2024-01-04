package com.xworkz.books.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.books.dto.BooksDto;

public interface BooksService {
	
	public boolean validate(BooksDto dto , Model model);
	
	public boolean save(BooksDto dto , Model model);
	
	public List<BooksDto> read();

	public BooksDto findByName(String bookName, Model model);

}
