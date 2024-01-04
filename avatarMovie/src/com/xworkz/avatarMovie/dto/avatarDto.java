package com.xworkz.avatarMovie.dto;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString

public class avatarDto {
	
	private int id;
	private String name;
	private String producer;
	private String director;
	private String actor;
	private String actress;
	
	public avatarDto(){
		super();
	}
	
	public avatarDto(int id, String name, String producer, String director, String actor, String actress) {
		super();
		this.id = id;
		this.name = name;
		this.producer = producer;
		this.director = director;
		this.actor = actor;
		this.actress = actress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	@Override
	public String toString() {
		return "avatarDto [id=" + id + ", name=" + name + ", producer=" + producer + ", director=" + director
				+ ", actor=" + actor + ", actress=" + actress + "]";
	}
	
	
	
	

}
