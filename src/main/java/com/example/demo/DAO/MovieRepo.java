package com.example.demo.DAO;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, UUID>{
	public List<Movie> findByNameContains(String name);
	
	public Movie findBySlug(String slug);
}
