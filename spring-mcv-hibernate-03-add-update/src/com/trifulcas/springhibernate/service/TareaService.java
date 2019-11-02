package com.trifulcas.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trifulcas.springhibernate.dao.ITareaDAO;
import com.trifulcas.springhibernate.entity.Tarea;

@Service
public class TareaService implements ITareaService {

	@Autowired
	private ITareaDAO tareaDAO;
	
	@Override
	@Transactional
	public List<Tarea> getTareas() {
		
		return tareaDAO.getTareas();
	}

	@Override
	@Transactional
	public void save(Tarea tarea) {
		tareaDAO.save(tarea);
		
	}

	@Override
	@Transactional
	public Tarea getTarea(int idtarea) {
		
		return tareaDAO.getTarea(idtarea);
	}

}
