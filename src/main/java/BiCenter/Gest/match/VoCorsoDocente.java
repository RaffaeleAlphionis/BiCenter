package BiCenter.Gest.match;

public class VoCorsoDocente {

	private Integer idDocente;
	private Integer idCorso;
	/**
	 * @param idDocente
	 * @param idCorso
	 */
	public VoCorsoDocente(Integer idDocente, Integer idCorso) {
		super();
		this.idDocente = idDocente;
		this.idCorso = idCorso;
	}
	public Integer getIdDocente() {
		return idDocente;
	}
	public void setIdDocente(Integer idDocente) {
		this.idDocente = idDocente;
	}
	public Integer getIdCorso() {
		return idCorso;
	}
	public void setIdCorso(Integer idCorso) {
		this.idCorso = idCorso;
	}
	
	
	
}
