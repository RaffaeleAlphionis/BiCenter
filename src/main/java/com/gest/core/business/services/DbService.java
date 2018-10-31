package com.gest.core.business.services;

public interface DbService<T> {

	public static final int TYPE_JDBC = 1; 
	public static final int TYPE_JPA = 2; 
	
	public T getDatabaseConnection() throws Exception;

	public void terminateServices();
}
