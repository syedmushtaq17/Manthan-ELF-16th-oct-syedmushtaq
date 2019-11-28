package com.manthan.thread.test;

public class MyTask extends Thread{

	public void run() {

		for(int i=1;i<6;i++)
			System.out.println(i);
		super.run();
		
	}
	
}
