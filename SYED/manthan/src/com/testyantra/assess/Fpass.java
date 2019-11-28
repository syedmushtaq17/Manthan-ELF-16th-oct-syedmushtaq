package com.testyantra.assess;

import java.util.ArrayList;
import java.util.List;

public class Fpass {

	public static void main(String[] args) {
		
		List<Double> female=new ArrayList();
		female.add(66.5);
		female.add(36.5);

		female.add(35.5);
		female.add(73.5);
		female.add(32.5);
		female.add(82.5);
		female.add(79.5);
		female.add(29.5);
		
		long fc=female.stream().filter(i->i>=35).count();
		System.out.println("FeMale pass count is "+fc);
	}

}
