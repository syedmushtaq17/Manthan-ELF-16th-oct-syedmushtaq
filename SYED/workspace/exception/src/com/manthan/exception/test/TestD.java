package com.manthan.exception.test;

public class TestD {

	public static void main(String[] args) {

		int a[]=new int[3];
		System.out.println("main started");
		try {
			System.out.println(a[1]);
		}
		catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("dont cross array limit i.e boundary");
		}
	
		System.out.println("main ended");
	}

}
