package com.manthan.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestR {
	public static void main(String[] args) {

		Vector al=new Vector();
		al.add(5);
		al.add("syed");
		al.add('f');
		al.add(5.4);
		
		ListIterator it=al.listIterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
