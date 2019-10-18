package com.trifulcas.springprueba;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("verform")
	public String verFormulario() {
		return "formulario";
	}

	public String procesarFormulario() {
		return "saludo";
	}
	
	public String procesarConModelo(HttpServletRequest request, Model modelo) {
		String nombre=request.getParameter("nombre");
		nombre="Excelentísimo/a "+nombre;
		modelo.addAttribute("tratamiento", nombre);
		
		return "saludo";
	}
	
	@RequestMapping("procesarform")
	public String procesarConModeloYRequest(@RequestParam("nombre") String nombre, Model modelo) {
	
		nombre="Excelentísimo/a "+nombre;
		modelo.addAttribute("tratamiento", nombre);
		
		return "saludo";
	}
}
