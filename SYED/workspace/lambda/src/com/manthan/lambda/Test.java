package com.manthan.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class Test  {

	public static void main(String[] args) {
//without creating seperate method in student where we should have impl comparator for students
//and then compare method we directly wrote here and prints well		
		
	
		TreeSet<Student> ts=new TreeSet<Student>(MyStudentSort.c);
// create MyStudentSort interface and add comparator methods^^^^^ 
//call 	MyStudentSort.(cper/cname/cid) remember to put this in treeset	
		Student s=new Student(1, "roshan",64);
		Student s1=new Student(2, "ram",84);
		Student s2=new Student(3, "rahim",74);
		ts.add(s);
		ts.add(s1);
		ts.add(s2);
		for(Student x:ts) {
		System.out.println(x.name);
		System.out.println(x.id);
		System.out.println(x.percentage);
	}


}
}
