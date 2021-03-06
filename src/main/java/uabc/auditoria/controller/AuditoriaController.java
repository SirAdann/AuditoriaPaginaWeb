package uabc.auditoria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auditoria")
public class AuditoriaController {
	
	@GetMapping("/facultades")
	public String MostrarFacultades(Model model) {
		return"auditoria/facultades";
	}
	
	@GetMapping("/departamentos")
	public String MostrarDepartamentos(Model model) {
		return"auditoria/departamentos";
	}
	@GetMapping("/organigrama")
	public String MostrarOrganigrama(Model model) {
		return"auditoria/organigrama";
	}
	
	@GetMapping("/declaracion-patrimonial")
	public String MostrarPaginaDeclaracion(Model model) {
		return"auditoria/declaracion-patrimonial2";
	}

	@GetMapping("/entrega-recepcion")
	public String MostrarPaginaEntregaRecep(Model model) {
		return"auditoria/entrega-recepcion";
	}
	@GetMapping("/opciones")
	public String mostrarOpciones() {
		
	
		return "auditoria/opciones";}



}
