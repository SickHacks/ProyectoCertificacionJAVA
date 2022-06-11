package cl.aiep.certif.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String rut;
	@Column (nullable = false)
	private String nombre;
	@Column (nullable = false)
	private String telefono;
	@Column (nullable = false)
	private String direccion;
	@Column (nullable = false)
	private String email;
	@Column (nullable = false)
	private Integer idRegion;
	@Column (nullable = false)
	private String password;
	@Column (nullable = false)
	private Integer enabled;
	@Column(nullable = false, insertable = false, updatable = false)
	private Integer idCurso;
	@ManyToOne
	@JoinColumn (name="idCurso")
	private Curso curso;
	
	@Column(nullable = false)
	private Integer edad;
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
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
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public Estudiante(String rut, String nombre, String telefono, String direccion, String email, Integer idRegion,
			String password, Integer enabled, Integer edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.idRegion = idRegion;
		this.password = password;
		this.enabled = enabled;
		this.edad= edad;
	}
	
	public Estudiante(String rut, String nombre, String telefono, String direccion, String email, Integer idRegion,
			String password, Integer enabled, Curso curso, Integer edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.idRegion = idRegion;
		this.password = password;
		this.enabled = enabled;
		this.curso = curso;
		this.edad=edad;
	}
	public Estudiante() {
		super();
	}
	
}
