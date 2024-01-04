package com.xworkz.news.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.news.config.NewsConfig;
import com.xworkz.news.dto.NewsDto;

public class NewsRepoImpl implements NewsRepo {
	
	SessionFactory factory = NewsConfig.getSessionFactory();
	

	@Override
	public boolean save(NewsDto dto) {
		
		
		Session session = factory.openSession();
		
		Transaction transact = session.getTransaction();
		
		transact.begin();
		session.save(dto);
		transact.commit();
		session.close();
		
		return true;
	}

	@Override
	public NewsDto findById(int id) {
		
		Session session = factory.openSession();
		
		NewsDto dtos = session.get(NewsDto.class, id);
		return dtos;
		
		
	}

	@Override
	public List<NewsDto> readAll() {
		
		Session session = factory.openSession();
				
		Query<NewsDto> query = session.createQuery("from NewsDto",NewsDto.class);
		
		List<NewsDto> list = query.list();
		
		for (NewsDto newsDto : list) {
			System.out.println(newsDto);
		}	
		return list;
	}

	@Override
	public boolean update(int id) {
		
		Session session = factory.openSession();
		
		Transaction transact = session.getTransaction();
		transact.begin();
		
		NewsDto update = findById(id);
		
		session.update("NewsDto", update);
		
		return true;
	}

	@Override
	public boolean delete(int id) {
		
		Session session = factory.openSession();
		
		Transaction transact = session.getTransaction();
		transact.begin();
		
		NewsDto dto = findById(id);
		
		session.delete("NewsDto",dto);
		transact.commit();
		session.close();
		
		return true;
	}

}
