package uabc.auditoria.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import uabc.auditoria.model.ImagenesCarrousel;

public interface ImagenesCarrouselRepository extends JpaRepository<ImagenesCarrousel, Integer> {
	List<ImagenesCarrousel> findByCarrouselIdCarrousel(Integer idCarrousel);
	
	
	@Transactional
	  void deleteByCarrouselIdCarrousel(Integer idCarrousel);

}
