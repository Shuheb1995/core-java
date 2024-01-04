package com.xworkz.news;

import java.util.List;

import com.xworkz.news.dto.NewsDto;
import com.xworkz.news.service.NewsService;
import com.xworkz.news.service.NewsServiceImpl;

public class NewsRunner {

	public static void main(String[] args) {

		NewsDto dto = new NewsDto(1, "Aajtak", "Politics", "Kannada", "Gruha Jyothi", "19/07/2023");
		NewsDto dto1 = new NewsDto(2, "Suvarna", "Sports", "Kannada", "Cricket", "19/07/2023");
		NewsDto dto2 = new NewsDto(3, "IndiaToday", "Crime", "Tamil", "Murder", "20/07/2023");
		NewsDto dto3 = new NewsDto(4, "ABP News", "Education", "English", "SSLC Results", "20/07/2023");
		

		NewsService service = new NewsServiceImpl();

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//
//		NewsDto returnedDto = service.findById(1);
//		System.out.println(returnedDto);
//
//		service.readAll();
		
		boolean update = service.update(3);
		System.out.println("Dto updated");
		System.out.println(update);
		
		boolean delete = service.delete(1);
		System.out.println("Dto deleted");
		System.out.println(delete);
		
	}

}
