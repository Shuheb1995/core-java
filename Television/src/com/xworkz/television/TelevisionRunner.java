package com.xworkz.television;

import com.xworkz.television.dao.BrandIsNullException;
import com.xworkz.television.dao.BrandNotFoundException;
import com.xworkz.television.dao.DtoNotFoundException;
import com.xworkz.television.dao.TelevisionDao;
import com.xworkz.television.dao.TelevisionDaoTwo;
import com.xworkz.television.dto.TelevisionDto;

public class TelevisionRunner {
	
	public static void main(String[] args) {
		
		
		TelevisionDto dto = new TelevisionDto('L',45000,true,true);
		TelevisionDto dto1 = new TelevisionDto('B',25000,false,true);
		TelevisionDao dao= new TelevisionDaoTwo();
		
		try {
			dao.saveTele(dto);
			dao.saveTele(dto1);
		} 
		catch (BrandIsNullException e) {
			e.printStackTrace();
		}
		
		
		TelevisionDto[] read = dao.readTele();
		for(int i=0;i<read.length;i++) {
			if(read[i]!=null) {
			System.out.println(read[i]);
			}
		}
		System.out.println("--------------------------------------");
		
		try {
		     dao.updateTele('L', 50000);
		}
		catch (BrandNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------------");
		try {
			dao.findTele(50000);
		}
		catch (DtoNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
		System.out.println("--------------------------------------");
		
		try {
			 dao.deleteTele('B');
		}
		catch (BrandNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------");
		TelevisionDto ref = dao.updateNameByPriceAndGraphics('L', 50000, true);
		System.out.println(ref);
		
		System.out.println("------------------------------------------");
		TelevisionDto ref1 = dao.findByBrandAndStreaming('L', true);
		System.out.println(ref1);
		
	}

}
