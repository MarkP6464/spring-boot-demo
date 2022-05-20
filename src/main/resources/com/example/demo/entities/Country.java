package com.example.demo.entities;
// Generated Apr 20, 2022, 5:49:58 PM by Hibernate Tools 5.6.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Country generated by hbm2java
 */
public class Country implements java.io.Serializable {

	private int countryId;
	private String countryName;
	private Set movies = new HashSet(0);

	public Country() {
	}

	public Country(int countryId, String countryName) {
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public Country(int countryId, String countryName, Set movies) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.movies = movies;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set getMovies() {
		return this.movies;
	}

	public void setMovies(Set movies) {
		this.movies = movies;
	}

}
