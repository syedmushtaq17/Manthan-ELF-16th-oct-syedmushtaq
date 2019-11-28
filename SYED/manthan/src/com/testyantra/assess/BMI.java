package com.testyantra.assess;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class BMI {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter height ");
	double h=scan.nextDouble();
		
		System.out.println("Enter weight ");
	double w=scan.nextDouble();
		
		BMIcalc  c=(hh,ww)-> hh/(ww*ww);
		
		System.out.println("BMI is "+c.cal(h, w));
		
		
		
		
		
	}
	
}
