package uabc.auditoria.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uabc.auditoria.model.Curso;
import uabc.auditoria.model.Usuario;
import uabc.auditoria.service.IPerfilesService;
import uabc.auditoria.service.IUsuariosService;
import uabc.auditoria.service.db.UsuariosServiceJpa;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

	@Autowired
	IUsuariosService iserviceUsuario;
    
	@Autowired
	IPerfilesService iservicePerfil;
	
    @GetMapping("/listaUsuarios")
	public String mostrarIndex(Model model) {
			
			List<Usuario> listaUsuarios = new LinkedList<Usuario>();
			listaUsuarios= iserviceUsuario.buscarTodos();
			if(listaUsuarios.size()>0) {
				
				model.addAttribute("usuarios", listaUsuarios);

			}else {
				model.addAttribute("msg", "No hay ningún usuario registrado.");

			}
		//	model.addAttribute("cursos", serviceCursos.buscarTodos());    	
    	return "usuarios/listadoUsuarios";
	}
    
	@GetMapping("/create")
	public String crearUsuario(Usuario usuario) {
		return "usuarios/formUsuarios";}
	
    
    @GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idUsuario, RedirectAttributes attributes) {		    	
		
    	// Ejercicio.
    	
		return "redirect:/usuarios/index";
	}
    
	@ModelAttribute
	public void setGenericos(Model model) {
		model.addAttribute("perfiles", iservicePerfil.buscarTodos());
	}
}
