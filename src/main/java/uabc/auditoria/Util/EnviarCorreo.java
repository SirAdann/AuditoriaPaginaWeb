package uabc.auditoria.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EnviarCorreo {

	@Autowired
	private JavaMailSender javaMailSender;
	
	void sendEmail() {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo("chatiyo_85@hotmail.com");
		
		msg.setSubject("Prueba");
		msg.setText("Hola Mundo \n Spring Boot Mail");
		
		javaMailSender.send(msg);
	}
}
