package uabc.auditoria.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carrouseles")
public class Carrousel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCarrousel;
	private Integer estatus;
	private String nombre;



	public Integer getIdCarrousel() {
		return idCarrousel;
	}

	public void setIdCarrousel(Integer idCarrousel) {
		this.idCarrousel = idCarrousel;
	}

	


	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Carrousel [idCarrousel=" + idCarrousel + ", estatus=" + estatus + ", nombre=" + nombre + "]";
	}


}
