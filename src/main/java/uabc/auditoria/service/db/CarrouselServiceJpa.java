package uabc.auditoria.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uabc.auditoria.model.Carrousel;
import uabc.auditoria.repository.CarrouselRepository;
import uabc.auditoria.service.ICarrouselService;

@Service
public class CarrouselServiceJpa implements ICarrouselService {

	@Autowired
	CarrouselRepository repoCarrousel;
	
	@Override
	public List<Carrousel> listarCarrouseles() {
		// TODO Auto-generated method stub
		return repoCarrousel.findAll();
	}

	@Override
	public void guardar(Carrousel carrousel) {
		repoCarrousel.save(carrousel);
		
	}

}
