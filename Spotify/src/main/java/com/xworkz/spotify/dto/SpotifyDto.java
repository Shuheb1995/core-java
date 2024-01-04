package com.xworkz.spotify.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "song")
@NamedQuery(name = "read" , query = "select dto from SpotifyDto dto")
@NamedQuery(name = "find" , query = "select dto from SpotifyDto dto where dto.songName=:snm")
@NamedQuery(name = "update" ,query = "update SpotifyDto dto set dto.ratings=:rt where dto.songName=:sn")
@NamedQuery(name = "delete" , query = "delete SpotifyDto dto where dto.songName=:sn")
public class SpotifyDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String songName;
	private String artistName;
	private float ratings;
	private String album;
	
	public SpotifyDto() {
		super();
	}
	
	public SpotifyDto(int id, String songName, String artistName, float ratings, String album) {
		super();
		this.id = id;
		this.songName = songName;
		this.artistName = artistName;
		this.ratings = ratings;
		this.album = album;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "SpotifyDto [id=" + id + ", songName=" + songName + ", artistName=" + artistName + ", ratings=" + ratings
				+ ", album=" + album + "]";
	}
	
	
	
	

}
