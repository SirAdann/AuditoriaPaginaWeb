package uabc.auditoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uabc.auditoria.model.Asistente;
import uabc.auditoria.model.Curso;
import uabc.auditoria.service.db.CursosServiceJpa;

@Controller
@RequestMapping("/asistentes")
public class AsistenteController {

	
	@Autowired
	private	CursosServiceJpa serviceCursos;
	
	//metodo para mostrar la vista del registro
	@GetMapping("/createAsistente/{id}")
	public String nuevoRegistro(Asistente asistente,@PathVariable("id") int idCurso, Model model) {		
		Curso curso = serviceCursos.buscarPorId(idCurso);	
		System.out.println("Curso: " + curso);
		model.addAttribute("cursoNombre", curso);
		model.addAttribute("cursos",serviceCursos.buscarTodos());
	

		// Buscar los detalles de la vacante en la BD...		
		return "cursos/registroAsistente";
	}
	
	
	//Metodo para guardar el registro del formulario
	@PostMapping("/saveAsistente/{id}")
	public String guardarRegistro(Asistente asistente, BindingResult result, RedirectAttributes attributes,@PathVariable("id") int idCurso) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrio un error: "+ error.getDefaultMessage());
			
			}			
			return "cursos/registroAsistente";
		}

	
	
	attributes.addFlashAttribute("msg", "Registro Guardado");		
	System.out.println("Asistente: " + asistente);		
	return "redirect:/cursos/createAsistente/"+idCurso;   
}
	
	
	//METODO PARA ASIGNAR DATOS DE MODELOS EN TODO EL CONTROLADOR
	@ModelAttribute
	public void setGenericos(Model model) {
		model.addAttribute("cursos", serviceCursos.buscarTodos());

	}
	
}
