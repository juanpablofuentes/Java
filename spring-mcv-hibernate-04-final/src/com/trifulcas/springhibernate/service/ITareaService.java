package com.trifulcas.springhibernate.service;

import java.util.List;

import com.trifulcas.springhibernate.entity.Tarea;

public interface ITareaService {
	List<Tarea> getTareas();

	void save(Tarea tarea);

	Tarea getTarea(int idtarea);

	void delete(Tarea idtarea);
}
