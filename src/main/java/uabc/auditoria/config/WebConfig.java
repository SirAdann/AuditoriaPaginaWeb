package uabc.auditoria.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	
	@Value("${empleosapp.ruta.imagenes}")
	private String rutaImagenes;
	@Value("${empleosapp.ruta.videos}")
	private String rutaVideos;
	@Value("${empleosapp.ruta.materiales}")
	private String rutaMateriales;
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		//registry.addResourceHandler("/logos/**").addResourceLocations("file:/empleos/img-vacantes/"); // Linux
		//registry.addResourceHandler("/logos/**").addResourceLocations("file:c:/auditoriaWeb/img-cursos/"); // Windows
		registry.addResourceHandler("/logos/**").addResourceLocations("file:"+rutaImagenes); // Windows
		registry.addResourceHandler("/videos/**").addResourceLocations("file:"+rutaVideos); // Windows
		registry.addResourceHandler("/materiales/**").addResourceLocations("file:"+rutaMateriales); // Windows

	}

}
