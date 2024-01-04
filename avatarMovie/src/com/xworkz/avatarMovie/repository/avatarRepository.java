package com.xworkz.avatarMovie.repository;

import com.xworkz.avatarMovie.dto.avatarDto;

public interface avatarRepository {

	boolean save(avatarDto dto);
	boolean update(String name, String producer, String director,String actor,String actress);
}
