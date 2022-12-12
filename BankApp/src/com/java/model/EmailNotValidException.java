package com.java.model;

public class EmailNotValidException extends RuntimeException {
private String message;
public EmailNotValidException() {
	
}
public EmailNotValidException(String s) {
	super(s);
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
