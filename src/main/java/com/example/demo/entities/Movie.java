package com.example.demo.entities;
// Generated May 22, 2022, 9:40:59 AM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Type;

import com.example.demo.DTO.MovieDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;

/**
 * Movie generated by hbm2java
 */
@Entity
@Builder
@Table(name = "movie", schema = "dbo", catalog = "FirstProject1", uniqueConstraints = {
		@UniqueConstraint(columnNames = "thumb_url"), @UniqueConstraint(columnNames = "slug"),
		@UniqueConstraint(columnNames = "name"), @UniqueConstraint(columnNames = "trailer_url"),
		@UniqueConstraint(columnNames = "poster_url"), @UniqueConstraint(columnNames = "origin_name") })
public class Movie  {

	private UUID movieId;
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
	private String posterUrl;
	private String subDocquyen;
	private String chieurap;
	private Modified modified;
	private Set<Category> categories = new HashSet<Category>(0);
	private Set<Country> countries = new HashSet<Country>(0);
//	private Set<Episodes> episodeses = new HashSet<Episodes>(0);
	private Set<Act> acts = new HashSet<Act>(0);
	private Set<Director> directors = new HashSet<Director>(0);

	public Movie() {
	}

	public Movie(UUID movieId, String name, String originName, String content, String type,
			String status, String thumbUrl, String time, String episodeCurrent, String episodeTotal, String quality,
			int year, String trailerUrl, String lang, String notify, String showtimes, String slug,
			String isCopyright, String posterUrl, String subDocquyen, String chieurap) {
		this.movieId = movieId;
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
		this.posterUrl = posterUrl;
		this.subDocquyen = subDocquyen;
		this.chieurap = chieurap;
	}

