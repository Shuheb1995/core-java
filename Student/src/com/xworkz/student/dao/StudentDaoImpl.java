package com.xworkz.student.dao;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public class StudentDaoImpl implements StudentDao {
	
	HashMap<Integer,StudentDto> map =  new HashMap<Integer,StudentDto>();

	
	@Override
	public boolean save(Integer key,StudentDto dto) {
		map.put(key, dto);
		return true;
	}

	@Override
	public HashMap<Integer,StudentDto> read() {
		return map;
	}

	@Override
	public boolean find(Integer key) {
		map.get(key);
		return true;
	}

}
