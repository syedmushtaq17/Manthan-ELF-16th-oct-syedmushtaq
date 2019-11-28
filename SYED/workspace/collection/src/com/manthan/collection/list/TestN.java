package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestN {
	public static void main(String[] args) {
		LinkedList <String> al=new LinkedList<String>();
		al.add("hello");
		al.add("how ");
		al.add("are u ");
		al.add("syed");
	
		Iterator<String> it=al.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
