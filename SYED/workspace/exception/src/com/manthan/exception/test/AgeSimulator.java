package com.manthan.exception.test;

public class AgeSimulator {

	void verify(int amt) throws Exception {
		if(amt<18) {
			 
			Exception d=new InvalidAgeException();
			throw d;
		}
	}
}
