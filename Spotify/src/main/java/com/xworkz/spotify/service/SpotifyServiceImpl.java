package com.xworkz.spotify.service;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.spotify.dto.SpotifyDto;
import com.xworkz.spotify.repo.SpotifyRepo;

@Service
public class SpotifyServiceImpl implements SpotifyService {

	@Autowired
	private SpotifyRepo repo;

	@Override
	public boolean validate(SpotifyDto dto, Model model) {
		boolean valid = true;
		if(dto!=null) {
			if(dto.getSongName()==null || dto.getSongName().length()<=2 ) {
				model.addAttribute("songName", "Song Name is invalid");
				valid = false;
			}
				
				if(dto.getArtistName()==null || dto.getArtistName().isEmpty()) {
					model.addAttribute("artistName", "Artist Name is invalid");
					valid = false;
				}
					
					if(dto.getRatings()<3) {
					model.addAttribute("ratings", "Ratings is invalid");
					valid = false;
					}
					
						if(dto.getAlbum()==null || dto.getAlbum().isEmpty()) {
						model.addAttribute("album", "Album is invalid");
						valid = false;
						}
				}else {
							System.out.println("Dto is valid , Ready to save");
							valid = false;
						}
						
						return valid;
				
				}

	@Override
	public boolean saveSong(SpotifyDto dto, Model model) {
		if (validate(dto, model)) {
			System.out.println("Dto is valid , Ready to save");
			return repo.saveSong(dto);
		}
		return false;
	}

	@Override
	public List<SpotifyDto> read() {
		
		return repo.read();
	}

	@Override
	public SpotifyDto findBySongName(String songName, Model model) {
		if(songName!=null && !songName.isEmpty()) {
			try {
				return repo.findBySongName(songName, model);
				
			} catch (NoResultException e) {
				model.addAttribute("name", "Song Name is not valid");
				return null;
			}
			
		}
		model.addAttribute("songs", "Song Name should not be empty");
		return null;
		
	}

	@Override
	public boolean updateRatingsBySongName(String songName, float ratings, Model model) {
		if(songName!=null && !songName.isEmpty()) {
			if(ratings>0) {
				System.out.println("Data is Valid , Ready for update");
				boolean update = repo.updateRatingsBySongName(songName,ratings,model);
				return update;
			}
			model.addAttribute("rate", "Ratings should not be Zero");
			System.out.println("Ratings should not be Zero");
			return false;
		}
		model.addAttribute("name", "Song Name is not valid");
		System.out.println("Song Name is not valid");
		return false;
	}

	@Override
	public boolean deleteBySongName(String songName, Model model) {
		if(songName!=null && !songName.isEmpty()) {
			System.out.println("Data Valid , Ready to delete");
			return repo.deleteBySongName(songName,model);
		}
		model.addAttribute("song", "Song Name is not valid");
		System.out.println("Song Name is not valid");
		return false;
	}

}
