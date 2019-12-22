package com.trifulcas.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@Column(name = "idcategory")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcategory;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	
	public Category() {

	}

	public Category(String name) {
		super();
		this.name = name;
	}

	public int getIdcategory() {
		return idcategory;
	}

	public void setIdcategory(int idcategory) {
		this.idcategory = idcategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [idcategory=" + idcategory + ", name=" + name + ", description=" + description + "]";
	}

}
