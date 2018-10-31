package com.gest.core.business.vo;

public class VoDocente {

	
	private Integer idDocente;
	private String nome;
	private String cognome;
	private String email;
	private String telefono;
	private String materia;
	/**
	 * @param idDocente
	 * @param nome
	 * @param cognome
	 * @param email
	 * @param telefono
	 * @param materia
	 */
	public VoDocente(Integer idDocente, String nome, String cognome, String email, String telefono, String materia) {
		super();
		this.idDocente = idDocente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
		this.materia = materia;
	}
	public VoDocente() {
		// TODO Auto-generated constructor stub
	}
	public Integer getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(Integer idDocente) {
		this.idDocente = idDocente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
}
