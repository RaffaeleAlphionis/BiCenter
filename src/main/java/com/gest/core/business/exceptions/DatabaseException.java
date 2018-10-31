package com.gest.core.business.exceptions;

public class DatabaseException extends Exception {

	private static final long serialVersionUID = 6986907427234845598L;

	@SuppressWarnings("unused")
	private String errorCode;
	
	public DatabaseException() {
	}

	public DatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DatabaseException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public DatabaseException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public DatabaseException(Throwable cause, String errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}

}
