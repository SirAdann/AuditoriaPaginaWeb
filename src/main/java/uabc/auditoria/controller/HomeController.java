package uabc.auditoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uabc.auditoria.model.Usuario;
import uabc.auditoria.service.IUsuariosService;

@Controller
public class HomeController {
	
	@Autowired
   	private IUsuariosService serviceUsuarios;

	@GetMapping("/")
	public String inicio() {
		return "index";
	}
	
	@GetMapping("/signup")
	public String registrarse(Usuario usuario) {
		return "formRegistro";
	}
	
	@PostMapping("/signup")
	public String guardarRegistro(Usuario usuario, RedirectAttributes attributes) {

		// Ejercicio.
		
		return "redirect:/usuarios/index";
	}
	

}
