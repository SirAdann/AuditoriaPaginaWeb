package uabc.auditoria.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uabc.auditoria.Util.Utileria;
import uabc.auditoria.model.Asistente;
import uabc.auditoria.model.Curso;
import uabc.auditoria.service.CursosServiceImpl;
import uabc.auditoria.service.db.CursosServiceJpa;

@Controller
@RequestMapping("/cursos")
public class CursosController {

	@Value("${empleosapp.ruta.imagenes}")
	private String ruta;
	@Value("${empleosapp.ruta.videos}")
	private String rutaVideos;
	@Value("${empleosapp.ruta.materiales}")
	private String rutaMaterial;
	
	
	@Autowired
	private	CursosServiceJpa serviceCursos;
	
	
	//Metodo para enlistar cursos al visitante de la pagina
	@GetMapping("/listado")
	public String MostrarListado(Model model) {
	
		
	List<Curso> lista = serviceCursos.buscarTodos();
	
	if(lista.size()>0) {
		System.out.println("hay cursos");
		model.addAttribute("cursos", lista);

	}else {
		System.out.println("NO hay cursos");
		model.addAttribute("msg", "No hay ningún curso disponible, consulte mas tarde o comuniquese al departamento de Auditoría Interna para mas Información.");

	}
	//model.addAttribute("cursos", lista);
		return "cursos/vistaCursos";
		}
	
		//Metodo paraver el detalle del curso

	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idCurso, Model model) {		
		Curso curso = serviceCursos.buscarPorId(idCurso);	
		System.out.println("Curso: " + curso);
		model.addAttribute("curso", curso);
		
		// Buscar los detalles de la vacante en la BD...		
		return "cursos/detalleCurso";
	}
	
	
	
	//CRUD DE CURSOS
	
		//Enlista los cursos
		@GetMapping("/listaCursos")
		public String mostrarListadoCursos(Model model) {
			
			List<Curso> listaCursos = new LinkedList<Curso>();
			listaCursos= serviceCursos.buscarTodos();
			if(listaCursos.size()>0) {
				System.out.println("hay cursos");
				model.addAttribute("cursos", listaCursos);

			}else {
				System.out.println("NO hay cursos");
				model.addAttribute("msg", "No hay ningún curso registrado.");

			}
		//	model.addAttribute("cursos", serviceCursos.buscarTodos());
			
			return "cursos/listadoCursos";}
		
		
		
		//Llama el formulario de cursos para su llenado
		@GetMapping("/create")
		public String crearCurso(Curso curso) {
			return "cursos/formCurso";}
		
		
		//Guarda el registro del curso en la base de datos y envia los archivos correspondondientes
		@PostMapping("/save")
		public String guardarCurso(Curso curso, BindingResult result, RedirectAttributes attributes, @RequestParam("archivoImagen") MultipartFile multiPart,@RequestParam("archivoVideo") MultipartFile multiPartVideo,@RequestParam("archivoMaterial") MultipartFile multiPartMaterial) {
			if (result.hasErrors()) {
				for (ObjectError error: result.getAllErrors()){
					System.out.println("Ocurrio un error: "+ error.getDefaultMessage());
				
				}			
				return "cursos/formCurso";
			} 
			
			if (!multiPart.isEmpty()) {
				//String ruta = "/empleos/img-vacantes/"; // Linux/MAC
				//String ruta = "c:/empleos/img-vacantes/"; // Windows
				String nombreImagen = Utileria.guardarArchivo(multiPart, ruta);
				if (nombreImagen != null){ // La imagen si se subio
				// Procesamos la variable nombreImagen
				curso.setImagen(nombreImagen);
				
				}}
			
			if (!multiPartVideo.isEmpty()) {
				//String ruta = "/empleos/img-vacantes/"; // Linux/MAC
				//String ruta = "c:/empleos/img-vacantes/"; // Windows
				String nombreVideo = Utileria.guardarArchivo(multiPartVideo, rutaVideos);
				if (nombreVideo != null){ // La imagen si se subio
				// Procesamos la variable nombreImagen
				curso.setVideo(nombreVideo);
				
				}}
			if (!multiPartMaterial.isEmpty()) {
				//String ruta = "/empleos/img-vacantes/"; // Linux/MAC
				//String ruta = "c:/empleos/img-vacantes/"; // Windows
				String nombreMaterial = Utileria.guardarArchivo(multiPartMaterial, rutaMaterial);
				if (nombreMaterial != null){ // La imagen si se subio
				// Procesamos la variable nombreImagen
				curso.setMaterial(nombreMaterial);
				
				}}
		

			
			serviceCursos.guardar(curso);
			attributes.addFlashAttribute("msgregistro", "Registro Guardado");		
			System.out.println("Curso: " + curso);		
			return "redirect:/cursos/listaCursos";   
		}
		
		
		//metodo para eliminar curso mandando todo el objeto al metodo jpa de borrado
		/*
		 * @GetMapping("/EliminarCurso/{id}") public String
		 * EliminarCurso(@PathVariable("id") int idCurso,RedirectAttributes attributes)
		 * {
		 * 
		 * Curso curso = serviceCursos.buscarPorId(idCurso);
		 * 
		 * System.out.println("Registro: "+ curso.getNombre());
		 * 
		 * serviceCursos.borrarCurso(curso);
		 * 
		 * 
		 * if(serviceCursos.borrarCurso(curso)==true) {
		 * System.out.println("Borrado con exito");
		 * attributes.addFlashAttribute("msgborrado","Registro Borrado");
		 * 
		 * }else { System.out.println("Error al borrar registro");
		 * attributes.addFlashAttribute("msgborrado", "Error al borrar registro");
		 * 
		 * }
		 * 
		 * 
		 * return "redirect:/admin/cursos/listaCursos"; }
		 */
		
		
		
		//Elimina un curso
		@GetMapping("/EliminarCurso/{id}")
		public String EliminarCurso(@PathVariable("id") int idCurso,RedirectAttributes attributes) {

			//Curso curso = serviceCursos.buscarPorId(idCurso);	
			
			//System.out.println("Registro: "+ curso.getNombre());
			
			
			
			  if(serviceCursos.borrarCurso(idCurso)==true) {
			  System.out.println("Borrado con exito");
			  attributes.addFlashAttribute("msgborrado","Registro Borrado");
			  
			  }else { System.out.println("Error al borrar registro");
			  attributes.addFlashAttribute("msgborrado", "Error al borrar registro");
			  
			  }
			 
			
			return "redirect:/cursos/listaCursos";   
			}
		
		
		//Abre el formulario para editar el curso
		@GetMapping("/Editar/{id}")
		public String EditarCurso(@PathVariable("id") int idCurso,RedirectAttributes attributes,Model model) {

			Curso curso = serviceCursos.buscarPorId(idCurso);	
			model.addAttribute("curso",curso);
			
			//System.out.println("Registro: "+ curso.getNombre());
			return "/cursos/formCurso";   
			}
		
		
		@InitBinder
		public void initBinder(WebDataBinder webDataBinder) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
		}
		
		
	

	
}
