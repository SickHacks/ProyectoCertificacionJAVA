package cl.aiep.certif.dao.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column (nullable = false)
	private String nombre;
	@Column (nullable = false)
	private String imagen;
	@Column (nullable = false)
	private Date fecinicio;
	@Column (nullable = false)
	private Date fectermino;
	@Column (nullable = false)
	private Integer cupos;
	@Column (nullable = false, length = 400)
	private String descripcion;
	
	@OneToMany(mappedBy = "curso")
	private Set<Estudiante> estudiantes;
	
	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
	private Set<Contenido> contenido;
	
	
	public Set<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(Set<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public Set<Contenido> getContenido() {
		return contenido;
	}
	public void setContenido(Set<Contenido> contenido) {
		this.contenido = contenido;
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
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Date getFecinicio() {
		return fecinicio;
	}
	public void setFecinicio(Date fecinicio) {
		this.fecinicio = fecinicio;
	}
	public Date getFectermino() {
		return fectermino;
	}
	public void setFectermino(Date fectermino) {
		this.fectermino = fectermino;
	}
	public Integer getCupos() {
		return cupos;
	}
	public void setCupos(Integer cupos) {
		this.cupos = cupos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Curso() {
		super();
	}
	public Curso( String nombre, String imagen, Date fecinicio, Date fectermino, Integer cupos,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
		this.fecinicio = fecinicio;
		this.fectermino = fectermino;
		this.cupos = cupos;
		this.descripcion = descripcion;
	}
	public Curso( Integer id,String nombre, String imagen, Date fecinicio, Date fectermino, Integer cupos,
			String descripcion) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.imagen = imagen;
		this.fecinicio = fecinicio;
		this.fectermino = fectermino;
		this.cupos = cupos;
		this.descripcion = descripcion;
	}
	
	
	
}
