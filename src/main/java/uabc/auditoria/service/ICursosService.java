package uabc.auditoria.service;

import java.util.LinkedList;
import java.util.List;

import uabc.auditoria.model.Asistente;
import uabc.auditoria.model.Curso;

public interface ICursosService {

	List<Curso> buscarTodos();

	Curso buscarPorId(Integer idCurso);

	void guardar(Curso curso);

	boolean borrarCurso(Integer idCurso);

	void eliminar(Integer idCurso);
	
	List<Asistente> buscarAsistentesPorCurso(Integer idCurso);
}
