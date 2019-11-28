package com.manthan.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestS {
	public static void main(String[] args) {

		Vector<Character> al=new Vector();
		al.add('5');
		al.add('s');
		al.add('f');
		al.add('d');
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		for(Character c:al) {
			System.out.println(c);
		}
		
		ListIterator<Character> it=al.listIterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator itt=al.iterator(); 
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
	}
}
