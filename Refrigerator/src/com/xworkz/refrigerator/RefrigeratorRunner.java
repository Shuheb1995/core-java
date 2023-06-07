package com.xworkz.refrigerator;

import java.util.HashMap;

import com.xworkz.refrigerator.dao.RefrigeratorDao;
import com.xworkz.refrigerator.dao.RefrigeratorDaoImpl;
import com.xworkz.refrigerator.dto.RefrigeratorDto;

public class RefrigeratorRunner {

	public static void main(String[] args) {

		RefrigeratorDto dto = new RefrigeratorDto("Samsung", "Red", 15000, "Double Door", 6);
		RefrigeratorDto dto1 = new RefrigeratorDto("Whirpool", "Black", 12000, "Single Door", 5);
		RefrigeratorDto dto2 = new RefrigeratorDto("Panasonic", "Grey", 20000, "Multi", 10);

		RefrigeratorDao dao = new RefrigeratorDaoImpl();

		dao.save(1, dto);
		dao.save(2, dto1);
		dao.save(3, dto2);
		System.out.println("-------------------------------------------------");

		HashMap<Integer, RefrigeratorDto> read = dao.read();
		System.out.println(read);

		System.out.println("-------------------------------------------------");

		RefrigeratorDto find = dao.find(1);
		System.out.println(find);

		System.out.println("-------------------------------------------------");

		boolean update = dao.update(2, "Sony");
		System.out.println(update);

		System.out.println("-------------------------------------------------");

		boolean del = dao.delete(2);
		System.out.println(del);

	}

}
