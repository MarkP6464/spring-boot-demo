package com.example.demo.entities;
// Generated Apr 20, 2022, 5:49:58 PM by Hibernate Tools 5.6.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Movie generated by hbm2java
 */
public class Movie  {

	private Integer movieId;
	private String name;
	private String originName;
	private String content;
	private String type;
	private String status;
	private String thumbUrl;
	private int time;
	private int episodeCurrent;
	private int episodeTotal;
	private String quality;
	private int year;
	private Set countries = new HashSet(0);
	private Set categories = new HashSet(0);
	private Set episodeses = new HashSet(0);
	private Set actors = new HashSet(0);
	private Set directors = new HashSet(0);

	public Movie() {
	}

	public Movie(String name, String originName, String content, String type, String status, String thumbUrl, int time,
			int episodeCurrent, int episodeTotal, String quality, int year) {
		this.name = name;
		this.originName = originName;
		this.content = content;
		this.type = type;
		this.status = status;
		this.thumbUrl = thumbUrl;
		this.time = time;
		this.episodeCurrent = episodeCurrent;
		this.episodeTotal = episodeTotal;
		this.quality = quality;
		this.year = year;
	}

	public Movie(String name, String originName, String content, String type, String status, String thumbUrl, int time,
			int episodeCurrent, int episodeTotal, String quality, int year, Set countries, Set categories,
			Set episodeses, Set actors, Set directors) {
		this.name = name;
		this.originName = originName;
		this.content = content;
		this.type = type;
		this.status = status;
		this.thumbUrl = thumbUrl;
		this.time = time;
		this.episodeCurrent = episodeCurrent;
		this.episodeTotal = episodeTotal;
		this.quality = quality;
		this.year = year;
		this.countries = countries;
		this.categories = categories;
		this.episodeses = episodeses;
		this.actors = actors;
		this.directors = directors;
	}

	public Integer getMovieId() {
		return this.movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginName() {
		return this.originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getThumbUrl() {
		return this.thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getEpisodeCurrent() {
		return this.episodeCurrent;
	}

	public void setEpisodeCurrent(int episodeCurrent) {
		this.episodeCurrent = episodeCurrent;
	}

	public int getEpisodeTotal() {
		return this.episodeTotal;
	}

	public void setEpisodeTotal(int episodeTotal) {
		this.episodeTotal = episodeTotal;
	}

	public String getQuality() {
		return this.quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Set getCountries() {
		return this.countries;
	}

	public void setCountries(Set countries) {
		this.countries = countries;
	}

	public Set getCategories() {
		return this.categories;
	}

	public void setCategories(Set categories) {
		this.categories = categories;
	}

	public Set getEpisodeses() {
		return this.episodeses;
	}

	public void setEpisodeses(Set episodeses) {
		this.episodeses = episodeses;
	}

	public Set getActors() {
		return this.actors;
	}

	public void setActors(Set actors) {
		this.actors = actors;
	}

	public Set getDirectors() {
		return this.directors;
	}

	public void setDirectors(Set directors) {
		this.directors = directors;
	}

}
