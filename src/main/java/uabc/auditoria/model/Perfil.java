package uabc.auditoria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="perfiles")
public class Perfil {
	
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer idPerfil;
private String perfil;

public Integer getIdperfil() {
	return idPerfil;
}
public void setIdperfil(Integer idperfil) {
	this.idPerfil = idperfil;
}
public String getPerfil() {
	return perfil;
}
public void setPerfil(String perfil) {
	this.perfil = perfil;
}


}
