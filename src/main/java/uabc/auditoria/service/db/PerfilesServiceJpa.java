package uabc.auditoria.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
