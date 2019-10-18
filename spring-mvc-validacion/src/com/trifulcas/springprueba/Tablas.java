package com.trifulcas.springprueba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tablas")
public class Tablas {

	@RequestMapping("distancias")
	public String distancias(Model modelo) {
		modelo.addAttribute("texto", "Lista de distancias");
		return "tablas";
	}
	
	@RequestMapping("precios")
	public String precios(Model modelo) {
		modelo.addAttribute("texto", "Lista de precios");
		return "tablas";
	}
}
