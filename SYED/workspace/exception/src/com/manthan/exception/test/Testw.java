package com.manthan.exception.test;

public class Testw {

	public static void main(String[] args) throws InvalidAgeException {

		System.out.println("Main started");
		AgeSimulator a=new AgeSimulator();

		try {
			a.verify(12);
		} catch ( Exception e) {//here if we write invalidAgeException  then we must use cath of Invalid Exception also 
			e.printStackTrace();
		}


		System.out.println("Main ended");
	}

}
