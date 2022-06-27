package uabc.auditoria.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uabc.auditoria.model.Curso;

@Controller
@RequestMapping("/carrousel")
public class CarrouselController {

	
	@GetMapping("/listado")
	public String MostrarListado(Model model) {
	
		
	//List<Curso> lista = serviceCursos.buscarTodos();
	
	/*
	 * if(lista.size()>0) { System.out.println("hay cursos");
	 * model.addAttribute("cursos", lista);
	 * 
	 * }else { System.out.println("NO hay cursos"); model.addAttribute("msg",
	 * "No hay ningún curso disponible, consulte mas tarde o comuniquese al departamento de Auditoría Interna para mas Información."
	 * );
	 * 
	 * }
	 */
	//model.addAttribute("cursos", lista);
		return "carrousel/vistaCarrousel";
		}
}
