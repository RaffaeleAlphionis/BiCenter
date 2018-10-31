package BiCenter.Gest.Vo;

public class VoDestinatario {

	private Integer idDest;
	private String nome;
	private String cognome;
	private String email;
	private String telefono;
	/**
	 * @param idDest
	 * @param nome
	 * @param cognome
	 * @param email
	 * @param telefono
	 */
	public VoDestinatario(Integer idDest, String nome, String cognome, String email, String telefono) {
		super();
		this.idDest = idDest;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
	}
	public VoDestinatario() {
		// TODO Auto-generated constructor stub
	}
	public Integer getIdDest() {
		return idDest;
	}
	public void setIdDest(Integer idDest) {
		this.idDest = idDest;
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
	
	
	
}
