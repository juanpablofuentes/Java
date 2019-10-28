package com.trifulcas.hibernate.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categorias {

	@Id
	@Column(name = "idcategoria")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcategoria;

	@Column(name = "nombre")
	private String nombre;

	public Categorias() {

	}

	public Categorias(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categorias [idcategoria=" + idcategoria + ", nombre=" + nombre + "]";
	}

}
