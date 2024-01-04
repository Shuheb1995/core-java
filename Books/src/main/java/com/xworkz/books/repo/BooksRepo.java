package com.xworkz.books.repo;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.ui.Model;

import com.xworkz.books.dto.BooksDto;

public interface BooksRepo {
	
	public boolean save(BooksDto dto);
	
	public BooksDto findByName(String bookName , Model model) ;
	
	public List<BooksDto> read();

}
