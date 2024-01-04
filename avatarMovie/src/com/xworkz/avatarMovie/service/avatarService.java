package com.xworkz.avatarMovie.service;

import com.xworkz.avatarMovie.dto.avatarDto;

public interface avatarService {
	
	boolean save(avatarDto dto);
	boolean update(String name, String producer, String director,String actor,String actress);

}
