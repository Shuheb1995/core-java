package com.xworkz.book;

import com.xworkz.book.dao.BookDao;
import com.xworkz.book.dto.BookDto;

public class BookRunner {
	
	public static void main(String[] args) {
		BookDto ref = new BookDto("Quran","Allah","Way to lives in Islam",800,900);
		BookDto ref1 = new BookDto("Harry Potter","Dumble Dore","Magicians",500,1000);
		BookDto ref2 = new BookDto("Spider Man","Stanely","Action",500,1000);
		BookDto ref3 = new BookDto("Thor","Mica TT","Thunder",600,2000);
		
		BookDao obj = new BookDao();
		
		
		
		obj.saveBook(ref);
		obj.saveBook(ref1);
		obj.saveBook(ref2);
		obj.saveBook(ref3);
		BookDto[] prnt = obj.readBook();
		for(int i=0; i<prnt.length; i++) {
			if(prnt[i]!=null) {
			System.out.println(prnt[i]);
			
			}
		}
		System.out.println("-------------------------------------------------------------------------");
		boolean disp = obj.findBookByName("Harry Potter");
		System.out.println(disp);
		System.out.println("-------------------------------------------------------------------------");
		BookDto disp1= obj.deleteBook("Spider Man");
		System.out.println(disp1);
		System.out.println("-------------------------------------------------------------------------");
		BookDto disp2 = obj.updateBook("Thor", "Thor:Ragnarok");
		System.out.println(disp2);

	}

}
