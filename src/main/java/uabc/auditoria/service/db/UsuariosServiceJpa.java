package uabc.auditoria.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uabc.auditoria.model.Usuario;
import uabc.auditoria.repository.CursosRepository;
import uabc.auditoria.repository.UsuariosRepository;
import uabc.auditoria.service.IUsuariosService;

@Service
public class UsuariosServiceJpa implements IUsuariosService {

	@Autowired
	UsuariosRepository usuariosRepo;;
	
	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer idUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return usuariosRepo.findAll();
	}

}