	public Movie(UUID movieId, String name, String originName, String content, String type,
			String status, String thumbUrl, String time, String episodeCurrent, String episodeTotal, String quality,
			int year, String trailerUrl, String lang, String notify, String showtimes, String slug,
			String isCopyright, String posterUrl, String subDocquyen, String chieurap, Modified modified,
			Set<Category> categories, Set<Country> countries, Set<Act> acts,
			Set<Director> directors) {
		this.movieId = movieId;
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
		this.posterUrl = posterUrl;
		this.subDocquyen = subDocquyen;
		this.chieurap = chieurap;
		this.modified = modified;
		this.categories = categories;
		this.countries = countries;
//		this.episodeses = episodeses;
		this.acts = acts;
		this.directors = directors;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Type(type = "org.hibernate.type.UUIDCharType")
	@Column(name = "movie_id", unique = true, nullable = false)
	public UUID getMovieId() {
		return this.movieId;
	}

	public void setMovieId(UUID movieId) {
		this.movieId = movieId;
	}

	@Column(name = "name", unique = true, nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@JsonProperty(value = "origin-name")
	@Column(name = "origin_name", unique = true, nullable = false)
	public String getOriginName() {
		return this.originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	@Column(name = "content", nullable = false)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "type", nullable = false, length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "status", nullable = false, length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@JsonProperty(value = "thumb_url")
	@Column(name = "thumb_url", unique = true, nullable = false, length = 200)
	public String getThumbUrl() {
		return this.thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	@Column(name = "time", nullable = false, length = 20)
	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	@JsonProperty(value = "episode_current")
	@Column(name = "episode_current", nullable = false, length = 50)
	public String getEpisodeCurrent() {
		return this.episodeCurrent;
	}

	public void setEpisodeCurrent(String episodeCurrent) {
		this.episodeCurrent = episodeCurrent;
	}

	@JsonProperty(value = "episode_total")
	@Column(name = "episode_total", nullable = false, length = 50)
	public String getEpisodeTotal() {
		return this.episodeTotal;
	}

	public void setEpisodeTotal(String episodeTotal) {
		this.episodeTotal = episodeTotal;
	}

	@Column(name = "quality", nullable = false, length = 20)
	public String getQuality() {
		return this.quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Column(name = "year", nullable = false)
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@JsonProperty(value = "trailer_url")
	@Column(name = "trailer_url", unique = true, nullable = false, length = 200)
	public String getTrailerUrl() {
		return this.trailerUrl;
	}

	public void setTrailerUrl(String trailerUrl) {
		this.trailerUrl = trailerUrl;
	}

	@Column(name = "lang", nullable = false, length = 20)
	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Column(name = "notify", nullable = false, length = 20)
	public String getNotify() {
		return this.notify;
	}

	public void setNotify(String notify) {
		this.notify = notify;
	}

	@Column(name = "showtimes", nullable = false)
	public String getShowtimes() {
		return this.showtimes;
	}

	public void setShowtimes(String showtimes) {
		this.showtimes = showtimes;
	}

	@Column(name = "slug", unique = true, nullable = false, length = 200)
	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}
	@JsonProperty(value = "is_copyright")
	@Column(name = "is_copyright", nullable = false, length = 20)
	public String getIsCopyright() {
		return this.isCopyright;
	}

	public void setIsCopyright(String isCopyright) {
		this.isCopyright = isCopyright;
	}
	@JsonProperty(value = "post_url")
	@Column(name = "poster_url", unique = true, nullable = false, length = 200)
	public String getPosterUrl() {
		return this.posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}
	@JsonProperty(value = "sub_docquyen")
	@Column(name = "sub_docquyen", nullable = false, length = 5)
	public String getSubDocquyen() {
		return this.subDocquyen;
	}

	public void setSubDocquyen(String subDocquyen) {
		this.subDocquyen = subDocquyen;
	}

	@Column(name = "chieurap", nullable = false, length = 5)
	public String getChieurap() {
		return this.chieurap;
	}

	public void setChieurap(String chieurap) {
		this.chieurap = chieurap;
	}

	@OneToOne(fetch = FetchType.EAGER, mappedBy = "movie",cascade = CascadeType.ALL)
	public Modified getModified() {
		return this.modified;
	}

	public void setModified(Modified modified) {
		this.modified = modified;
	}
	@JsonProperty(value = "category")
	@ManyToMany(fetch = FetchType.LAZY)
	@Cascade(value = {org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@JoinTable(name = "belong", schema = "dbo", catalog = "FirstProject1", joinColumns = {
			@JoinColumn(name = "movie_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "category_id", nullable = false, updatable = false) })
	public Set<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	@JsonProperty(value = "country")
	@ManyToMany(fetch = FetchType.LAZY)
	@Cascade(value = {org.hibernate.annotations.CascadeType.PERSIST, org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@JoinTable(name = "made_of", schema = "dbo", catalog = "FirstProject1", joinColumns = {
			@JoinColumn(name = "movie_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "country_id", nullable = false, updatable = false) })
	public Set<Country> getCountries() {
		return this.countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "connection", schema = "dbo", catalog = "FirstProject1", joinColumns = {
//			@JoinColumn(name = "movie_id", nullable = false, updatable = false) }, inverseJoinColumns = {
//					@JoinColumn(name = "episodes_id", nullable = false, updatable = false) })
//	public Set<Episodes> getEpisodeses() {
//		return this.episodeses;
//	}
//
//	public void setEpisodeses(Set<Episodes> episodeses) {
//		this.episodeses = episodeses;
//	}
	
	
	@JsonProperty(value = "actor")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id.movie", cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value = "movie")
	public Set<Act> getActs() {
		return this.acts;
	}

	public void setActs(Set<Act> acts) {
		this.acts = acts;
	}

	@JsonProperty(value = "director")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "movie", cascade = CascadeType.ALL)
	public Set<Director> getDirectors() {
		return this.directors;
	}

	public void setDirectors(Set<Director> directors) {
		this.directors = directors;
	}
	public MovieDTO toDto() {
		HashSet<String> actorSet = null;
		HashSet<String> directorSet = null;
		
		acts.forEach(e -> actorSet.add(e.getActor().getName().toString()));
		directors.forEach(e -> directorSet.add(e.getName().toString()));
		return MovieDTO.builder()
				.name(name)
				.originName(originName)
				.episodeCurrent(episodeCurrent)
				.episodeTotal(episodeTotal)
				.content(content)
				.categories(categories)
				.Act(actorSet)
				.countries(countries)
				.directors(directorSet)
				.isCopyright(isCopyright)
				.lang(lang)
				.modifieds(modified)
				.quality(quality)
				.showtimes(showtimes)
				.slug(slug)
				.trailerUrl(trailerUrl)
				.thumbUrl(thumbUrl)
				.notify(notify)
				.status(status)
				.type(type)
				.year(year)
				.time(time)
				.posterUrl(posterUrl)
				.chieurap(chieurap)
				.subDocquyen(subDocquyen)
				.build();
	}
	
	public void addModified(Modified modi) {
		modi.setMovie(this);
		this.setModified(modi);
	}
	
	public void addCategory(Category cate) {
		cate.getMovies().add(this);
	}

}
