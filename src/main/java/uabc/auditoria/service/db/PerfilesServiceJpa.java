package uabc.auditoria.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uabc.auditoria.model.Curso;
import uabc.auditoria.model.Perfil;
import uabc.auditoria.repository.PerfilesRepository;
import uabc.auditoria.service.IPerfilesService;

@Service
public class PerfilesServiceJpa implements IPerfilesService {

	@Autowired
	PerfilesRepository perfilRepo;
	
	@Override
	public List<Perfil> buscarTodos() {
		// TODO Auto-generated method stub
		return perfilRepo.findAll();
	}

	@Override
	public void borrarPerfil(Integer idPerfil) {
		perfilRepo.deleteById(idPerfil);
		
	}

	@Override
	public void guardarPerfil(Perfil perfil) {
		perfilRepo.save(perfil);
		
	}

	@Override
	public Perfil buscarPorId(Integer idPerfil) {
	Optional<Perfil> optional= perfilRepo.findById(idPerfil);
		
		if (optional.isPresent()) {
			System.out.println("si existe");
			return optional.get();
		}
		return null;
	}

}
