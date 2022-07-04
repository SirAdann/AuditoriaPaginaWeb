package uabc.auditoria.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uabc.auditoria.repository.ImagenesCarrouselRepository;
import uabc.auditoria.service.IImagenesCarrouselService;


@Service
public class ImagenesCarrousel {
	
	@Autowired
	ImagenesCarrouselRepository imagenesCarrRepo;
	


}
