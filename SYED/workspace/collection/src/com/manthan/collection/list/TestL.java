package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class TestL {

	public static void main(String[] args) {
		
	
	LinkedList al=new LinkedList();
	al.add(5);
	al.add('f');
	al.add(2.4);
	al.add("syed");
	
	ListIterator it=al.listIterator(); 
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}
	}
}
