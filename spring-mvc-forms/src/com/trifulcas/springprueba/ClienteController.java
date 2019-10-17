package com.trifulcas.springprueba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@RequestMapping("/form")
	public String verForm(Model modelo) {
		Cliente cliente=new Cliente();
		cliente.setNombre("pepe");
		modelo.addAttribute("cliente", cliente);
		return "form-cliente";
	}
	
	@RequestMapping("/procesar")
	public String procesarForm(@ModelAttribute("cliente") Cliente cliente) {
	
		return "ver-cliente";
	}
}
