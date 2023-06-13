package com.xworkz.headset;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.headset.dto.HeadSetDto;
import com.xworkz.headset.service.HeadSetService;
import com.xworkz.headset.service.HeadSetServiceImpl;

public class HeadSetRunner {

	public static void main(String[] args) {

		HeadSetDto dto = new HeadSetDto("Boat", "Wire Less", 1200, 4.3f, true);
		HeadSetDto dto1 = new HeadSetDto("JBL", "Ear Pods", 4500, 4.4f, true);
		HeadSetDto dto2 = new HeadSetDto("Apple", "iPods", 12000, 4.5f, true);
		HeadSetDto dto3 = new HeadSetDto("Noise", "Wire Less", 800, 4.2f, true);

		HeadSetService service = new HeadSetServiceImpl();
		
		service.save(1, dto);
		service.save(2, dto1);
		service.save(3, dto2);
		service.save(4, dto3);
		
		HashMap<Integer, HeadSetDto> read = service.read();
		Set<Integer> set = read.keySet();
		for(Integer result : set) {
			System.out.println(read.get(result));
		}
		
		HeadSetDto find = service.findbyBrand("Apple");
		System.out.println(find);
		
		HeadSetDto update = service.updateByPrice(4, 900);
		System.out.println(update);
		
		boolean delete = service.deleteByBrand(2);
		System.out.println(delete);

	}

}
