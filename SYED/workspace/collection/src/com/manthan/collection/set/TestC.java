package com.manthan.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {

		LinkedHashSet h=new LinkedHashSet();
		h.add("hello");
		h.add(20);
		h.add(3.1);
		h.add('f');
		h.add(null);
		h.add(null);
		
		for( Object s:h) {
			System.out.println(s);
		}
		Iterator it=h.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	}

}
