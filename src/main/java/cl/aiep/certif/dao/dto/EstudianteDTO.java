package cl.aiep.certif.dao.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class EstudianteDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty (message = "rut no puede ser vacio")
	//@Pattern (regexp = "^(\\d{1,9}{2}[\\dkK])$", message = "RUT invalido")
	private String rut;
	@NotEmpty (message = "nombre no puede ser vacio")
	private String nombre;
	@NotEmpty (message = "telefono no puede ser vacio")
	private String telefono;
	@NotEmpty (message = "direccion no puede ser vacio")
	private String direccion;
	
	@NotEmpty (message = "email no puede ser vacio")
	@Email (message = "email malo")
	private String email;
	@Min(value=1, message = "idRegion no puede ser vacio")
	private Integer idRegion;
	@NotEmpty (message = "password no puede ser vacio")
	private String password;
	private Integer enabled;
	
	private Integer idCurso;
	
	@Min(value = 18, message = "No puede ser menor de edad")
	@Max(value = 99, message = "No puede ser mayor de 99 años")
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
	
	
	public EstudianteDTO(String rut,String nombre,String telefono,String direccion, String email,
			Integer idRegion,String password,Integer enabled, Integer idCurso, Integer edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.idRegion = idRegion;
		this.password = password;
		this.enabled = enabled;
		this.idCurso=idCurso;
		this.edad= edad;
	}
	
	
	
	
	public EstudianteDTO() {
		super();
	}
}
