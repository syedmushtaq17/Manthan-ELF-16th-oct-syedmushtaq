package com.testyantra.overloading;

public class TestC {

	public static void main(String[] args) {

		Person p=new Person();
		
		p.age=18;
		p.walk();
		p.m.model=1996;
// p is refernce of person and m is non static refernce pointing to   mobile obj pointing to obj
		p.m.docall();
		System.out.println(p.age);//18
		System.out.println(p.m.model);//1996
				
	}

}
