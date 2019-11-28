package com.manthan.collection.set;

public class Person implements Comparable<Person> {

	int id;
	String name;
	Double height;
	public Person(int id, String name, Double height) {
		this.id = id;
		this.name = name;
		this.height = height;
	}
	@Override
	public int compareTo(Person x) {
		
		return this.name.compareTo(x.name);
		
	}
	
//	
//	
////	public int compareTo(Person x) {
////
////		if(this.id>x.id)
////			return 1;
////// this is for tree set fo custom methods we mus write 
////		//no need for hashcode and equals override 
////		//cause return 0 means dont;
////		/*its non repaeting even if we pass "syed" twice in test class */
////		else if(this.id<x.id)
////			return -1;
////		
////		return 0;
////	}
	
}
