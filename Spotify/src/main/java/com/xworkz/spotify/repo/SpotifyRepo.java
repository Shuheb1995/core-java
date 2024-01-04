package com.xworkz.spotify.repo;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SpotifyDto;

public interface SpotifyRepo {

	public boolean saveSong(SpotifyDto dto);
	
	public List<SpotifyDto> read();
	
	public SpotifyDto findBySongName(String songName , Model model);

	public boolean updateRatingsBySongName(String songName, float ratings, Model model);

	public boolean deleteBySongName(String songName, Model model);
}
