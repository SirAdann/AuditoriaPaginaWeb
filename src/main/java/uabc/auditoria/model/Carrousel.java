package uabc.auditoria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrousel")
public class Carrousel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCarrousel;
	private String imagen = "no_image.jpg";
	private String url = "";
	private Integer orden;
	private Integer activo;

	public Integer getIdCarrousel() {
		return idCarrousel;
	}

	public void setIdCarrousel(Integer idCarrousel) {
		this.idCarrousel = idCarrousel;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Carrousel [idCarrousel=" + idCarrousel + ", imagen=" + imagen + ", url=" + url + ", orden=" + orden
				+ ", activo=" + activo + "]";
	}

}
