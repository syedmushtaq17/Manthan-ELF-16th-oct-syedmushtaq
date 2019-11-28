package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestB {

	public static void main(String[] args) {

		LinkedHashSet<String> h=new LinkedHashSet();
		h.add("hello");
		h.add("how are you");
		h.add("THIS ISM E");
		h.add("DO U REMENBER");
		h.add(null);
		h.add(null);
		for( String s:h) {
			System.out.println(s);
		}
		Iterator<String> it=h.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	}

}
