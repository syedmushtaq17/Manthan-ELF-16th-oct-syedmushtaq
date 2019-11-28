package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestP {

	public static void main(String[] args) {

		HashSet s=new HashSet();
		s.add("priya");
		s.add(14);
		s.add("divya");
		s.add('m');
		for (Iterator iterator = s.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		for(Object h:s) {
			System.out.println(h
					);
		}
	}

}
