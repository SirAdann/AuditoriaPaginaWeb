package uabc.auditoria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrouseles")
public class Carrousel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCarrousel;
	private Integer activo;
	private String nombre;

	public Integer getIdCarrousel() {
		return idCarrousel;
	}

	public void setIdCarrousel(Integer idCarrousel) {
		this.idCarrousel = idCarrousel;
	}

	

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Carrousel [idCarrousel=" + idCarrousel + ", activo=" + activo + ", nombre=" + nombre + "]";
	}


}
