package com.xworkz.news.service;

import java.util.List;

import com.xworkz.news.dto.NewsDto;

public interface NewsService {
	
	public boolean save(NewsDto dto);
	
	public NewsDto findById(int id);
	
	public List<NewsDto> readAll();
	
	public boolean update(int id);
	
	public boolean delete(int id);

}
