package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestW {

	public static void main(String[] args) {

		ArrayList<Student> al=new ArrayList<Student>();
		Student s =new Student(1,"syed",84.64);
		
		Student s1 =new Student(11,"syedmg",83.64);
		Student s2 =new Student(2,"mush",95);
		Student s3 =new Student(3,"taq",75.64);
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		for(Student st:al) {
			System.out.println("name is "+st.name);
			System.out.println("id is "+st.id);
			System.out.println("percentage is "+st.percentage);
			System.out.println("-------------------------");
		}
		for(int i=0;i<al.size();i++) {
			Student st=al.get(i);
			System.out.println("name is "+st.name);
			System.out.println("id is "+st.id);
			System.out.println("percentage is "+st.percentage);
			System.out.println("-------------------------");
		}
		System.out.println("------------this is iterator--------");
		Iterator<Student> it=al.iterator();
		while(it.hasNext()) {
			Student st=it.next();
			System.out.println(st.name);
			System.out.println(st.id);
			System.out.println(st.percentage);
			System.out.println("--------------");
			
		}
		System.out.println("------------this is listiterator--------");
		ListIterator<Student> lt=al.listIterator(al.size());
		while(lt.hasPrevious()) {
			Student st=lt.previous();
			System.out.println(st.name);
			System.out.println(st.id);
			System.out.println(st.percentage);
			System.out.println("--------------");
			
		}
	}

}
