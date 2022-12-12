package com.java.exception1;

public class ResultException extends RuntimeException{
	String msg;

	public ResultException(String msg) {

		super(msg);
	}
}
