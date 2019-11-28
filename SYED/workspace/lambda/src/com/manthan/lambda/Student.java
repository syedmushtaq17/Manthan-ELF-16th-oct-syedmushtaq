package com.manthan.lambda;

import java.util.Comparator;

public class Student implements Comparator<Student>{
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id>o2.id)
			return 1;
		else if(o1.id<o2.id)
			return -1;
		
		
		return 0;
	}

 
	
	
}
