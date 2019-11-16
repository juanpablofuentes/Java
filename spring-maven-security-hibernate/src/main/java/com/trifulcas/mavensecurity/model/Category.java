package com.trifulcas.mavensecurity.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@Column(name = "idcategory")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcategory;

	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="category",
			cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Product> products;


	public void addProduct(Product producto) {
		if (products==null) {
			products=new ArrayList<Product>();
		}
		products.add(producto);
		producto.setCategory(this);
	}
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
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
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
