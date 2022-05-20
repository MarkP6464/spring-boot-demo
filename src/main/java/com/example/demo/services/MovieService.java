package com.example.demo.services;

import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ActorRepo;
import com.example.demo.DAO.MovieRepo;
import com.example.demo.DAO.episodesRepo;
import com.example.demo.DAO.modifiedRepo;
import com.example.demo.entities.Episodes;
import com.example.demo.entities.Modified;
import com.example.demo.entities.Movie;
import com.example.demo.entities.Server;
import com.example.demo.utils.HibernateUtil;

@Service

public class MovieService{
	@Autowired
	MovieRepo repo;
	
	@Autowired
	ActorRepo actorRepo;
	
	@Autowired
	modifiedRepo modiRepo;
	
	@Autowired
	episodesRepo EpiRepo;
	
	
	public Movie get(UUID id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Movie result =  session.get(Movie.class, id);
        if (!result.getCountries().isEmpty()) {
			Hibernate.initialize(result.getCountries());
		}
        if (!result.getCategories().isEmpty()) {
			Hibernate.initialize(result.getCategories());
		}
        if (!result.getActs().isEmpty()) {
			Hibernate.initialize(result.getActs());
		}
        if (!result.getDirectors().isEmpty()) {
			Hibernate.initialize(result.getDirectors());
		}
        if (!result.getEpisodeses().isEmpty()) {
			Hibernate.initialize(result.getEpisodeses());
		}
        
        session.getTransaction().commit();
        session.close();
       
        return result;
        
	}
	
	public List<Movie> findByName(String name) {
		System.out.print(name);
		return repo.findByNameContains(name);
	}	
	
	public Movie findBySlug(String slug) {
		return repo.findBySlug(slug);
	}
	
	public List<Movie> findAll() {
		return repo.findAll();
	}

	
	public void save(Movie movie) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        movie.getModified().setMovie(movie);
        movie.getCountries().addAll(movie.getCountries());
        movie.getEpisodeses().addAll(movie.getEpisodeses());
        movie.getActs().addAll(movie.getActs());
        movie.getCategories().addAll(movie.getCategories());
        
        
        session.getTransaction().commit();
        session.close(); 
//		
//		Modified modi = movie.getModifieds();
//		System.out.println(modi);
//		modi.addMovie(movie);
//		movie.setModifieds(modi);
//		
//		Movie savedMovie = repo.save(movie);
//		Modified m = savedMovie.getModifieds();
//		m.setMovieId(savedMovie.getMovieId());
//		modiRepo.save(m);
	}


	
	
}
