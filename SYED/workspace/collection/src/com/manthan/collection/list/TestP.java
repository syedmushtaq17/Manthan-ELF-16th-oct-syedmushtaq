package com.manthan.collection.list;

import java.util.Vector;

public class TestP {

	public static void main(String[] args) {

		Vector al=new Vector();
		al.add(5);
		al.add("syed");
		al.add('f');
		al.add(5.4);
		
		for(int i=0;i<al.size();i++) {
			Object x= al.get(i);
			System.out.println(x);
		}
		for(Object r:al) {
			System.out.println(r);
		}
	}

}
