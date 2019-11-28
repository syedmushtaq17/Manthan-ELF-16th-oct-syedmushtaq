package com.manthan.exception.test;

public class TestQ {

	public static void main(String[] args) {

		System.out.println("MaiN STARTED");
		ATMsimulator a=new ATMsimulator();
		try {
			a.verify(390000);
	}
	catch(DaylimitException e) {
		System.out.println(e.getMessage());		
		}
	 Exception d=new DaylimitException();
		
		System.out.println("Main ended");
	}

}
