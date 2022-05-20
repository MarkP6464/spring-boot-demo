package com.example.demo.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.MovieDTO;
import com.example.demo.entities.Movie;
import com.example.demo.services.MovieService;

@RestController
@RequestMapping("")
@CrossOrigin("*")
@ResponseBody
public class MovieController {
	@Autowired
	MovieService Mservice;
	
	@GetMapping("/demo")
	public List<Movie> movieList() {
		return Mservice.findAll();
	}
	
	@GetMapping("/{slug}")
	public Movie get(@PathVariable String slug) {
		return Mservice.findBySlug(slug);
	}
	
	
	@PostMapping("/demo/add")
	public void addAMovie(@RequestBody MovieDTO movie) {
		System.out.println(movie.toString());
		Mservice.save(movie.toMovieEntity());
		
	}
	
	
	@GetMapping("/demo/search")
	public List<Movie> findByName(@RequestParam String name){
		return Mservice.findByName(name.trim());
	}
}
