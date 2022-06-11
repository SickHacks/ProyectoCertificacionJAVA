package cl.aiep.certif.dao.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class ContenidoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	@NotEmpty (message = "nombre no puede ser vacio")
	private String nombre;
	@NotEmpty (message = "detalle no puede ser vacio")
	private String detalle;
	
	private Integer idCurso;
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer curso) {
		this.idCurso = curso;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public ContenidoDTO(Integer id, String nombre, String detalle, Integer idCurso) {
		super();
		this.idCurso=idCurso;
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
	}
	public ContenidoDTO( String nombre, String detalle) {
		super();
		this.nombre = nombre;
		this.detalle = detalle;
	}
	public ContenidoDTO() {
		super();
	}
	
}
