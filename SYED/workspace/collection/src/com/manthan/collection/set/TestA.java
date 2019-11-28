package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

public class TestA {

	public static void main(String[] args) {

		HashSet<String> h=new HashSet();
		h.add("hello");
		h.add("how are you");
		h.add("THIS ISM E");
		h.add("DO U REMENBER");
		
		for( String s:h) {
			System.out.println(s);
		}
		Iterator<String> it=h.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		
	}

}
