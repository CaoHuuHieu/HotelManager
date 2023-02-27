package com.hotelmanager.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Utilities")
public class UtilitiesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String thumbnail;
	private String description;
	
	public UtilitiesEntity() {
		super();
	}
	
	public UtilitiesEntity(String name, String thumbnail, String description) {
		super();
		this.name = name;
		this.thumbnail = thumbnail;
		this.description = description;
	}

	public UtilitiesEntity(int id, String name, String thumbnail, String description) {
		super();
		this.id = id;
		this.name = name;
		this.thumbnail = thumbnail;
		this.description = description;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
