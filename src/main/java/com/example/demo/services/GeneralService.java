package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Movie;

public interface GeneralService {

	List<Movie> findAll();
	
	Movie get(int id);
	

	void save(Movie movie);
}
