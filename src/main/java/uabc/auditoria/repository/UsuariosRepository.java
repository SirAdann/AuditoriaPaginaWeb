package uabc.auditoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uabc.auditoria.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
