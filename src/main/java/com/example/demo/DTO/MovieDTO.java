package com.example.demo.DTO;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.entities.Act;
import com.example.demo.entities.Category;
import com.example.demo.entities.Country;
import com.example.demo.entities.Director;
import com.example.demo.entities.Episodes;
import com.example.demo.entities.Modified;
import com.example.demo.entities.Movie;
import com.fasterxml.jackson.databind.node.ObjectNode;

import lombok.Builder;

@Builder
public class MovieDTO {
	private String name;
	private String originName;
	private String content;
	private String type;
	private String status;
	private String thumbUrl;
	private String time;
	private String episodeCurrent;
	private String episodeTotal;
	private String quality;
	private int year;
	private String trailerUrl;
	private String lang;
	private String notify;
	private String showtimes;
	private String slug;
	private String isCopyright;
	private Set<Category> categories = new HashSet<Category>(0);
	private Set<Country> countries = new HashSet<Country>(0);
	private Set<Director> directors = new HashSet<Director>(0);
	private Modified modifieds = new Modified();
	private Set<Act> Act = new HashSet<Act>(0);
	private Set<Episodes> episodeses = new HashSet<Episodes>(0);
	
	public MovieDTO() {
	}

	public MovieDTO(String name, String originName, String content, String type, String status, String thumbUrl,
			String time, String episodeCurrent, String episodeTotal, String quality, int year, String trailerUrl,
			String lang, String notify, String showtimes, String slug, String isCopyright, Set<Category> categories,
			Set<Country> countries, Set<Director> directors, Modified modifieds, Set<Act> Act,
			Set<Episodes> episodeses) {
		super();
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
		this.trailerUrl = trailerUrl;
		this.lang = lang;
		this.notify = notify;
		this.showtimes = showtimes;
		this.slug = slug;
		this.isCopyright = isCopyright;
		this.categories = categories;
		this.countries = countries;
		this.directors = directors;
		this.modifieds = modifieds;
		this.Act = Act;
		this.episodeses = episodeses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getEpisodeCurrent() {
		return episodeCurrent;
	}

	public void setEpisodeCurrent(String episodeCurrent) {
		this.episodeCurrent = episodeCurrent;
	}

	public String getEpisodeTotal() {
		return episodeTotal;
	}

	public void setEpisodeTotal(String episodeTotal) {
		this.episodeTotal = episodeTotal;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrailerUrl() {
		return trailerUrl;
	}

	public void setTrailerUrl(String trailerUrl) {
		this.trailerUrl = trailerUrl;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getNotify() {
		return notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	public String getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(String showtimes) {
		this.showtimes = showtimes;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getIsCopyright() {
		return isCopyright;
	}

	public void setIsCopyright(String isCopyright) {
		this.isCopyright = isCopyright;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public Set<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<Director> directors) {
		this.directors = directors;
	}

	public Modified getModifieds() {
		return modifieds;
	}

	public void setModifieds(Modified modifieds) {
		this.modifieds = modifieds;
	}

	public Set<Act> getAct() {
		return Act;
	}

	public void setAct(Set<Act> Act) {
		this.Act = Act;
	}

	public Set<Episodes> getEpisodeses() {
		return episodeses;
	}

	public void setEpisodeses(Set<Episodes> episodeses) {
		this.episodeses = episodeses;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", originName=" + originName + ", content=" + content + ", type=" + type
				+ ", status=" + status + ", thumbUrl=" + thumbUrl + ", time=" + time + ", episodeCurrent="
				+ episodeCurrent + ", episodeTotal=" + episodeTotal + ", quality=" + quality + ", year=" + year
				+ ", trailerUrl=" + trailerUrl + ", lang=" + lang + ", notify=" + notify + ", showtimes=" + showtimes
				+ ", slug=" + slug + ", isCopyright=" + isCopyright + ", categories=" + categories + ", countries="
				+ countries + ", directors=" + directors + ", modifieds=" + modifieds + ", Act=" + Act
				+ ", episodeses=" + episodeses + "]";
	}
	
	public MovieDTO convertToDTO(ObjectNode node) {
		MovieDTO movie = null;
		this.name = node.get("name").asText();
		this.originName = node.get("originName").asText();
		this.content = node.get("content").asText();
		this.type = node.get("type").asText();
		this.status = node.get("status").asText();
		this.thumbUrl = node.get("thumbUrl").asText();
		this.time = node.get("time").asText();
		this.episodeCurrent = node.get("episodeCurrent").asText();
		this.episodeTotal = node.get("episodeCurrent").asText();
		this.quality = node.get("quality").asText();
		this.year = node.get("year").asInt();
		this.trailerUrl = node.get("trailerUrl").asText();
		this.lang = node.get("lang").asText();
		this.notify = node.get("notify").asText();
		this.showtimes = node.get("showtimes").asText();
		this.slug = node.get("slug").asText();
		this.isCopyright = node.get("isCopyright").asText();
		if(!node.get("category").isEmpty()) {
			String category = node.get("category").asText().trim();
			String[] strParts = category.split(",");
		}
//		this.categories = node.get("categories").asText();
//		this.countries = node.get("originName").asText();
//		this.directors = node.get("originName").asText();
//		this.modifieds = node.get("originName").asText();
//		this.Act = node.get("originName").asText();
//		this.episodeses = node.get("originName").asText();
		
		return movie;
	}
	
	public Movie toMovieEntity() {
		return Movie.builder()
				.name(name)
				.originName(originName)
				.episodeCurrent(episodeCurrent)
				.episodeTotal(episodeTotal)
				.content(content)
				.categories(categories)
				.acts(Act)
				.countries(countries)
				.directors(directors)
				.isCopyright(isCopyright)
				.lang(lang)
				.modified(modifieds)
				.quality(quality)
				.showtimes(showtimes)
				.slug(slug)
				.trailerUrl(trailerUrl)
				.thumbUrl(thumbUrl)
				.episodeses(episodeses)
				.notify(notify)
				.status(status)
				.type(type)
				.year(year)
				.time(time)
				.build();
	}
}
