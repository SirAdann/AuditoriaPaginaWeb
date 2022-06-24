package uabc.auditoria.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uabc.auditoria.model.Asistente;
import uabc.auditoria.repository.AsistentesRepository;
import uabc.auditoria.service.IAsistentesService;

@Service
public class AsistentesServiceJpa implements IAsistentesService {

	@Autowired
	AsistentesRepository asistentesRepo;
	
	@Override
	public List<Asistente> buscarAsistentesPorCurso(Integer idCurso) {
		// TODO Auto-generated method stub
		return asistentesRepo.findByCursoIdCurso(idCurso);
		}

	@Override
	public void Guardar(Asistente asistente) {
	asistentesRepo.save(asistente);
		
	}

	@Override
	public boolean eliminar(Integer idAsistente) {
		boolean bandera=false;
try {
	asistentesRepo.deleteById(idAsistente);
	bandera=true;
}catch (Exception e) {
	// TODO: handle exception
	bandera=false;
}

			
			return bandera;
		
	}

}
