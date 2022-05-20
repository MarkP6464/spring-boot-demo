package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.episodesDTO;
import com.example.demo.entities.Episodes;
import com.example.demo.services.episodesService;

@RestController
@RequestMapping("/demo")
@CrossOrigin("*")
@ResponseBody
public class EpisodesController {
	@Autowired
	episodesService epiService;
	
	@PostMapping("/add/episodes")
	public void addAMovie(@RequestBody episodesDTO eps) {
		System.out.println(eps.getServers());

		epiService.save(eps.toEpisodes());
		
	}

}
