package com.gest.core.business.services;

public interface DbService<T> {

	public static final String TYPE_JDBC = "DM"; 
	public static final String TYPE_JPA = "DS"; 
	
	public T getDatabaseConnection() throws Exception;

	public void terminateServices();
}
