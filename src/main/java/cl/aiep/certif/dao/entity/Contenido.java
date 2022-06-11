package cl.aiep.certif.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contenido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (nullable = false)
	private String nombre;
	@Column (nullable = false)
	private String detalle;
	@Column(nullable = false, insertable = false, updatable = false)
	private Integer idCurso;
	
	@ManyToOne
	@JoinColumn (name="idCurso")
	private Curso curso;
	
	
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
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
	
	public Contenido() {
		super();
	}
	public Contenido(String nombre, String detalle, Curso curso) {
		super();
		this.curso= curso;
		this.nombre = nombre;
		this.detalle = detalle;
	}
	
	public Contenido(String nombre, String detalle, Integer idCurso) {
		super();
		this.idCurso= idCurso;
		this.nombre = nombre;
		this.detalle = detalle;
	}
	public Contenido(Integer id,String nombre, String detalle, Integer idCurso) {
		super();
		this.id=id;
		this.idCurso= idCurso;
		this.nombre = nombre;
		this.detalle = detalle;
	}
	
	
	
}
