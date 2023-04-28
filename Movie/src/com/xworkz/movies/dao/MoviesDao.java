package com.xworkz.movies.dao;

import com.xworkz.movies.dto.MoviesDto;

public class MoviesDao {
	
	MoviesDto[] move = new MoviesDto[10];//For test case of if(move[i]==null) reduce the size of array;
	
	public boolean saveMovie(MoviesDto dto) {
		if(dto!= null) {
			if(dto.getMovieName()!=null && dto.getProducer()!=null) {
			
			for(int i=0;i<move.length;i++) {
				
				if(move[i]==null) {
					move[i]=dto;
					System.out.println("null found so executing it");
					return true;
				}
				System.out.println("index is not null");
				
			
		}
			System.out.println("no space in arrray");
			return false;
			}
			System.out.println("Name and Producer is null");
	}
		System.out.println("Dto Is null");
		return false;
		
}
	public MoviesDto[] readAll() {
		return move;
	}

	
}
