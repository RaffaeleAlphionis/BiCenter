package BiCenter.Gest.Vo;

public class VoDipendente {

	private String username;
	private String password;
	/**
	 * @param username
	 * @param password
	 */
	
	
	public VoDipendente(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public VoDipendente() {
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
