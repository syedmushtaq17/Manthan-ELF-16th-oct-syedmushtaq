package com.manthan.set.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestH {

	public static void main(String[] args) {

		HashMap<String,ArrayList<Student>> hm=new HashMap<String,ArrayList<Student> >();
		ArrayList<Student> al=new ArrayList<Student>();
	Student s=new Student(1,"rita", 74.5);
		Student s2=new Student(2,"mita", 70.5);
		Student s3=new Student(3,"bata", 76.5);
		Student s4=new Student(34,"tata", 78.5);
		al.add(s);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		
		ArrayList<Student> al1=new ArrayList<Student>();
		Student ss=new Student(1,"rita", 74.5);
			Student ss2=new Student(2,"mita", 70.5);
			Student ss3=new Student(3,"bata", 76.5);
			Student ss4=new Student(34,"tata", 78.5);
			al1.add(ss);
			al1.add(ss2);
			al1.add(ss3);
			al1.add(ss4);
			
			
			
			
			ArrayList<Student> al2=new ArrayList<Student>();
			Student sss=new Student(1,"rita", 74.5);
				Student sss2=new Student(2,"mita", 70.5);
				Student sss3=new Student(3,"bata", 76.5);
				Student sss4=new Student(34,"tata", 78.5);
				al2.add(sss);
				al2.add(sss2);
				al2.add(sss3);
				al2.add(sss4);
			
			hm.put("first",al);
			hm.put("second",al1);
			hm.put("third",al2);
			
			
		
		
		
		Set<Map.Entry<String,ArrayList<Student>>> sm=hm.entrySet();
		
		for(Map.Entry<String,ArrayList<Student>> x:sm) {
		System.out.println(x.getKey());
       ArrayList<Student> a=x.getValue();
       for(Student v :a) {
    	   System.out.println(v.name);
    	   System.out.println(v.id);
    	   System.out.println(v.percentage);
    	   System.out.println("----------------------");
       }
       System.out.println("**********************************");
		}
	}

}
