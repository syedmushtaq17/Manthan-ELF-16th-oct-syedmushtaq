package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestG {
 public static void main(String[] args) {
	

	TreeSet<String> h=new TreeSet<String>();
	String p=("syed");
	String p1=("SYED");
	String p2=("syed khutub");
	String p3=("syed ali");
	
	h.add(p);
	h.add(p1);
	h.add(p2);
	h.add(p3);
	
	for( String s:h) {
		System.out.println(s);
		
	}
	Iterator<String> it=h.iterator();
		while(it.hasNext()) {
			String v=it.next();
			System.out.println(v);
			
		}
	
	
}
}

