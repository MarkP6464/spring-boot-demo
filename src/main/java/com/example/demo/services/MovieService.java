package com.example.demo.services;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ActorRepo;
import com.example.demo.DAO.CategoryRepo;
import com.example.demo.DAO.CountryRepo;
import com.example.demo.DAO.MovieRepo;
import com.example.demo.DAO.episodesRepo;
import com.example.demo.DAO.modifiedRepo;
import com.example.demo.entities.Category;
import com.example.demo.entities.Country;
import com.example.demo.entities.Director;
import com.example.demo.entities.Episodes;
import com.example.demo.entities.Modified;
import com.example.demo.entities.Movie;
import com.example.demo.entities.Server;
import com.example.demo.utils.HibernateUtil;

@Service
public class MovieService {
	@Autowired
	MovieRepo repo;

	@Autowired
	ActorRepo actorRepo;

	@Autowired
	modifiedRepo modiRepo;

	@Autowired
	episodesRepo EpiRepo;

	@Autowired
	CategoryRepo cateRepo;

	@Autowired
	CountryRepo coRepo;

	public Movie get(UUID id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Movie result = session.get(Movie.class, id);
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

		session.getTransaction().commit();
		session.close();

		return result;

	}

	public List<Movie> findByName(String name) {
		System.out.print(name);
		return repo.findByNameContaining(name);
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

		movie.getDirectors().forEach(e -> {
			e.setMovie(movie);
		});

		movie.getActs().forEach(e -> {
			session.save(e.getActor());
			e.setMovie(movie);
		});

		Set<Movie> movies = new HashSet<Movie>();
		movies.add(movie);
		// null do categories bi thay doi vi tri trong collection. => tro toi null
//		movie.getCategories().forEach(e -> {
//			if (cateRepo.findByName(e.getName()) != null) {
//				Category cate = cateRepo.findByName(e.getName());
////				e.setCategoryId(cateRepo.findByName(e.getName()).getCategoryId());
////				cate.getMovies().clear();
//				movie.getCategories().remove(e);
//				movie.getCategories().add(cate);
//				cate.setMovies(movies);
//			} else {
//				e.setMovies(movies);
//			}
//		});

//		movie.getCountries().forEach(e -> {
//			if (coRepo.findByName(e.getName()) != null) {
////        		e.setCountryId(coRepo.findByName(e.getName()).getCountryId());
//				Country co = coRepo.findByName(e.getName());
////				co.getMovies().clear();
//				movie.getCountries().remove(e);
//				movie.getCountries().add(co);
//				co.setMovies(movies);
//			} else {
//				e.setMovies(movies);
//			}
//		});
		
		// thay vao do dung Iterator
		for (Iterator<Country> m = movie.getCountries().iterator(); m.hasNext();) {
			Country e = m.next();
			if (coRepo.findByName(e.getName()) != null) {
//        		e.setCountryId(coRepo.findByName(e.getName()).getCountryId());
				Country co = coRepo.findByName(e.getName());
//				co.getMovies().clear();
				m.remove();
				movie.getCountries().add(co);
				co.setMovies(movies);
			} else {
				e.setMovies(movies);
			}
		}
		
		for (Iterator<Category> m = movie.getCategories().iterator(); m.hasNext();) {
			Category e = m.next();
			if (cateRepo.findByName(e.getName()) != null) {
				Category cate = cateRepo.findByName(e.getName());
				e.setCategoryId(cate.getCategoryId());
			}
				e.setMovies(movies);
		}
		
		

		session.save(movie);

		session.getTransaction().commit();
		session.close();
	}

	public List<Movie> filter(String sortField, String type, String category, String country, String year) {
		
		return repo.filterByAll(year, type, category, country);
//		return repo.filterByAll(year, type, category, country, sortFields);
	}

}
