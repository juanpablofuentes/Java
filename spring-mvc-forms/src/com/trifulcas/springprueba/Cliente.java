package com.trifulcas.springprueba;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cliente {
	private String nombre;
	private String nif;
	private String provincia;
	private String sector;
	private String[] pagos;

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



	private Map<String,String> listaProvincias;
	private Map<String,String> listaSectores;
	private Map<String,String> listaPagos;
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
		listaProvincias=new LinkedHashMap<String,String>();
		listaProvincias.put("BCN","Barcelona");
		listaProvincias.put("LLE","Lleida");
		listaProvincias.put("GIR","Girona");
		listaProvincias.put("TAR","Tarragona");
		
		listaSectores=new LinkedHashMap<String,String>();
		listaSectores.put("Ganadería", "Ganadería");
		listaSectores.put("Agricultura", "Agricultura");
		listaSectores.put("Pesca", "Pesca");
		
		listaPagos=new LinkedHashMap<String,String>();
		listaPagos.put("Contado", "Contado");
		listaPagos.put("Tarjeta", "Tarjeta");
		listaPagos.put("Paypal", "Paypal");
	}

}
