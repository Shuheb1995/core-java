package com.xworkz.employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.employee.config.EmployeeConfig;
import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeService;
import com.xworkz.employee.service.EmployeeServiceImpl;

public class EmployeeRunner {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeService service = context.getBean(EmployeeServiceImpl.class);
		
		EmployeeDto dto = new EmployeeDto(1, "Shuheb", 25, 8217650069l, "B.E", "Male", "Software Engineer", 45000, "Hassan", "27/07/2023");
		EmployeeDto dto1= new EmployeeDto(2, "Faizaan", 25, 8217650069l, "B.E", "Male", "Software Engineer", 45000, "Hassan", "27/07/2023");
		EmployeeDto dto2 = new EmployeeDto(3, "Musaib", 25, 8217650069l, "B.E", "Male", "Software Engineer", 45000, "Hassan", "27/07/2023");
		EmployeeDto dto3 = new EmployeeDto(4, "Saad", 25, 8217650069l, "B.E", "Male", "Software Engineer", 45000, "Hassan", "27/07/2023");
		EmployeeDto dto4 = new EmployeeDto(5, "Mukabbir", 25, 8217650069l, "B.E", "Male", "Software Engineer", 45000, "Hassan", "27/07/2023");
		EmployeeDto dto5 = new EmployeeDto(6, "Bilal", 25, 8217650069l, "B.E", "Male", "Software Engineer", 45000, "Hassan", "27/07/2023");

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
		
//		EmployeeDto find = service.find("Musaib");
//		System.out.println(find);
		
//		boolean update = service.updateMobileNumberByName("Faizaan", 7896589654l);
//		System.out.println(update);

//		boolean delete = service.deleteByName("Mukabbir");
//		System.out.println(delete);
		
		List<EmployeeDto> read = service.readAll();
		for (EmployeeDto employeeDto : read) {
			System.out.println(employeeDto);
		}
		
		
	}

}
