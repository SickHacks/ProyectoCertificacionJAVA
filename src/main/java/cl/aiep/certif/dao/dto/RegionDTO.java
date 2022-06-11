package cl.aiep.certif.dao.dto;

import java.io.Serializable;

public class RegionDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer  id;
	private String sigla;
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
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public RegionDTO(Integer id, String sigla, String detalle) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.detalle = detalle;
	}

	
}
