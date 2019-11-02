package com.trifulcas.springhibernate.dao;

import java.util.List;

import com.trifulcas.springhibernate.entity.Tarea;

public interface ITareaDAO {
	
	List<Tarea> getTareas();

	void save(Tarea tarea);

	Tarea getTarea(int idtarea);
}
