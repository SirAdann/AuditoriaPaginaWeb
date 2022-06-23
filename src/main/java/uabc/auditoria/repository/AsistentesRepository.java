package uabc.auditoria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import uabc.auditoria.model.Asistente;
import uabc.auditoria.model.Usuario;

public interface AsistentesRepository extends JpaRepository<Asistente, Integer> {
	List<Asistente> findByCurso(Integer idCurso);

}
