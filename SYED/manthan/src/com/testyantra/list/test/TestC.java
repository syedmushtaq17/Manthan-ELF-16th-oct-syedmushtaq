package com.testyantra.list.test;

import java.util.ArrayList;

public class TestC {

	public static void main(String[] args) {

		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.3);
		al.add(4.6);
		al.add(7.8);
		al.add(5.3);
		
		for(Double b:al) {
			System.out.println(al);
		}
	}

}
