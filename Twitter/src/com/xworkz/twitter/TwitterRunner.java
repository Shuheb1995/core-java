package com.xworkz.twitter;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.twitter.config.TwitterConfig;
import com.xworkz.twitter.dto.TwitterDto;

public class TwitterRunner {

	public static void main(String[] args) {
		
		SessionFactory factory = TwitterConfig.getSessionFactory();
		
		Session session = factory.openSession();
		
//		TwitterDto dto = new TwitterDto(1, "Shuheb", "shuheb@yahoomail.com", "general", "shu8748");
//		TwitterDto dto1 = new TwitterDto(2, "Varun", "Varun@gmail.com", "Celebrity", "Varun123");
    	TwitterDto dto2 = new TwitterDto(3, "Kiran", "KiranUlaga@gmail.com", "general", "KiranKishan");
//		TwitterDto dto3 = new TwitterDto(4, "Ulaga", "Varun@gmail.com", "Celebrity", "UlagaDrunken");
		
		Transaction transact = session.beginTransaction();
		
//		session.save(dto2);
//		session.save(dto3);
		
		
		session.update(dto2);
		
		Query query = session.createQuery("from TwitterDto",TwitterDto.class);
	
		List<TwitterDto> dtos = query.list();
		for (TwitterDto twitterDto : dtos) {
			System.out.println(twitterDto);
		}
		
		
		
		transact.commit();
		session.close();

	}

}
