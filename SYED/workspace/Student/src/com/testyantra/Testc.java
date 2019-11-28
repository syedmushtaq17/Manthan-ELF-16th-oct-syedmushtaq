package com.testyantra;

import java.util.Scanner;

public class Testc {

	public static void main(String[] args) {

  Scanner s=new Scanner(System.in);
  System.out.println("enter the message");
  String ss=s.nextLine();
		Gift g=new Gift(ss);
		Girl gg=new Girl();
		gg.open(g);
	}

}
