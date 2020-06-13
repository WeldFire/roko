package com.kendrick.angularspringboot.roko.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.net.URL;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="source_ref")
@NoArgsConstructor
@Setter
@Getter
public class SourceRef {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private URL url;
	private URL thumbnail;
	
	@JsonIgnore 
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Anime anime;
}
