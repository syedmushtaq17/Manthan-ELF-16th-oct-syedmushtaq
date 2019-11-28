package com.manthan.set.test;

import java.util.Comparator;

public class Sbyp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

		Integer a=o1.id;
		Integer b=o2.id;
// heere integre impl comparable and has default compareto method		
		return a.compareTo(b);
	}

}
