package uabc.auditoria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import uabc.auditoria.model.Carrousel;

public interface CarrouselRepository extends JpaRepository<Carrousel, Integer> {
	
	List<Carrousel> findAllByOrden(Integer orden);

}
