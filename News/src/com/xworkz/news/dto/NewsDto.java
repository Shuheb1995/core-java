package com.xworkz.news.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "news_table")
@Entity

public class NewsDto {
	
	@Id
	private int id;
	private String newsName;
	private String newsType;
	private String language;
	private String heighlateNews;
	private String date;
	
	public NewsDto(){
		super();
	}
	
	public NewsDto(int id, String newsName, String newsType, String language, String heighlateNews, String date) {
		super();
		this.id = id;
		this.newsName = newsName;
		this.newsType = newsType;
		this.language = language;
		this.heighlateNews = heighlateNews;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNewsName() {
		return newsName;
	}
	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}
	public String getNewsType() {
		return newsType;
	}
	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getHeighlateNews() {
		return heighlateNews;
	}
	public void setHeighlateNews(String heighlateNews) {
		this.heighlateNews = heighlateNews;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "NewsDto [id=" + id + ", newsName=" + newsName + ", newsType=" + newsType + ", language=" + language
				+ ", heighlateNews=" + heighlateNews + ", date=" + date + "]";
	}
	
	
	

}
