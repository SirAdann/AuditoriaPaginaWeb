package uabc.auditoria.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "imagenescarrouseles")
public class ImagenesCarrousel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idImagenesCarrousel;
	private String imagen = "no_image.jpg";
	private String url = "";
	private Integer orden;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "idCarrousel", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  private Carrousel carrousel;
	
	
	public Integer getidImagenesCarrousel() {
		return idImagenesCarrousel;
	}
	public void setidImagenesCarrousel(Integer idImagenesCarrousel) {
		idImagenesCarrousel = idImagenesCarrousel;
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
	
	
	
	
	
}
