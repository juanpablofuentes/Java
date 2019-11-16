package com.trifulcas.mavensecurity.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@Column(name = "idproduct")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproduct;

	@Column(name = "name")
	private String name;

	@Column(name = "stock")
	private int stock;

	@Column(name = "price")
	private BigDecimal price;

	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
			fetch=FetchType.LAZY)
	@JoinColumn(name="idcategory")
	private Category category;
	

	public Product() {

	}


	public Product(String name, int stock, BigDecimal price) {
		super();
		this.name = name;
		this.stock = stock;
		this.price = price;
	}


	public int getIdproduct() {
		return idproduct;
	}


	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [idproduct=" + idproduct + ", name=" + name + ", stock=" + stock + ", price=" + price
				+ ", category=" + category + "]";
	}



}
