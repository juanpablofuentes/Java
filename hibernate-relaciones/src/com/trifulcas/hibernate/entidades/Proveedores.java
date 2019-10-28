package com.trifulcas.hibernate.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedores {

	@Id
	@Column(name = "idproveedor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproveedor;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "nif")
	private String nif;

	@Column(name = "poblacion")
	private String poblacion;

		@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
				CascadeType.REFRESH }, fetch = FetchType.LAZY)
		@JoinTable(name = "producto_proveedor", 
		joinColumns = @JoinColumn(name="idproveedor"), 
		inverseJoinColumns = @JoinColumn(name="idproducto"))
		private List<Productos> productos;
	
		public List<Productos> getProductos() {
			return productos;
		}
	
		public void setProductos(List<Productos> productos) {
			this.productos = productos;
		}
	
		public void addProducto(Productos producto) {
			if (productos == null) {
				productos = new ArrayList<Productos>();
			}
			productos.add(producto);
	
		}

	public Proveedores() {

	}

	public Proveedores(String nombre, String nif, String poblacion) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.poblacion = poblacion;
	}

	public int getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Proveedores [idproveedor=" + idproveedor + ", nombre=" + nombre + ", nif=" + nif + ", poblacion="
				+ poblacion + "]";
	}

}
