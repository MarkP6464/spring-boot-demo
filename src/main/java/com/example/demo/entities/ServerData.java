package com.example.demo.entities;
// Generated May 6, 2022, 8:01:05 PM by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ServerData generated by hbm2java
 */
@Entity
@Table(name = "server_data", schema = "dbo", catalog = "FirstProject")
public class ServerData implements java.io.Serializable {

	private Integer episodeId;
	private Server server;
	private String filename;
	private String linkEmbed;
	private String linkM3u8;
	private String name;
	private String slug;

	public ServerData() {
	}

	public ServerData(Server server, String filename, String linkEmbed, String linkM3u8, String name, String slug) {
		this.server = server;
		this.filename = filename;
		this.linkEmbed = linkEmbed;
		this.linkM3u8 = linkM3u8;
		this.name = name;
		this.slug = slug;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "episode_id", unique = true, nullable = false)
	public Integer getEpisodeId() {
		return this.episodeId;
	}

	public void setEpisodeId(Integer episodeId) {
		this.episodeId = episodeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "server_id", nullable = false)
	public Server getServer() {
		return this.server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	@Column(name = "filename", nullable = false, length = 100)
	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Column(name = "link_embed", nullable = false, length = 300)
	public String getLinkEmbed() {
		return this.linkEmbed;
	}

	public void setLinkEmbed(String linkEmbed) {
		this.linkEmbed = linkEmbed;
	}

	@Column(name = "link_m3u8", nullable = false, length = 300)
	public String getLinkM3u8() {
		return this.linkM3u8;
	}

	public void setLinkM3u8(String linkM3u8) {
		this.linkM3u8 = linkM3u8;
	}

	@Column(name = "name", nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "slug", nullable = false, length = 10)
	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	@Override
	public String toString() {
		return "ServerData [episodeId=" + episodeId + ", server=" + server + ", filename=" + filename + ", linkEmbed="
				+ linkEmbed + ", linkM3u8=" + linkM3u8 + ", name=" + name + ", slug=" + slug + "]";
	}
	

}
