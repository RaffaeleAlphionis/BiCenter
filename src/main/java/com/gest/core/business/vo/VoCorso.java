package com.gest.core.business.vo;

import java.sql.Date;

public class VoCorso {

	private Integer idCorso;
	private Integer idAula;
	private Integer idAzienda;
	private String descrizione;
	private Date dataInizio;
	private Date dataFine;
	/**
	 * @param idCorso
	 * @param idAula
	 * @param idAzienda
	 * @param idDocente
	 * @param descrizione
	 * @param dataInizio
	 * @param dataFine
	 */
	public VoCorso(Integer idCorso, Integer idAula, Integer idAzienda, Integer idDocente, String descrizione,
			Date dataInizio, Date dataFine) {
		super();
		this.idCorso = idCorso;
		this.idAula = idAula;
		this.idAzienda = idAzienda;
		this.descrizione = descrizione;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}
	public VoCorso() {
		// TODO Auto-generated constructor stub
	}
	public Integer getIdCorso() {
		return idCorso;
	}
	public void setIdCorso(Integer idCorso) {
		this.idCorso = idCorso;
	}
	public Integer getIdAula() {
		return idAula;
	}
	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}
	public Integer getIdAzienda() {
		return idAzienda;
	}
	public void setIdAzienda(Integer idAzienda) {
		this.idAzienda = idAzienda;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Date getDataFine() {
		return dataFine;
	}
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	
	
}
