package com.java.exception;

public class AgeInvalide extends Exception {

	private String message;

	public AgeInvalide() {

	}

	public AgeInvalide(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
