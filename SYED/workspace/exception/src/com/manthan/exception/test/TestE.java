package com.manthan.exception.test;

import java.io.PrintStream;

public class TestE {

	public static void main(String[] args) {

		System.out.println("started");
		String name=null;
		int a[]=new int[3];
	
		try {
			System.out.println(a[5]);
			System.out.println(10/0);
			System.out.println("hi");
			System.out.println("have a good day");
			System.out.println(name.length());
		}
		catch(ArithmeticException aa) {
			System.out.println("AE exception");
		}
		catch(NullPointerException aa) {
			
			System.out.println("NPE exception");
		}
		catch(ArrayIndexOutOfBoundsException aa) {
			System.out.println("AIOOB exception");
		}
		catch(Exception aa) {
			System.out.println("exception");
		}
	}

}
