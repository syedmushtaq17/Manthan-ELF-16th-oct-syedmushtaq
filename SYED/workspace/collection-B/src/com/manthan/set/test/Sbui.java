package com.manthan.set.test;

import java.util.Comparator;

public class Sbui implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		Double a=o1.percentage;
		Double b=o2.percentage;
// heere Double impl comparable and has default compareto method		
		return a.compareTo(b);
	}

//	@Override
//	public int compare(Student o1, Student o2) {
//      
//		if(o1.id>o2.id)
//			return 1;
//		
//		else if(o1.id<o2.id)
//			return -1;
//		
//		return 0;
//	}
	
	

	
}
