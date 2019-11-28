package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestJ {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();
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
