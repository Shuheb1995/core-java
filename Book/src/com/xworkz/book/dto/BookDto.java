package com.xworkz.book.dto;

public class BookDto {
	
	private String name;
	private String author;
	private String story;
	private int pages;
	private int price;
	
	public BookDto(String name, String author, String story, int pages, int price) {
		super();
		this.name = name;
		this.author = author;
		this.story = story;
		this.pages = pages;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getStory() {
		return story;
	}


	public void setStory(String story) {
		this.story = story;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "BookDto [name=" + name + ", author=" + author + ", story=" + story + ", pages=" + pages + ", price="
				+ price + "]";
	}
	
	


	
	

}
