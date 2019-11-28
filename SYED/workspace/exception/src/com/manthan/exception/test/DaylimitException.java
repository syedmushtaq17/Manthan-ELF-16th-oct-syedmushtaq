package com.manthan.exception.test;

public class DaylimitException extends RuntimeException {

	String msg="sorry you crossed the daily limit";
	
	public DaylimitException() {
		
	}
	
	public DaylimitException(String msg) {
		this.msg = msg;
	}



	public String getMessage() {
		return msg;
	}
}
