package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestO {
	public static void main(String[] args) {
		LinkedList <String> al=new LinkedList<String>();
		al.add("hello");
		al.add("how ");
		al.add("are u ");
		al.add("syed");
	
		ListIterator<String> it=al.listIterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}
}
