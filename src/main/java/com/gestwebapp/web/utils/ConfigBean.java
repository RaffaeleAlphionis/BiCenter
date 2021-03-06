package com.gestwebapp.web.utils;

/**
 * @author Alphionis
 * 
 * Classe per la propagazione dei parametri di connessione alla base dati.
 */
public class ConfigBean {

	private String databaseConnectionMethod;
	private String databaseDriver;
	private String databaseUrl;
	private String databaseUsername;
	private String databasePassword;
	private String contextJndiName;
	private String contextEnvironment;
	
	public String getDatabaseConnectionMethod() {
		return databaseConnectionMethod;
	}
	public void setDatabaseConnectionMethod(String databaseConnectionMethod) {
		this.databaseConnectionMethod = databaseConnectionMethod;
	}
	public String getDatabaseDriver() {
		return databaseDriver;
	}
	public void setDatabaseDriver(String databaseDriver) {
		this.databaseDriver = databaseDriver;
	}
	public String getDatabaseUrl() {
		return databaseUrl;
	}
	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}
	public String getDatabaseUsername() {
		return databaseUsername;
	}
	public void setDatabaseUsername(String databaseUsername) {
		this.databaseUsername = databaseUsername;
	}
	public String getDatabasePassword() {
		return databasePassword;
	}
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}
	public String getContextJndiName() {
		return contextJndiName;
	}
	public void setContextJndiName(String contextJndiName) {
		this.contextJndiName = contextJndiName;
	}
	public String getContextEnvironment() {
		return contextEnvironment;
	}
	public void setContextEnvironment(String contextEnvironment) {
		this.contextEnvironment = contextEnvironment;
	}


}
