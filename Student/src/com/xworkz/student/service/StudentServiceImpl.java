package com.xworkz.student.service;

import java.util.HashMap;

import com.xworkz.student.dao.StudentDao;
import com.xworkz.student.dao.StudentDaoImpl;
import com.xworkz.student.dto.StudentDto;

public class StudentServiceImpl implements StudentService {

	StudentDao dao = new StudentDaoImpl();

	@Override
	public boolean save(Integer key, StudentDto dto) {
		if (key != null) {
			if (dto != null) {
				if (dto.getName() != null) {
					if (dto.getQualification() != null) {
						System.out.println("Dto saved Successfully");
						dao.save(key, dto);
						return true;

					}
					System.out.println("Qualification is null");
				}
				System.out.println("Name is null");
				return false;
			}
			System.out.println("Dto is null");
			return false;
		}
		System.out.println("Key is null");
		return false;
	}

	@Override
	public HashMap<Integer, StudentDto> read() {
		
		return dao.read();
	}

	@Override
	public boolean find(Integer key) {
		if (key != null) {
			dao.find(key);
			return true;
		}
		System.out.println("Place is null");
		return false;
	}

}
