package uabc.auditoria.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="usuarios")
public class Usuario {
	
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String username;
private String nombre;
private String apellidoPaterno;
private String apellidoMaterno;
private String correo;
private String password;
private Integer estatus;
private Date fechaRegistro;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(name="usuariosperfiles", joinColumns = @JoinColumn(name="idUsuario"),inverseJoinColumns = @JoinColumn(name="idPerfil") )
private List<Perfil> perfiles;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
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
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getEstatus() {
	return estatus;
}
public void setEstatus(Integer estatus) {
	this.estatus = estatus;
}
public Date getFechaRegistro() {
	return fechaRegistro;
}
public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
}

public List<Perfil> getPerfiles() {
	return perfiles;
}
public void setPerfiles(List<Perfil> perfiles) {
	this.perfiles = perfiles;
}


}
