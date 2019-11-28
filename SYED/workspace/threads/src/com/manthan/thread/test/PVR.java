package com.manthan.thread.test;

public class PVR {

	synchronized void confirm() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				if(i==0)
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void leave(){
		notify();
	}
	void st() {
		
	}
}
