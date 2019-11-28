package com.manthan.exception.test;

public class InvalidAgeException extends Exception {

String msg="YOu are too young";
	
	public InvalidAgeException() {
		
	}
	
	


	public String getMessage() {
		return msg;
	}
}

