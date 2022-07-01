package uabc.auditoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uabc.auditoria.model.Asistente;
import uabc.auditoria.model.Carrousel;
import uabc.auditoria.model.Curso;
import uabc.auditoria.service.ICarrouselService;

@Controller
@RequestMapping("/carrousel")
public class CarrouselController {
	
	@Autowired
	ICarrouselService serviceCarrousel;

	
	@GetMapping("/listado")
	public String MostrarListado(Model model) {
	
		
	List<Carrousel> lista = serviceCarrousel.listarCarrouseles();
	
	
	  if(lista.size()>0) { 
	  model.addAttribute("Carrouseles", lista);
	  
	  }else {  model.addAttribute("msg",
	  "No hay ningun carrousel disponible."
	  );
	  
	  }
	 
	//model.addAttribute("cursos", lista);
		return "carrousel/listadoCarrousel";
		}
	
	
	@GetMapping("/createCarrousel")
	public String nuevoRegistro( Carrousel carrousel) {		
	

		// Buscar los detalles de la vacante en la BD...		
		return "carrousel/formCarrousel";
	}
}
