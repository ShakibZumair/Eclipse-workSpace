package com.java.exception;

public class AgeInvalideException extends Exception {
String message;
public AgeInvalideException() {
	
}

public AgeInvalideException(String message) {
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
 