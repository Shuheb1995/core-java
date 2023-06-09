package com.xworkz.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.xworkz.student.dto.StudentDto;

public class StudentRunner2 {

	public static void main(String[] args) {
		
		StudentDto dto = new StudentDto("Kiran", 2, 25, "B.Sc", "Chikka Ballapura");
		StudentDto dto1 = new StudentDto("Shuheb", 3, 27, "B.E", "Hassan");
		StudentDto dto2 = new StudentDto("Ulaga", 1, 25, "B.tech", "Tamil Nadu");
         
		List<StudentDto> list = new ArrayList<StudentDto>();
		
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		
		
//		Comparator<StudentDto> comp = new Comparator<StudentDto>() {
//
//			@Override
//			public int compare(StudentDto o1, StudentDto o2) {
//				if(o1.getRegisterNumber()>o2.getRegisterNumber()) {
//					return 1;
//				}else {
//					return -1;
//				}
//			}
//			
//		};
		Collections.sort(list);
		for (StudentDto studentDto : list) {
			System.out.println(studentDto);
		}
		
	}

}
