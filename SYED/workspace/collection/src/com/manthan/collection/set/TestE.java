package com.manthan.collection.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestE {
 
public static void main(String[] args) {

		
		LinkedHashSet<Person> h=new LinkedHashSet<Person>();
		Person p=new Person(1,"syed",1.78);
		Person p1=new Person(1,"syed",1.78);
		//we must override tofield and equals 
		//for custom obj
		
		//else ----------------------------------------->>>>
		
		
		//els repeat for set also if we didnt override-->>>
		Person p2=new Person(3,"syed khutub",1.8);
		Person p3=new Person(4,"syed ali",1.6);
		
		h.add(p);
		h.add(p1);
		h.add(p2);
		h.add(p3);
		
		for( Person s:h) {
			System.out.println(s.name);
			System.out.println(s.id);
			System.out.println(s.height);
		}
		Iterator<Person> it=h.iterator();
			while(it.hasNext()) {
				Person v=it.next();
				System.out.println(v.name);
				System.out.println(v.id);
				System.out.println(v.height);
			}
		
		
	}
}
