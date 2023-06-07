package com.xworkz.refrigerator;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.refrigerator.dao.RefrigeratorDao;
import com.xworkz.refrigerator.dao.RefrigeratorDaoImpl;
import com.xworkz.refrigerator.dto.RefrigeratorDto;
import com.xworkz.refrigerator.service.RefrigeratorService;
import com.xworkz.refrigerator.service.RefrigeratorServiceImpl;

public class RefrigeratorRunner {

	public static void main(String[] args) {

		RefrigeratorDto dto = new RefrigeratorDto("Samsung", "Red", 15000, "Double Door", 6);
		RefrigeratorDto dto1 = new RefrigeratorDto("Whirpool", "Black", 12000, "Single Door", 5);
		RefrigeratorDto dto2 = new RefrigeratorDto("Panasonic", "Grey", 20000, "Multi", 10);

		//RefrigeratorDao dao = new RefrigeratorDaoImpl();
		RefrigeratorService service = new RefrigeratorServiceImpl();

		service.save(1, dto);
		service.save(2, dto1);
		service.save(3, dto2);
		System.out.println("-------------------------------------------------");

		HashMap<Integer, RefrigeratorDto> read = service.read();
		Set<Integer> re = read.keySet();
		for (Integer i : re) {
			System.out.println(read.get(i));
		}
		

		System.out.println("-------------------------------------------------");

		RefrigeratorDto find = service.find(1);
		System.out.println(find);

		System.out.println("-------------------------------------------------");

		boolean update = service.update(2, "Sony");
		System.out.println(update);

		System.out.println("-------------------------------------------------");

		boolean del = service.delete(2);
		System.out.println(del);

	}

}
