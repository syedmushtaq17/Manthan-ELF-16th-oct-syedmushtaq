package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Demo {

	void run() throws IOException,SQLException,ClassNotFoundException,ArithmeticException  {
		File f=new File("demo.txt");
		try
		{
			f.createNewFile();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
			throw e;
		}
	
			
		
		
	}
}
