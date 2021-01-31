package com.mobileaders.starter.entities;

 
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sources")

public class Sources {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sourceid;

	private String sourceUrl;
	private String parentTage;
	@OneToMany(fetch = FetchType.LAZY,mappedBy="sources")
	private Set<Tags> tags ;
	public Sources() {
		// TODO Auto-generated constructor stub
	}
	public Set<Tags> getTags() {
		return tags;
	}
	public void setTags(Set<Tags> tags) {
		this.tags = tags;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public String getParentTage() {
		return parentTage;
	}
	public void setParentTage(String parentTage) {
		this.parentTage = parentTage;
	}
	

}
