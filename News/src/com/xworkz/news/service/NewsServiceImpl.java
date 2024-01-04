package com.xworkz.news.service;

import java.util.List;

import com.xworkz.news.dto.NewsDto;
import com.xworkz.news.repo.NewsRepo;
import com.xworkz.news.repo.NewsRepoImpl;

import io.smallrye.config.SysPropConfigSource;


public class NewsServiceImpl implements NewsService {
	
	NewsRepo repo = new NewsRepoImpl();

	@Override
	public boolean save(NewsDto dto) {
		if(dto!=null) {
			if(dto.getId()>0) {
				if(dto.getNewsName()!=null & dto.getNewsName().length()>3) {
					if(dto.getNewsType()!=null) {
						System.out.println("Dto is valid");
						repo.save(dto);
						return true;
					}
					System.out.println("news name not is valid");
					return false;
				
				}
				System.out.println("Id is not valid");
				return false;
			}
			System.out.println("dto is not valid");
			return false;
		}
		return false;
	}

	@Override
	public NewsDto findById(int id) {
		if(id>0) {
			System.out.println("Id is Valid");
			return repo.findById(id);
		 
		}
		return null;
	}

	@Override
	public List<NewsDto> readAll() {
		return repo.readAll();
		 
	}

	@Override
	public boolean update(int id) {
		if(id>0) {
			System.out.print("id is valid for update");
		return repo.update(id);
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		
		if(id>0) {
			System.out.println("is is valid to Delete");
			return repo.delete(id);
		}
	   
		return false;
	}

}
