package com.manthan.thread.test;

public class TestB {

	public static void main(String[] args) {

		
		MyTask t1=new MyTask();
		System.out.println("main statrted");
		t1.start();
		System.out.println("main ended");
	}

}
