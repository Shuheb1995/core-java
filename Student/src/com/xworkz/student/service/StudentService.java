package com.xworkz.student.service;

import java.util.HashMap;

import com.xworkz.student.dto.StudentDto;

public interface StudentService {
	
	public boolean save(Integer key,StudentDto dto);
	public HashMap<Integer,StudentDto> read();
	public boolean find(Integer key);

}
