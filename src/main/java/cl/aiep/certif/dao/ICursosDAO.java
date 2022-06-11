package cl.aiep.certif.dao;

import java.util.List;

import org.springframework.data.domain.Page;

import cl.aiep.certif.dao.dto.ContenidoDTO;
import cl.aiep.certif.dao.dto.CursoDTO;

public interface ICursosDAO {
	
	public List<CursoDTO> obtenerCursos();
	public CursoDTO obtenerCurso(Integer id);
	public boolean guardarCurso(CursoDTO curso);
	public boolean actualizarCurso(CursoDTO curso);
	public boolean eliminarCurso(Integer id);
	public boolean tieneCupos(Integer id);
	public boolean guardarContenido(ContenidoDTO contenido);
	public boolean actualizarContenido(ContenidoDTO contenido);
	public boolean eliminarContenido(Integer id);
	public List<ContenidoDTO> obtieneContenidos(Integer id);
	public Page<CursoDTO> obtenerCursosPaginados(int pagina, int size);
	

}
