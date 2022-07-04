package uabc.auditoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uabc.auditoria.model.Asistente;
import uabc.auditoria.model.Carrousel;
import uabc.auditoria.model.Curso;
import uabc.auditoria.model.Perfil;
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
	  model.addAttribute("carrouseles", lista);
	  
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
	
	
	@PostMapping("/save")
	public String guardarPerfil(Carrousel carrousel, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrio un error: "+ error.getDefaultMessage());
			
			}			
			return "carrousel/formCarrousel";
		} 
		
		serviceCarrousel.guardar(carrousel);
		attributes.addFlashAttribute("msgregistro", "Registro Guardado");		
		//System.out.println("perfil: " + perfil);		
		return "redirect:/carrousel/listado";   
	}
	
	
	@GetMapping("/verImagenes/{}")
	public String MostrarListado(Model model,@PathVariable("id") int idCarrousel) {
	
		
	List<Carrousel> lista = serviceCarrousel.listarCarrouseles();
	
	
	  if(lista.size()>0) { 
	  model.addAttribute("carrouseles", lista);
	  
	  }else {  model.addAttribute("msg",
	  "No hay ningun carrousel disponible."
	  );
	  
	  }
	 
	//model.addAttribute("cursos", lista);
		return "carrousel/listadoCarrousel";
		}
}
