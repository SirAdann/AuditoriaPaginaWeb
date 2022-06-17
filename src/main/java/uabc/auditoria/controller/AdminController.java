package uabc.auditoria.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

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

import net.bytebuddy.asm.Advice.Return;
import uabc.auditoria.Util.Utileria;
import uabc.auditoria.model.Curso;
import uabc.auditoria.model.Perfil;
import uabc.auditoria.model.Usuario;
import uabc.auditoria.repository.CursosRepository;
import uabc.auditoria.repository.PerfilesRepository;
import uabc.auditoria.repository.UsuariosRepository;
import uabc.auditoria.service.CursosServiceImpl;
import uabc.auditoria.service.db.CursosServiceJpa;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Value("${empleosapp.ruta.imagenes}")
	private String ruta;
	@Value("${empleosapp.ruta.videos}")
	private String rutaVideos;
	@Value("${empleosapp.ruta.materiales}")
	private String rutaMaterial;
	
	@Autowired
	private	CursosServiceJpa serviceCursos;
	
	
	/*
	 * 
	 * 
	 * @Autowired private PerfilesRepository repoPerfiles;
	 * 
	 * @Autowired private UsuariosRepository repoUsuarios; 
	 */
	@GetMapping("/index")
	public String mostrarOpciones() {
		
	
		return "admin/opciones";}
	
	
	
	@GetMapping("/cursos/listaCursos")
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
		
		return "admin/listadoCursos";}
	
	@GetMapping("/cursos/create")
	public String crearCurso(Curso curso) {
		return "admin/formCurso";}
	
	@PostMapping("/cursos/save")
	public String guardarCurso(Curso curso, BindingResult result, RedirectAttributes attributes, @RequestParam("archivoImagen") MultipartFile multiPart,@RequestParam("archivoVideo") MultipartFile multiPartVideo,@RequestParam("archivoMaterial") MultipartFile multiPartMaterial) {
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
	
		/*
		 * if (!multiPartVideo.isEmpty()) { //String ruta = "/empleos/img-vacantes/"; //
		 * Linux/MAC //String ruta = "c:/empleos/img-vacantes/"; // Windows String
		 * nombreVideo = Utileria.guardarArchivo(multiPartVideo, rutaVideos); if
		 * (nombreVideo != null){ // La imagen si se subio // Procesamos la variable
		 * nombreImagen curso.setVideo(nombreVideo);
		 * 
		 * }} if (!multiPartMaterial.isEmpty()) { //String ruta =
		 * "/empleos/img-vacantes/"; // Linux/MAC //String ruta =
		 * "c:/empleos/img-vacantes/"; // Windows String nombreMaterial=
		 * Utileria.guardarArchivo(multiPartMaterial, rutaMaterial); if (nombreMaterial
		 * != null){ // La imagen si se subio // Procesamos la variable nombreImagen
		 * curso.setVideo(nombreMaterial);
		 * 
		 * }}
		 */
		
		serviceCursos.guardar(curso);
		attributes.addFlashAttribute("msgregistro", "Registro Guardado");		
		System.out.println("Curso: " + curso);		
		return "redirect:/admin/cursos/listaCursos";   
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
		 
		
		return "redirect:/admin/cursos/listaCursos";   
		}
	
	
	
	@GetMapping("/Editar/{id}")
	public String EditarCurso(@PathVariable("id") int idCurso,RedirectAttributes attributes,Model model) {

		Curso curso = serviceCursos.buscarPorId(idCurso);	
		model.addAttribute("curso",curso);
		
		//System.out.println("Registro: "+ curso.getNombre());
		
		
	
		 
		
		return "/admin/formCurso";   
		}
	
	
	//segundo metodo para eliminar curso mandando id para el metodo jpa de borrado
	@GetMapping("/DeleteCurso/{id}")
	public String eliminar(@PathVariable("id") int idCurso, Model model,RedirectAttributes attributes) {
		System.out.println("Borrado de curso con id"+ idCurso);
		
		serviceCursos.eliminar(idCurso);
		return "redirect:/admin/cursos/listaCursos";
	}
	
	
	
	
	@GetMapping("/perfiles/listaPerfiles")
	public String mostrarListadoPerfiles(Model model) {
		model.addAttribute("cursos", serviceCursos.buscarTodos());
		//crearPerfiles();
		System.out.println("Perfiles creados");
		return "admin/listadoCursos";}
	
	
	
	@GetMapping("/usuarios/listaUsuarios")
	public String mostrarListadoUsuarios(Model model) {
		model.addAttribute("cursos", serviceCursos.buscarTodos());
		//crearUsuarioConDosPerfiles();
		return "admin/listadoCursos";}
	
	/*
	 * private void crearPerfiles() {
	 * 
	 * repoPerfiles.saveAll(getPerfilesAplicacion());
	 * 
	 * 
	 * }
	 */


	/*
	 * public void buscarUsuario() { Optional<Usuario>
	 * optional=repoUsuarios.findById(2);
	 * 
	 * if(optional.isPresent()) { Usuario u = optional.get();
	 * System.out.println("Usuario "+ u.getNombre());
	 * System.out.println("perfiles asignados");
	 * 
	 * for (Perfil p : u.getPerfiles()) { System.out.println(p.getPerfil());
	 * 
	 * } } }
	 */
	/*
	 * public void buscarUsuariosPorEstatus() { List<Usuario>
	 * listausuarios=repoUsuarios.findByEstatus(1); for (Usuario u: listausuarios) {
	 * 
	 * System.out.println("Nombre "+u.getNombre() +" Usuario: "+u.getUsername());
	 * for (Perfil p : u.getPerfiles()) { System.out.println(p.getPerfil());
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
}


