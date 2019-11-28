package com.manthan.exception.test;

public class TestB {

	
	public static void main(String[] args) {
		System.out.println("main started ");
		
		try {
			String name =null;
			System.out.println(name.length());
		}
		catch (NullPointerException n) {
			System.out.println("Dont deal with 'null' kmsk");
		}
		System.out.println("Main ended");
	}
}
