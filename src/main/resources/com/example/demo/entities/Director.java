package com.example.demo.entities;
// Generated Apr 20, 2022, 5:49:58 PM by Hibernate Tools 5.6.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Director generated by hbm2java
 */
public class Director implements java.io.Serializable {

	private int directorId;
	private String name;
	private Set movies = new HashSet(0);

	public Director() {
	}

	public Director(int directorId, String name) {
		this.directorId = directorId;
		this.name = name;
	}

	public Director(int directorId, String name, Set movies) {
		this.directorId = directorId;
		this.name = name;
		this.movies = movies;
	}

	public int getDirectorId() {
		return this.directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getMovies() {
		return this.movies;
	}

	public void setMovies(Set movies) {
		this.movies = movies;
	}

}
