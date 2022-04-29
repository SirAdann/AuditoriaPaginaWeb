package uabc.auditoria.model;

import java.util.Date;

public class Curso {
	
	private int id;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private String presentador;
	private int modalidad;
	private String plataforma;
	private String lugar;
	private String liga;
	private int estatus;
	private String imagen="no-image.png";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getModalidad() {
		return modalidad;
	}
	public void setModalidad(int modalidad) {
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
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", presentador=" + presentador + ", modalidad=" + modalidad + ", plataforma=" + plataforma
				+ ", lugar=" + lugar + ", liga=" + liga + ", estatus=" + estatus + ", imagen=" + imagen + "]";
	}
	
	


}
