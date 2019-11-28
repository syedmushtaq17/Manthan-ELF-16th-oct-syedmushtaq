package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(5);
		al.add('f');
		al.add(2.4);
		al.add("syed");
		ListIterator l=al.listIterator(al.size());
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
	}

}
