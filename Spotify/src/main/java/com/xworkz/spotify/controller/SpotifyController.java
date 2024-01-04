package com.xworkz.spotify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.spotify.dto.SpotifyDto;
import com.xworkz.spotify.service.SpotifyService;

@Controller
public class SpotifyController {
	@Autowired
	private SpotifyService service;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String getSaveSong(SpotifyDto dto, Model model) {
		System.out.println(dto);

		boolean save = service.saveSong(dto, model);
		if (save) {
			model.addAttribute("save", dto);
			return "Success";

		} else {
			return "Add";
		}

	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(Model model) {

		List<SpotifyDto> dto = service.read();
		model.addAttribute("readDto", dto);
		return "Read";

	}

	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String find(@RequestParam String songName, Model model) {

		SpotifyDto dto = service.findBySongName(songName, model);
		model.addAttribute("song", dto);
		return "Read";
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String updateRatingsBySongName(@RequestParam String songName , @RequestParam float ratings , Model model) {
		boolean update = service.updateRatingsBySongName(songName, ratings, model);
		if(update) {
			model.addAttribute("ratings", "Ratings Updated");
			return "Update";
		}else {
			model.addAttribute("ratings", "Data is not updated");
			return "Update";
		}
	}
		
		@RequestMapping(value = "/delete" , method = RequestMethod.POST)
		public String deleteBySongName(@RequestParam String songName , Model model) {
			
			boolean delete =service.deleteBySongName(songName, model);
			if(delete) {
				model.addAttribute("delete", "Song Deleted");
				return "Update";
			}else {
				model.addAttribute("delete", "Song is not deleted");
				return "Update";
			}
			
		}
		
		


}
