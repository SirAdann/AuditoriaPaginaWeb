package uabc.auditoria.service;

import java.util.List;

import uabc.auditoria.model.Asistente;

public interface IAsistentesService {

	List<Asistente> buscarAsistentesPorCurso(Integer idCurso);
	void Guardar(Asistente asistente);
	
	boolean eliminar(Integer idCurso);

}
