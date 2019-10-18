package com.trifulcas.springprueba;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.trifulcas.springprueba.validation.ValidarDni;


public class Cliente {

	@NotNull
	@Size(min = 2,message = "Debe introducir el nombre del cliente")
	private String nombre;
	@Pattern(regexp="[A-Z]{1}\\d{7}",message="NIF incorrecto")
	private String nif;
	@ValidarDni
	private String dni_admin;
	
	public String getDni_admin() {
		return dni_admin;
	}

	public void setDni_admin(String dni_admin) {
		this.dni_admin = dni_admin;
	}

	private String provincia;
	private String sector;
	private String[] pagos;

	@Min(value=100,message="Mínimo 100")
	@Max(value=100,message="Máximo 1000")
	private Integer credito;
	
	public Integer getCredito() {
		return credito;
	}

	public void setCredito(Integer credito) {
		this.credito = credito;
	}

	public String[] getPagos() {
		return pagos;
	}

	public void setPagos(String[] pagos) {
		this.pagos = pagos;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	private Map<String, String> listaProvincias;
	private Map<String, String> listaSectores;
	private Map<String, String> listaPagos;

	public Map<String, String> getListaPagos() {
		return listaPagos;
	}

	public Map<String, String> getListaSectores() {
		return listaSectores;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
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

	public Map<String, String> getListaProvincias() {
		return listaProvincias;
	}

	public Cliente() {
		super();
		listaProvincias = new LinkedHashMap<String, String>();
		listaProvincias.put("BCN", "Barcelona");
		listaProvincias.put("LLE", "Lleida");
		listaProvincias.put("GIR", "Girona");
		listaProvincias.put("TAR", "Tarragona");

		listaSectores = new LinkedHashMap<String, String>();
		listaSectores.put("Ganadería", "Ganadería");
		listaSectores.put("Agricultura", "Agricultura");
		listaSectores.put("Pesca", "Pesca");

		listaPagos = new LinkedHashMap<String, String>();
		listaPagos.put("Contado", "Contado");
		listaPagos.put("Tarjeta", "Tarjeta");
		listaPagos.put("Paypal", "Paypal");
	}

}
