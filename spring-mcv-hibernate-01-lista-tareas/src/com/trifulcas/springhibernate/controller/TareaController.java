package com.trifulcas.springhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trifulcas.springhibernate.dao.ITareaDAO;
import com.trifulcas.springhibernate.entity.Tarea;

@Controller
@RequestMapping("/tarea")
public class TareaController {
	
	@Autowired
	private ITareaDAO tareaDAO;

	@RequestMapping("/lista")
	public String lista(Model modelo) {
		
		List<Tarea> tareas=tareaDAO.getTareas();
		
		modelo.addAttribute("tareas",tareas);
		return "lista-tareas";
	}
}
