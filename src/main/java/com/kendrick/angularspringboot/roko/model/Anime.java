package com.kendrick.angularspringboot.roko.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "anime")
//@EntityListeners(AnimeListener.class)
@NoArgsConstructor
@Getter
@Setter
public class Anime {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long tvdbId;
	private String name_english;
	private String name_japanese;
	private float rating;
	private int year;
	private int episodes;
	private String description;
	private int seasons;
	private String status;
	private String malUrl;
	private String malThumbnail;
	private String tvdbUrl;
	private String tvdbThumbnail;
	private int watchStatus;
	
	@JsonIgnore 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private AnimeSeries series;
	
	@OneToOne(mappedBy="anime", cascade = CascadeType.ALL)
	SourceRef sourceRefSet;

    

}































