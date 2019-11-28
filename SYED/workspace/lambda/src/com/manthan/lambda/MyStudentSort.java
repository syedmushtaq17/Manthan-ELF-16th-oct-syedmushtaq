package com.manthan.lambda;

import java.util.Comparator;

public interface MyStudentSort {

	Comparator<Student> cper=(a,b)->{
		if(a.percentage>b.percentage)
			return 1;
		else if (a.percentage<b.percentage)
			return -1;
		return 0;
	};

	
	Comparator<Student> cid=(a,b)->{
		if(a.id>b.id)
			return 1;
		else if (a.id<b.id)
			return -1;
		return 0;
	};
	
	Comparator<Student> cname=(a,b)-> a.name.compareTo(b.name);
	
}
