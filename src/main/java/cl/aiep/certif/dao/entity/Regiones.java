package cl.aiep.certif.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Regiones implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  id;
	@Column(nullable = false)
	private String sigla;
	@Column(nullable = false)
	private String detalle;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public Regiones(String sigla, String detalle) {
		super();
		this.sigla = sigla;
		this.detalle = detalle;
	}

	public Regiones() {
		// TODO Auto-generated constructor stub
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	

}
