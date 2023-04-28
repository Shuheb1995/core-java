package com.xworkz.movies.dto;

public class MoviesDto {
	
	private String movieName;
	private String actor;
	private String actress;
	private String Villain;
	private String producer;
	private int earnings;
	
	public MoviesDto(String movieName, String actor, String actress, String villain, String producer, int earnings) {
		super();
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
		Villain = villain;
		this.producer = producer;
		this.earnings = earnings;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
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

	public String getVillain() {
		return Villain;
	}

	public void setVillain(String villain) {
		Villain = villain;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	@Override
	public String toString() {
		return "MoviesDto [movieName=" + movieName + ", actor=" + actor + ", actress=" + actress + ", Villain="
				+ Villain + ", producer=" + producer + ", earnings=" + earnings + "]";
	}
	
	

}
