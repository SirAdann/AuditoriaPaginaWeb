package uabc.auditoria.service;

import java.util.List;

import uabc.auditoria.model.Perfil;

public interface IPerfilesService {

	List<Perfil> buscarTodos();
	void borrarPerfil(Integer idPerfil);
	void guardarPerfil(Perfil perfil);
	Perfil buscarPorId(Integer idPerfil);
}
