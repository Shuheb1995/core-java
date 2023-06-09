package com.xworkz.student;

import java.util.HashMap;
import java.util.Set;
import com.xworkz.student.dto.StudentDto;
import com.xworkz.student.service.StudentService;
import com.xworkz.student.service.StudentServiceImpl;

public class StudentRunner {

	public static void main(String[] args) {

		StudentDto dto = new StudentDto("Kiran", 2, 25, "B.Sc", "Chikka Ballapura");
		StudentDto dto1 = new StudentDto("Shuheb", 3, 27, "B.E", "Hassan");
		StudentDto dto2 = new StudentDto("Ulaga", 1, 25, "B.tech", "Tamil Nadu");

		StudentService service = new StudentServiceImpl();

		service.save(1, dto);
		service.save(2, dto1);
		service.save(3, dto2);

		HashMap<Integer, StudentDto> read = service.read();
		Set<Integer> set = read.keySet();
		for (Integer integer : set) {
			System.out.println(read.get(integer));
		}

		boolean disp = service.find(2);
		System.out.println(disp);

		
		

	}

}
