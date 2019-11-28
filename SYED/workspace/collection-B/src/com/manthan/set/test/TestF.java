package com.manthan.set.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestF {

	public static void main(String[] args) {

		TreeMap<String,Integer> tm=new TreeMap<String, Integer>();
		tm.put("First", 1);
		tm.put("second",2);
		tm.put("third",3);
		tm.put("First",4);
		
		Set<Map.Entry<String,Integer>> s=tm.entrySet();
		for(Map.Entry<String,Integer> x :s) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
	}

}
