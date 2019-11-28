package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestI {
	public static void main(String[] args) {

		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);
		ListIterator<Double> it=al.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
//here it isuthe iin the air tonight