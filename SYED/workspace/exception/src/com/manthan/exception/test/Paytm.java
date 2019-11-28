package com.manthan.exception.test;

public class Paytm {

	void book() {
		System.out.println("book started");
		
		Irctc i=new Irctc();
		try {
		i.confirm();
		}
		catch(ArithmeticException a) {
			System.out.println("book handling exception");
		}
		System.out.println("book ended");
	}
}
