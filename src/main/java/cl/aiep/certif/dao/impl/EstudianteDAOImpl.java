package cl.aiep.certif.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cl.aiep.certif.dao.IEstudianteDAO;
import cl.aiep.certif.dao.dto.CursoDTO;
import cl.aiep.certif.dao.dto.EstudianteDTO;
import cl.aiep.certif.dao.dto.RegionDTO;
import cl.aiep.certif.dao.entity.Authorities;
import cl.aiep.certif.dao.entity.Curso;
import cl.aiep.certif.dao.entity.Estudiante;
import cl.aiep.certif.dao.entity.Regiones;
import cl.aiep.certif.dao.repository.AuthorityRepository;
import cl.aiep.certif.dao.repository.CursoRepository;
import cl.aiep.certif.dao.repository.EstudianteRepository;
import cl.aiep.certif.dao.repository.RegionRepository;
import cl.aiep.certif.util.UtilBCEncrypt;

@Repository
public class EstudianteDAOImpl implements IEstudianteDAO{
	
	@Autowired
	EstudianteRepository repository;
	@Autowired
	AuthorityRepository authRepo;
	@Autowired
	CursoRepository cursRepo;
	@Autowired
	RegionRepository regionrepo;

	@Override
	public boolean agregaCursos(String rut, Integer idCurso) {
		boolean retorno=true;
		try {
		Estudiante est= repository.getById(rut);
		Curso cur= cursRepo.getById(idCurso);
		est.setCurso(cur);
		repository.save(est);
		}catch (Exception e) {
			retorno=false;
		}
		return retorno;
	}
	
	@Override
	public List<EstudianteDTO> obtenerEstudiantes() {
		List<EstudianteDTO> estDTO = new ArrayList<EstudianteDTO>();
		for(Estudiante est:repository.findAll() )
			  estDTO.add(new EstudianteDTO(est.getRut(), est.getNombre(), est.getTelefono(), 
					  est.getDireccion(), est.getEmail(), est.getIdRegion(), 
					  est.getPassword(), est.getEnabled(),est.getIdCurso(), est.getEdad()));
		return estDTO;
	}

	@Override
	public EstudianteDTO obtenerEstudiante(String rut) {
		Optional<Estudiante> optional= repository.findById(rut);
		Estudiante est= new Estudiante();
		if(optional.isPresent())est=optional.get();
		return new EstudianteDTO(est.getRut(), est.getNombre(), est.getTelefono(), 
				  est.getDireccion(), est.getEmail(), est.getIdRegion(), 
				  est.getPassword(), est.getEnabled(),est.getIdCurso(), est.getEdad());
	}

	@Override
	public boolean guardaEstudiante(EstudianteDTO est) {
		boolean retorno= true;
		try {
			authRepo.save(new Authorities("USER",est.getRut()));
			repository.save(new Estudiante(est.getRut(), est.getNombre(), est.getTelefono(), 
					  est.getDireccion(), est.getEmail(), est.getIdRegion(), 
					  UtilBCEncrypt.encripta(est.getPassword()), 1,cursRepo.getById(0), est.getEdad()));
			
			
		}catch (Exception e) {
			retorno= false;
		}
		
		return retorno;
	}
	
	@Override
	public List<RegionDTO> obtieneRegiones() {
		List<RegionDTO> retorno= new ArrayList<RegionDTO>();
		for(Regiones reg: regionrepo.findAll())
			retorno.add(new RegionDTO(reg.getId(), reg.getSigla(), reg.getDetalle()));
			
		return retorno;
	}

	@Override
	public boolean actualizaEstudiante(EstudianteDTO estudiante) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminaEstudiante(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CursoDTO obtieneCurso(String rut) {
		Curso cur= cursRepo.getById(repository.findById(rut).get().getIdCurso());
		CursoDTO retorno = new CursoDTO(cur.getId(), cur.getNombre(), cur.getImagen(), 
				cur.getFecinicio(), cur.getFectermino(), cur.getCupos(), cur.getDescripcion());
		return retorno;

	}

	

	

}
