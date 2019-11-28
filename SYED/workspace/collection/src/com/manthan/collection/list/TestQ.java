package com.manthan.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class TestQ {
	public static void main(String[] args) {

		Vector al=new Vector();
		al.add(5);
		al.add("syed");
		al.add('f');
		al.add(5.4);
		
		Iterator it=al.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
