package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public class BookDao extends AbstractBookDao {

	BookDto[] book = new BookDto[5];

	public boolean saveBook(BookDto name) {
		if (name != null) {
			if (name.getName() != null) {
				for (int i = 0; i < book.length; i++) {
					if (book[i] == null) {
						book[i] = name;
						return true;
					}
				}

			}
			return false;
		}
		return false;
	}

	public BookDto[] readBook() {
		return book;

	}

	public boolean findBookByName(String searchName) {
		if (searchName != null) {
			for (int i = 0; i < book.length; i++) {
				if (book[i] != null) {
					if (book[i].getName().equals(searchName)) {
						return true;
					}
				}

			}

		}

		return false;
	}

	public BookDto deleteBook(String name) {
		if (name != null) {
			for (int i = 0; i < book.length; i++) {
				if (book[i] != null) {
					book[i] = null;
					return book[i];
				}

			}
			return null;
		}
		return null;

	}

	public BookDto updateBook(String oldName, String newName) {
		if (oldName != null && newName != null) {
			for (int i = 0; i < book.length; i++) {
				if(book[i]!=null) {
				if (book[i].getName().equals(oldName)) {
					book[i].setName(newName);
					return book[i];
				    }
				}

			}
			return null;
		}
		return null;

	}

}
