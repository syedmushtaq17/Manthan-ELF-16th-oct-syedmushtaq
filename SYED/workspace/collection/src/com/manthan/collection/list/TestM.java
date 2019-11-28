package com.manthan.collection.list;

import java.util.LinkedList;

public class TestM {
	public static void main(String[] args) {
		LinkedList <String> al=new LinkedList();
		al.add("hello");
		al.add("how ");
		al.add("are u ");
		al.add("syed");
	
		for(int i=0;i<al.size();i++) {
			String x= al.get(i);
			System.out.println(x);
		}
		for(String r:al) {
			System.out.println(r);
		}
	}
}
