package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.episodesRepo;
import com.example.demo.DTO.episodesDTO;
import com.example.demo.entities.Episodes;

@Service
public class episodesService {
	@Autowired
	episodesRepo epiRepo;

	@Autowired
	ServerService svService;

	public void save(Episodes eps) {

		eps.getServers().forEach(t -> {
			t.setEpisodes(eps);
			svService.saveForServerData(t);
		});
		epiRepo.save(eps);
	}
}
