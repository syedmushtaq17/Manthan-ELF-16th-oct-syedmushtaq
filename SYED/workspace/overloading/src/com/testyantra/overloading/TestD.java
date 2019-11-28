package com.testyantra.overloading;

public  class TestD {

	static class b{
		 int run=100;
		 b(){
			 System.out.println("herebj");
		 }
		 class c{
			
		}
	}
	
	public static void main(String[] args) {

		b b=new b();

		System.out.println(b.run);
		Computer c=new Computer();
// here static Computer c=new Computer(); works static acn be accesed using class name
		//class.obj(c refe to Com obj).method(com methods)
		Room.cost=100;
		
		
	}

}
