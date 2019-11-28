package com.manthan.exception.test;

public class Irctc {

	void confirm() {
		System.out.println("Confirm stated");

		try {
			System.out.println(10/2);
		}
		catch(ArithmeticException a) {
			System.out.println("confirm handling exception");
			throw(a);
			
		}
		finally {
			System.out.println("Confirm ended");
		}
	}
}
