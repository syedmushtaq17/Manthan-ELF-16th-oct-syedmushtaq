package com.manthan.exception.test;

import java.io.IOException;
import java.sql.SQLException;

public class TestT {

	public static void main(String[] args) {

		Demo d=new Demo();
		try {
			d.run();
		} catch (ClassNotFoundException | IOException | SQLException e) {//multiple catch exception 
			//we can also write individual exception but its lengthy from java 1.7.
			

			e.printStackTrace();
		}
		
	}

}
