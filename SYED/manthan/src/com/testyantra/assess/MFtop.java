package com.testyantra.assess;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MFtop {

	public static void main(String[] args) {
		
		List<Double> male=new ArrayList();
		List<Double> female=new ArrayList();
		
		male.add(65.5);
		male.add(35.5);
		male.add(5.5);
		male.add(75.5);
		male.add(95.5);
		female.add(66.5);
		female.add(36.5);
		female.add(55.5);
		female.add(79.5);
		female.add(99.5);
		
		Optional<Double> mc=male.stream().max((i, j) -> i.compareTo(j));

		
		Optional<Double> fc=female.stream().max((i, j) -> i.compareTo(j));
		System.out.println("Male max is "+mc);
		System.out.println("FeMale max is "+fc);
		
	}
}
