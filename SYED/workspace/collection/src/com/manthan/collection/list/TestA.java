package com.manthan.collection.list;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add('f');
		al.add(2.4);
		al.add("syed");
	
		for(int i=0;i<al.size();i++) {
			Object x= al.get(i);
			System.out.println(x);
		}
		for(Object r:al) {
			System.out.println(r);
		}
	}
}
