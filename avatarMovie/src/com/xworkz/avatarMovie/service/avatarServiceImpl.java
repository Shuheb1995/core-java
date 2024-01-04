package com.xworkz.avatarMovie.service;

import com.xworkz.avatarMovie.dto.avatarDto;
import com.xworkz.avatarMovie.repository.avatarRepository;
import com.xworkz.avatarMovie.repository.avatarRepositoryImpl;

public class avatarServiceImpl implements avatarService{
	
	avatarRepository repo = new avatarRepositoryImpl();

	@Override
	public boolean save(avatarDto dto) {
		System.out.println("Save avatar table");
	    boolean save = repo.save(dto);
		return false;
	}

	@Override
	public boolean update(String name, String producer, String director,String actor,String actress) {
		if(name!=null) {
			if(producer!=null) {
				if(director!=null) {
					if(actor!=null) {
						if(actress!=null) {
							System.out.println("Row Updated");
							boolean update = repo.update(name,producer,director,actor,actress);
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}

}
