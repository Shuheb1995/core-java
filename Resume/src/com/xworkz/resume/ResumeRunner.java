package com.xworkz.resume;

import com.xworkz.resume.dao.ResumeDao;
import com.xworkz.resume.dto.AddressDto;
import com.xworkz.resume.dto.ResumeDto;

public class ResumeRunner {
	
	public static void main(String[] args) {
		ResumeDao dao = new ResumeDao();
		AddressDto via = new AddressDto(80,"K R Puram","Banglore","Karnataka");
		ResumeDto dto = new ResumeDto("Mr. Kiran","mr.kiranxworkx@gmail.com",9738831132L,"23rd March 2000","Bsc","Mahendrakar",via);
		AddressDto via1 = new AddressDto(75,"BTM Layout","Banglore","Karnataka");
		ResumeDto dto1 = new ResumeDto("Mr.Ulaga","Mr.Ulaga@gmail.com",9874662111L,"15th Sep 1999","BE","Nathan",via1);
		AddressDto via2 = new AddressDto(60,"BTM 2nd Stage","Banglore","Karnataka");
		ResumeDto dto2 = new ResumeDto("Mr.Varun","Mr.Varunbodybuilder@gmail.com",9521469871L,"19th Sep 2001","BE","varun Vio",via2);
		AddressDto via3 = new AddressDto(4,"Housing Board","Hassan","Karnataka");
		ResumeDto dto3 = new ResumeDto("Mr.Shuheb","muhammedshuheb@gmail.com",8217650069L,"27th July 1995","BE","Abdul Rasheed",via3);
		dao.saveResume(dto);
		System.out.println("----------------------------------------------------------");
		dao.saveResume(dto1);
		System.out.println("----------------------------------------------------------");
		dao.saveResume(dto2);
		System.out.println("----------------------------------------------------------");
		dao.saveResume(dto3);
		System.out.println("----------------------------------------------------------");
		
		ResumeDto[] play = dao.readAll();
		for(int i = 0; i < play.length; i++) {
			if(play[i] != null) {
				System.out.println(play[i]);
			}
		}
		
		ResumeDto find = dao.findByName("Mr.Shuheb");
		System.out.println(find);
		
		ResumeDto finder = dao.findByEmail("Mr.Varunbodybuilder@gmail.com");
		System.out.println(finder);
		
		dao.updateDegreebyName("Mr.Ulaga", "Mechanical Engineering");
		dao.updatePhoneNumberByEmail("mr.kiranxworkx@gmail.com", 9865478256L);
		
		ResumeDto[] play1 = dao.readAll();
		for(int i = 0; i < play.length; i++) {
			if(play[i] != null) {
				System.out.println(play1[i]);
			}
		}
		
		
		boolean delete = dao.deleteByName("Mr.Varun");
		System.out.println(delete);
  
		ResumeDto[] play2 = dao.readAll();
		for(int i = 0; i < play.length; i++) {
			if(play[i] != null) {
				System.out.println(play2[i]);
			}
		}
		
		
		
    }

}
