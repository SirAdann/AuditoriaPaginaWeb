package uabc.auditoria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uabc.auditoria.model.Curso;
import uabc.auditoria.service.CursosServiceImpl;

@Controller
@RequestMapping("/cursos")
public class CursosController {
	
	
	@Autowired
	private	CursosServiceImpl serviceCursos;
	
	@GetMapping("/listado")
	public String MostrarListado(Model model) {
	
		
	List<Curso> lista = serviceCursos.buscarTodos();
	model.addAttribute("cursos", lista);
		return "cursos/listadoCursos";
		}
	
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idCurso, Model model) {		
		Curso curso = serviceCursos.buscarPorId(idCurso);	
		System.out.println("Vacante: " + curso);
		model.addAttribute("curso", curso);
		
		// Buscar los detalles de la vacante en la BD...		
		return "cursos/detalleCurso";
	}
	

}
