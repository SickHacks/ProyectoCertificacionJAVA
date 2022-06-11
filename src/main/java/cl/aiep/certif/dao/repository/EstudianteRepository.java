package cl.aiep.certif.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.aiep.certif.dao.entity.Curso;
import cl.aiep.certif.dao.entity.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String>{

	public List<Estudiante> findByCurso(Curso curso);
	
	public long countByCurso(Curso curso);
	
}
