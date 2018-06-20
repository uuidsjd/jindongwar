package com.test.action;

public class DifineException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DifineException(String message) {
		super();
		this.message = message;
	}

	public DifineException() {
		super();
	}
	
	
}
