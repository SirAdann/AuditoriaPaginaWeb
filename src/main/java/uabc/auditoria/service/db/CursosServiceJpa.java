package uabc.auditoria.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import uabc.auditoria.model.Asistente;
import uabc.auditoria.model.Curso;
import uabc.auditoria.repository.AsistentesRepository;
import uabc.auditoria.repository.CursosRepository;
import uabc.auditoria.service.ICursosService;

@Service
public class CursosServiceJpa implements ICursosService {
	
	@Autowired
	private CursosRepository cursosRepo;
	
	@Autowired
	private AsistentesRepository asistentesRepo;

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

	
	//falta añadir el atrapado de una excepcion en especifico en caso de que no exista el id EmptyResultDataAccessException y cambiar el metodo de booleano a string para atraparlo en el controlador y mandar mensaje distinto
	@Override
	public boolean borrarCurso(Integer idCurso) {
		boolean bandera=false;
try {
	cursosRepo.deleteById(idCurso);
	bandera=true;
}catch (Exception e) {
	// TODO: handle exception
	bandera=false;
}

			
			return bandera;

		
		
	}

	@Override
	public void eliminar(Integer idCurso) {
		cursosRepo.deleteById(idCurso);
		
	}

}
