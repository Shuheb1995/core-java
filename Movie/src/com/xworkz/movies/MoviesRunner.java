package com.xworkz.movies;

import com.xworkz.movies.dao.MoviesDao;
import com.xworkz.movies.dto.MoviesDto;

public class MoviesRunner {

	public static void main(String[] args) {
		
		MoviesDto dto = new MoviesDto("Pathaan", "Shahrukh Khan", "Deepika", "Jhon Abraham", "Anand", 550000000);
		MoviesDao dao = new MoviesDao();
		MoviesDto dto1 = new MoviesDto("War","Hritik Roshan","Vani Kapoor","Tiger Shroff","Ulaga",450000000);
		MoviesDto dto2 = new MoviesDto(null,"Hritik Roshan","Vani Kapoor","Tiger Shroff",null,450000000);

		dao.saveMovie(dto);
		System.out.println("--------test--------");
		dao.saveMovie(dto1);
		System.out.println("--------test--------");
		dao.saveMovie(null);
		System.out.println("--------test--------");
		dao.saveMovie(dto2);
		System.out.println("--------test--------");
		
		
		
		
		MoviesDto[] result = dao.readAll();
		for(int i=0; i<result.length;i++) {
			if(result[i]!= null) {
				System.out.println(result[i]);
				
			}
		}

	}

}
