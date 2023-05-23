package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public abstract class AbstractBookDao {
	
	
	
	public abstract boolean saveBook(BookDto name);
	public abstract BookDto[] readBook();
	public abstract boolean findBookByName(String searchName);
	public abstract BookDto deleteBook(String name);
	public abstract BookDto updateBook(String oldName,String newName);

}
