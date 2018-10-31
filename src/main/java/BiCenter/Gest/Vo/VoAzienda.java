package BiCenter.Gest.Vo;

import org.omg.CORBA.PRIVATE_MEMBER;

public class VoAzienda {

	private Integer idAzienda;
	private String nome;
	private String piva;
	private String tel;
	private String referente;
	private String email;
	/**
	 * @param idAzienda
	 * @param nome
	 * @param piva
	 * @param tel
	 * @param referente
	 * @param email
	 */
	public VoAzienda(Integer idAzienda, String nome, String piva, String tel, String referente, String email) {
		super();
		this.idAzienda = idAzienda;
		this.nome = nome;
		this.piva = piva;
		this.tel = tel;
		this.referente = referente;
		this.email = email;
	}
	public VoAzienda() {
		// TODO Auto-generated constructor stub
	}
	public Integer getIdAzienda() {
		return idAzienda;
	}
	public void setIdAzienda(Integer idAzienda) {
		this.idAzienda = idAzienda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getReferente() {
		return referente;
	}
	public void setReferente(String referente) {
		this.referente = referente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
