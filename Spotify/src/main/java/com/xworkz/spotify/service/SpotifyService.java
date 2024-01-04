package com.xworkz.spotify.service;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.spotify.dto.SpotifyDto;

public interface SpotifyService {
	
	public boolean validate(SpotifyDto dto , Model model);
	 
	public boolean saveSong(SpotifyDto dto, Model model);
	
	public List<SpotifyDto> read();
	
	public SpotifyDto findBySongName(String songName , Model model);
	
	public boolean updateRatingsBySongName(String songName , float ratings , Model model);
	
	public boolean deleteBySongName(String songName , Model model);

}
