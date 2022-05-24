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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.bytebuddy.asm.Advice.Return;
import uabc.auditoria.Util.Utileria;
import uabc.auditoria.model.Curso;
import uabc.auditoria.model.Perfil;
import uabc.auditoria.repository.PerfilesRepository;
import uabc.auditoria.service.CursosServiceImpl;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Value("${empleosapp.ruta.imagenes}")
	private String ruta;
	
	@Autowired
	private	CursosServiceImpl serviceCursos;
	
	@Autowired
	private PerfilesRepository repoPerfiles;
	
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
	
	@GetMapping("/cursos/listaPerfiles")
	public String mostrarListadoPerfiles(Model model) {
		model.addAttribute("cursos", serviceCursos.buscarTodos());
		crearPerfiles();
		System.out.println("Perfiles creados");
		return "admin/listadoCursos";}
	
	private void crearPerfiles() {
		
		repoPerfiles.saveAll(getPerfilesAplicacion());
		
		
	}
	
	private List <Perfil>getPerfilesAplicacion(){
		List<Perfil> lista= new LinkedList<Perfil>();
		Perfil per1= new Perfil();
		per1.setPerfil("SUPERVISOR");
		
		Perfil per2= new Perfil();
		per2.setPerfil("ADMINISTRADOR");
		
		Perfil per3= new Perfil();
		per3.setPerfil("USUARIO");
		
		
		lista.add(per1);
		lista.add(per2);
		lista.add(per3);
		return lista;
	}
	
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
}


