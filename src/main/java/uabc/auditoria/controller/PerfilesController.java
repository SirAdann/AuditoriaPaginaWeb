package uabc.auditoria.controller;

import java.util.LinkedList;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uabc.auditoria.Util.Utileria;
import uabc.auditoria.model.Curso;
import uabc.auditoria.model.Perfil;
import uabc.auditoria.model.Usuario;
import uabc.auditoria.service.IPerfilesService;


@Controller
@RequestMapping("/perfiles")
public class PerfilesController {
	@Autowired
	IPerfilesService servicePerfiles;
		
	
    @GetMapping("/listaPerfiles")
	public String mostrarIndex(Model model) {
    	
    
			List<Perfil> listaPerfiles = new LinkedList<Perfil>();
			listaPerfiles= servicePerfiles.buscarTodos();
			if(listaPerfiles.size()>0) {
				
				model.addAttribute("perfiles", listaPerfiles);

			}else {
				model.addAttribute("msg", "No hay ningún perfil registrado.");

			}
		//	model.addAttribute("cursos", serviceCursos.buscarTodos());    	
    	return "perfiles/listadoPerfiles";
	}
    
	@GetMapping("/create")
	public String crearPerfil(Perfil perfil) {
		return "perfiles/formPerfiles";}
	
	@PostMapping("/save")
	public String guardarPerfil(Perfil perfil, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrio un error: "+ error.getDefaultMessage());
			
			}			
			return "perfil/formPerfil";
		} 
		
	
		
		servicePerfiles.guardarPerfil(perfil);
		attributes.addFlashAttribute("msgregistro", "Registro Guardado");		
		System.out.println("perfil: " + perfil);		
		return "redirect:/perfiles/listaPerfiles";   
	}
	
	@GetMapping("/Editar/{id}")
	public String EditarPerfil(@PathVariable("id") int idPerfil,RedirectAttributes attributes,Model model) {

		Perfil perfil = servicePerfiles.buscarPorId(idPerfil);
		model.addAttribute("perfil",perfil);
		
		//System.out.println("Registro: "+ curso.getNombre());
		return "/perfiles/formPerfiles";   
		}
	
    @GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idPerfil, RedirectAttributes attributes) {		    	
		
    	
    	try {
    		servicePerfiles.borrarPerfil(idPerfil);
    		attributes.addFlashAttribute("msgborrado","Registro Borrado");
		} catch (Exception e) {
			attributes.addFlashAttribute("msgborrado", "El perfil no se puede borrar porque esta asociado a un usuario actualmente.");
		}
    	
    	
		/*
		 * if(servicePerfiles.borrarPerfil(idPerfil)==true) {
		 * System.out.println("Borrado con exito");
		 * attributes.addFlashAttribute("msgborrado","Registro Borrado");
		 * 
		 * }else { System.out.println("Error al borrar registro");
		 * attributes.addFlashAttribute("msgborrado", "Error al borrar registro");
		 * 
		 * }
		 */
    	
    	
    	
		return "redirect:/perfiles/listaPerfiles";
	}
	
}
