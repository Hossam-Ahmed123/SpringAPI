package com.mobileaders.starter.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tagsregion")
public class TagsRegion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TagsRegionId;
	
	

}