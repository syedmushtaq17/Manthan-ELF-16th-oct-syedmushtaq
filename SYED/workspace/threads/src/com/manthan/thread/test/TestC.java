package com.manthan.thread.test;


public class TestC {

	public static void main(String[] args) {

		PVR p=new PVR();
		User t1=new User(p);
		t1.start();
		
	
		User t2=new User(p);
		t2.start();                                                                            
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		p.leave();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
