package com.manthan.lambda;

public class TestA {

	public static void main(String[] args) {

		Pen p=(i,j)->i+j;
		int y=p.add(10,20);
		System.out.println(y);
	}

}
