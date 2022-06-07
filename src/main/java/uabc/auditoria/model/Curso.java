package uabc.auditoria.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="cursos")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private String presentador;
	private Integer modalidad;
	private String plataforma;
	private String lugar;
	private String liga;
	private Integer estatus;
	private String detalle;
	private String imagen="no-image.png";

	public Integer getIdcurso() {
		return idCurso;
	}
	public void setIdcurso(Integer idcurso) {
		this.idCurso = idcurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getPresentador() {
		return presentador;
	}
	public void setPresentador(String presentador) {
		this.presentador = presentador;
	}
	public Integer getModalidad() {
		return modalidad;
	}
	public void setModalidad(Integer modalidad) {
		this.modalidad = modalidad;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getLiga() {
		return liga;
	}
	public void setLiga(String liga) {
		this.liga = liga;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", presentador=" + presentador + ", modalidad=" + modalidad + ", plataforma=" + plataforma
				+ ", lugar=" + lugar + ", liga=" + liga + ", estatus=" + estatus + ", detalle=" + detalle + ", imagen="
				+ imagen + "]";
	}



}
