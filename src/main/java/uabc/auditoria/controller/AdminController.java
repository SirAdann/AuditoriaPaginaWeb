package uabc.auditoria.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uabc.auditoria.Util.Utileria;
import uabc.auditoria.model.Curso;
import uabc.auditoria.service.CursosServiceImpl;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Value("${empleosapp.ruta.imagenes}")
	private String ruta;
	
	@Autowired
	private	CursosServiceImpl serviceCursos;
	
	@GetMapping("/index")
	public String mostrarOpciones() {
		return "admin/opciones";}
	
	
	
	@GetMapping("/cursos/listaCursos")
	public String mostrarListadoCursos(Model model) {
		model.addAttribute("cursos", serviceCursos.buscarTodos());
		
		return "admin/listadoCursos";}
	
	@GetMapping("/cursos/create")
	public String crearCurso(Curso curso) {
		return "admin/formCurso";}
	
	@PostMapping("/cursos/save")
	public String guardarCurso(Curso curso, BindingResult result, RedirectAttributes attributes, @RequestParam("archivoImagen") MultipartFile multiPart) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrio un error: "+ error.getDefaultMessage());
			
			}			
			return "admin/formCurso";
		}
		
		if (!multiPart.isEmpty()) {
			//String ruta = "/empleos/img-vacantes/"; // Linux/MAC
			//String ruta = "c:/empleos/img-vacantes/"; // Windows
			String nombreImagen = Utileria.guardarArchivo(multiPart, ruta);
			if (nombreImagen != null){ // La imagen si se subio
			// Procesamos la variable nombreImagen
			curso.setImagen(nombreImagen);
			
			}}
		serviceCursos.guardar(curso);
		attributes.addFlashAttribute("msg", "Registro Guardado");		
		System.out.println("Curso: " + curso);		
		return "redirect:/admin/cursos/listaCursos";   
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
}


