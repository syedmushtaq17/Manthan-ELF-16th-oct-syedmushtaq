package com.manthan.exception.test;

public class ATMsimulator {

	void verify(int amt) {
		if(amt>40000) {
			DaylimitException d=new DaylimitException("plwease select amount under 40000");
			throw d;
		}
	}
}
