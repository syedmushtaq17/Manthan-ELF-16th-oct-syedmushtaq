package com.manthan.set.test;

import java.util.PriorityQueue;

public class TestB {

	public static void main(String[] args) {

		PriorityQueue<Double> pq=new PriorityQueue<Double>();
		pq.add(53.0);
		pq.add(78.0);
		pq.add(10.0);
		pq.add(60.0);
		pq.add(66.0);
		pq.add(63.0);
// first weill be smaller one
	//rest all  unorder 		
		for(Double a:pq) {
			System.out.println(a);
		}
		
	}

}
