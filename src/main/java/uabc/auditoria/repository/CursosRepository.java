package uabc.auditoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uabc.auditoria.model.Curso;

public interface CursosRepository extends JpaRepository<Curso, Integer> {

}
