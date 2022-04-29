package uabc.auditoria.controller;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/comentarios")
public class ComentariosController {
	
	@Autowired
	private JavaMailSender javaMailSender;

	
	@GetMapping("/formulario")
	public String buzon(Model model) {
		return "comentarios/formulario-comentarios";
	}
	
	@PostMapping("/enviar-mensaje")
	public String enviarMensaje(Model model,@RequestParam("nombre") String nombre, @RequestParam("correo") String correo, @RequestParam("comentarios") String comentarios, RedirectAttributes attribute) throws MessagingException, IOException {
	
		String mensajeCompleto;
		
		SimpleMailMessage msg = new SimpleMailMessage();
		
		//poner la dirección de destino a donde se enviará el correo
		msg.setTo("adan.gama@uabc.edu.mx");
		
		msg.setSubject("Se ha recibido un nuevo mensaje en el buzón de la página del Patronato Universitario");
		mensajeCompleto="Nombre: "+nombre+"\n"+"Correo: "+correo+"\n"+comentarios;
		System.out.print(mensajeCompleto);
		msg.setText(mensajeCompleto);
	
		try {
		javaMailSender.send(msg);
	    attribute.addFlashAttribute("success", "Mensaje Enviado");
		}
		catch(Exception ex) {
		attribute.addFlashAttribute("error", "Error al Enviar el mensaje");
	
		}
	
		

		return "redirect:/buzon";
	}
	
}
