package uabc.auditoria.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import uabc.auditoria.model.Curso;
import uabc.auditoria.repository.CursosRepository;
import uabc.auditoria.service.ICursosService;

@Service
public class CursosServiceJpa implements ICursosService {
	
	@Autowired
	private CursosRepository cursosRepo;

	@Override
	public List<Curso> buscarTodos() {
		
		return cursosRepo.findAll();
	}

	@Override
	public Curso buscarPorId(Integer idCurso) {
		Optional<Curso> optional= cursosRepo.findById(idCurso);
		
		if (optional.isPresent()) {
			System.out.println("si existe");
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Curso curso) {
		cursosRepo.save(curso);

	}

	@Override
	public void borrarCurso(Curso curso) {
	
			cursosRepo.delete(curso);

		
		
	}

}
