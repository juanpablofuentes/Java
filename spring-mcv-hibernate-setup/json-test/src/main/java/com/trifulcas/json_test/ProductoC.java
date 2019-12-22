package com.trifulcas.json_test;

public class ProductoC {

	private int id;
	private String nombre;
	private String referencia;
	private int precio;
	private Categoria categoria;
	private String[] zonas;
	
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String[] getZonas() {
		return zonas;
	}
	public void setZonas(String[] zonas) {
		this.zonas = zonas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
