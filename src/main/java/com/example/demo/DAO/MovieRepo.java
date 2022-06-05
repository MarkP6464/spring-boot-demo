package com.example.demo.DAO;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, UUID>{
	public List<Movie> findByNameContaining(String name);
	
	public Movie findBySlug(String slug);
	
	public List<Movie> findByCategories(String category);
	//JPQL type
	@Query("SELECT mo FROM Movie mo WHERE mo.movieId IN"
			+ "(SELECT m.movieId FROM Movie m, Category ca WHERE (?1 is null or m.year = ?1) AND"
			+ " (?2 is null or m.type = ?2) AND "
			+ "(?3 is null or ca.name = ?3) AND m IN (elements(ca.movies))"
			+ " GROUP BY m.movieId)")
	
	// native query type
//	@Query(value = "SELECT * FROM movie m WHERE m.year = ?1 AND m.type = ?2 AND m.movie_id IN ("
//			+ "	SELECT be.movie_id FROM  belong be WHERE be.category_id IN ("
//			+ "		SELECT ca.category_id FROM category ca WHERE ca.name like %?3%))"
//			+ "	AND m.movie_id IN ("
//			+ "	SELECT ma.movie_id FROM  made_of ma WHERE ma.country_id IN ("
//			+ "		SELECT co.country_id FROM country co WHERE co.name like %?4%))"
//			+ "ORDER BY m.year desc",nativeQuery = true)
	public List<Movie> filterByAll(String year, String type, String category, String country);
	

	
}
