package com.gest.core.business.vo;

public class VoAula {
	
	private Integer idAula;
	private String descrizione;
	private int piano;
	private int posti;
	/**
	 * @param idAula
	 * @param descrizione
	 * @param piano
	 * @param posti
	 */
	public VoAula(Integer idAula, String descrizione, int piano, int posti) {
		super();
		this.idAula = idAula;
		this.descrizione = descrizione;
		this.piano = piano;
		this.posti = posti;
	}
	public VoAula() {
		// TODO Auto-generated constructor stub
	}
	public Integer getIdAula() {
		return idAula;
	}
	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getPiano() {
		return piano;
	}
	public void setPiano(int piano) {
		this.piano = piano;
	}
	public int getPosti() {
		return posti;
	}
	public void setPosti(int posti) {
		this.posti = posti;
	}

	
	
}
