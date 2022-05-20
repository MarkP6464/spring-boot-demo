package com.example.demo.DTO;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.entities.Episodes;
import com.example.demo.entities.Movie;
import com.example.demo.entities.Server;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class episodesDTO {
	private Set<Server> servers = new HashSet<Server>(0);
	private Set<Movie> movies = new HashSet<Movie>(0);
	
	public Episodes toEpisodes() {
		Episodes epi = new Episodes();
		epi.setMovies(this.getMovies());
		epi.setServers(this.getServers());
		return epi;
	}
}
