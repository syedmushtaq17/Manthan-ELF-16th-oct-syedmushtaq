package com.manthan.set.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestE {

	public static void main(String[] args) {

		HashMap<Character, String> hm=new HashMap<Character, String>();
		hm.put('M',"man");
		hm.put('A',"apple");
		hm.put('a',"value");
		hm.put('f',"dfan");
		Set<Map.Entry<Character,String>> se=hm.entrySet();
		for(Map.Entry<Character, String> x : se) {
			Character k=x.getKey();
			String v=x.getValue();
			System.out.println(k);
			System.out.println(v);
			System.out.println("-----------------------");
		}
	}

}
