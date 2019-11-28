package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestB {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(5);
		al.add('f');
		al.add(2.4);
		al.add("syed");
		
		Iterator it=al.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
