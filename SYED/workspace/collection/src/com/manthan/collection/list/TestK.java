package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestK {
	
 public static void main(String[] args) {
	
	 LinkedList al=new LinkedList();
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
