package cl.aiep.certif.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cl.aiep.certif.dao.ICursosDAO;
import cl.aiep.certif.dao.dto.ContenidoDTO;
import cl.aiep.certif.dao.dto.CursoDTO;

@Service
public class CursoService {
	
	@Autowired
	ICursosDAO dao;
	
	public List<CursoDTO> obtenerCursos(){
		return dao.obtenerCursos();
	}
	
	public Page<CursoDTO> obtenerCursoPag(int pagina, int size){
		return  dao.obtenerCursosPaginados(pagina, size);
		 }
	
	public CursoDTO obtenerCurso(Integer id){
		return dao.obtenerCurso(id);
	}

	public void guardarCurso(CursoDTO curso) {
		dao.guardarCurso(curso);
		
	}

	public boolean guardarContenido(ContenidoDTO contenido) {
		return dao.guardarContenido(contenido);
		
	}

	public List<ContenidoDTO> obtenerContenidos(Integer id) {
		
		return dao.obtieneContenidos(id);
	}

	public void eliminarContenido(Integer id) {
		dao.eliminarContenido(id);
		
	}
	public void actualizarCurso(CursoDTO curso) {
		dao.actualizarCurso(curso);	
	}
	
	public void eliminarCurso(Integer id) {
		dao.eliminarCurso(id);
		
	}

	public boolean  obtieneCupos(Integer id) {
		return dao.tieneCupos(id);
		
	}

	public Page<CursoDTO> obtenerCursosPaginados(int i, int j) {
		return dao.obtenerCursosPaginados(i, j);
		
	}

}
