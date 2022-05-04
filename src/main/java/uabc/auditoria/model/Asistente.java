package uabc.auditoria.model;

import java.util.Date;

public class Asistente {

	private Integer id;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombre;
	private String numEmpleado;
	private String correo;
	private String numContacto;
	private Curso curso;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNumContacto() {
		return numContacto;
	}
	public void setNumContacto(String numContacto) {
		this.numContacto = numContacto;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Asistente [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", correo=" + correo + ", numContacto="
				+ numContacto + ", curso=" + curso + "]";
	}



	
	
}
