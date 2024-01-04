package com.xworkz.avatarMovie;

import com.xworkz.avatarMovie.dto.avatarDto;
import com.xworkz.avatarMovie.service.avatarService;
import com.xworkz.avatarMovie.service.avatarServiceImpl;

public class avatarMovieRunner {

	public static void main(String[] args) {
		
		avatarDto dto = new avatarDto();
		dto.setId(4);
		dto.setName("Avatar");
		dto.setProducer("Jon Landau");
		dto.setDirector("James Cameron");
		dto.setActor("Samuel Henry");
		dto.setActress("Zoe Saldana");
		
		//System.out.println(dto);
		avatarService service = new avatarServiceImpl();
		//service.save(dto);
		service.update("Avatar2","Kiran","Ulaga","Varun","Maha");
	}

}
