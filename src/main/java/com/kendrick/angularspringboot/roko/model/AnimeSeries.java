package com.kendrick.angularspringboot.roko.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//Series contains multiple Anime (multiple "seasons")
//Ideally, this will be what is displayed on the home screen, not the individual seasons (ex Darker than black season 1 and season 2 showing up as separate results)
@Entity
@Table(name = "anime_series")
@NoArgsConstructor
@Getter
@Setter
public class AnimeSeries {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@OneToMany(mappedBy="series", cascade = CascadeType.ALL)
	private List<Anime> seasons;
	private String seriesName;
	private String malThumbnail;
	private int watchStatus;

	
	
}
