package com.example.demo.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@RestController
@RequestMapping("")
@CrossOrigin
@ResponseBody
public class MovieController {
	@Autowired
	MovieService Mservice;
	
	@GetMapping("")
	public String hello() {
		return "Hello there!";
	}
	
	@GetMapping("movies")
	public List<Movie> movieList() {
		return Mservice.findAll();
	}
	
	@GetMapping("movie/{slug}")
	public Movie get(@PathVariable String slug) {
		return Mservice.findBySlug(slug);
	}
	
	
	@PostMapping("movie/add")
	public void addAMovie(@RequestBody MovieDTO movieDTO) {
		System.out.println(movieDTO.toString());
		Mservice.save(movieDTO.toMovieEntity());
	}
	
	
	
	@GetMapping("/search")
	public List<Movie> findByName(@RequestParam("name") String name){
		return Mservice.findByName(name);
	}
	
	@GetMapping("/sort")
	public List<Movie> filter(@RequestParam(required = false,value = "sortField") String sortField, @RequestParam(required = false,value = "type") String type, @RequestParam(required = false,value = "category") String category, @RequestParam(required = false,value = "country") String country, @RequestParam(required = false,value = "year") String year){
		List<Movie> movies = null;
		if(type.isEmpty()) {type = null;}
		if(category.isEmpty()) {category = null;}
		if(country.isEmpty()) {country = null;}
		if(year.isEmpty()) {year = null;}
		try {
			
			movies = Mservice.filter(sortField, type, category, country, year);
		} catch (NumberFormatException  e) {
			e.printStackTrace();
		}
		
		return movies;
	}
}
