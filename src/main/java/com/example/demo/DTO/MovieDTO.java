package com.example.demo.DTO;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.example.demo.entities.Act;
import com.example.demo.entities.Actor;
import com.example.demo.entities.Category;
import com.example.demo.entities.Country;
import com.example.demo.entities.Director;
import com.example.demo.entities.Episodes;
import com.example.demo.entities.Modified;
import com.example.demo.entities.Movie;
import com.example.demo.utils.HibernateUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
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
	private String posterUrl;
	private String subDocquyen;
	private String chieurap;
	private String isCopyright;
	private Set<Category> categories = new HashSet<Category>(0);
	private Set<Country> countries = new HashSet<Country>(0);
	private Set<String> directors = new HashSet<String>(0);
	private Modified modifieds = new Modified();
	private Set<String> Act = new HashSet<String>(0);
//	private Set<Episodes> episodeses = new HashSet<Episodes>(0);
	
	public MovieDTO() {
	}

	public MovieDTO(String name, String originName, String content, String type, String status,
			String thumbUrl, String time, String episodeCurrent, String episodeTotal, String quality, int year,
			String trailerUrl, String lang, String notify, String showtimes, String slug, String posterUrl,
			String subDocquyen, String chieurap, String isCopyright, Set<Category> categories, Set<Country> countries,
			Set<String> directors, Modified modifieds, Set<String> act) {
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
		this.posterUrl = posterUrl;
		this.subDocquyen = subDocquyen;
		this.chieurap = chieurap;
		this.isCopyright = isCopyright;
		this.categories = categories;
		this.countries = countries;
		this.directors = directors;
		this.modifieds = modifieds;
		this.Act = act;
//		this.episodeses = episodeses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty(value = "origin_name")
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

	
	@JsonProperty(value = "thumb_url")
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

	@JsonProperty(value = "episode_current")
	public String getEpisodeCurrent() {
		return episodeCurrent;
	}

	public void setEpisodeCurrent(String episodeCurrent) {
		this.episodeCurrent = episodeCurrent;
	}

	@JsonProperty(value = "episode_total")
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
	
	@JsonProperty(value = "trailer_url")
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

	@JsonProperty(value = "is_copyright")
	public String getIsCopyright() {
		return isCopyright;
	}

	public void setIsCopyright(String isCopyright) {
		this.isCopyright = isCopyright;
	}

	@JsonProperty(value = "category")
	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	@JsonProperty(value = "country")
	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	@JsonProperty(value = "director")
	public Set<String> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<String> directors) {
		this.directors = directors;
	}
	@JsonProperty(value = "modified")
	public Modified getModifieds() {
		return modifieds;
	}
	
	public void setModifieds(Modified modifieds) {
		this.modifieds = modifieds;
	}

	@JsonProperty(value = "actor")
	public Set<String> getAct() {
		return Act;
	}

	public void setAct(Set<String> Act) {
		this.Act = Act;
	}

//	
//	public Set<Episodes> getEpisodeses() {
//		return episodeses;
//	}
//
//	public void setEpisodeses(Set<Episodes> episodeses) {
//		this.episodeses = episodeses;
//	}

	
	
	@JsonProperty(value = "poster_url")
	public String getPosterUrl() {
		return posterUrl;
	}

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}

	@JsonProperty(value = "sub_docquyen")
	public String getSubDocquyen() {
		return subDocquyen;
	}

	public void setSubDocquyen(String subDocquyen) {
		this.subDocquyen = subDocquyen;
	}

	@JsonProperty(value = "chieurap")
	public String getChieurap() {
		return chieurap;
	}

	public void setChieurap(String chieurap) {
		this.chieurap = chieurap;
	}
	
	public Movie toMovieEntity() {
		HashSet<Director> dirSet = new HashSet<Director>();
		if(directors.size()>0) {
			directors.forEach(e -> {
				Director newDi = new Director();
				newDi.setName(e);
				
				dirSet.add(newDi);
			});
		}
		
		HashSet<Act> actSet = new HashSet<Act>();
		if(Act.size()>0) {
			Act.forEach(e -> {
				Actor actor = new Actor();
				actor.setName(e);
				
				Act act = new Act();
				act.setActor(actor);
				act.setName("Minh");
				actSet.add(act);
			});
		}
		
		
		return Movie.builder()
				.name(name)
				.originName(originName)
				.episodeCurrent(episodeCurrent)
				.episodeTotal(episodeTotal)
				.content(content)
				.categories(categories)
				.acts(actSet)
				.countries(countries)
				.directors(dirSet)
				.isCopyright(isCopyright)
				.lang(lang)
				.modified(modifieds)
				.quality(quality)
				.showtimes(showtimes)
				.slug(slug)
				.trailerUrl(trailerUrl)
				.thumbUrl(thumbUrl)
//				.episodeses(episodeses)
				.notify(notify)
				.status(status)
				.type(type)
				.year(year)
				.time(time)	
				.posterUrl(posterUrl)
				.subDocquyen(subDocquyen)
				.chieurap(chieurap)
				.build();
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", originName=" + originName + ", content=" + content + ", type=" + type
				+ ", status=" + status + ", thumbUrl=" + thumbUrl + ", time=" + time + ", episodeCurrent="
				+ episodeCurrent + ", episodeTotal=" + episodeTotal + ", quality=" + quality + ", year=" + year
				+ ", trailerUrl=" + trailerUrl + ", lang=" + lang + ", notify=" + notify + ", showtimes=" + showtimes
				+ ", slug=" + slug + ", posterUrl=" + posterUrl + ", subDocquyen=" + subDocquyen + ", chieurap="
				+ chieurap + ", isCopyright=" + isCopyright + ", categories=" + categories + ", countries=" + countries
				+ ", directors=" + directors + ", modifieds=" + modifieds + ", Act=" + Act + "]";
	}

	



	
}
