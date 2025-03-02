package com.manthanemployeemanagement.jdbc;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;

public class MYFIRSTJDBC {

	public static void main(String[] args) throws ClassNotFoundException,  IllegalAccessException {

		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;
		PreparedStatement p=null;
		int rr=0;
		ResultSet r=null;
		try {
			//1st way to load
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			//2nd way to load
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			//
con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
				
				p=con.prepareStatement("SELECT * FROM EMPLOYEE_INFO");
				 r=p.executeQuery();
				
//of preparedstatement do above oone 				
			 smt=con.createStatement();
			 rs=smt.executeQuery("SELECT * FROM EMPLOYEE_INFO");
	
			 while(rs.next()) {
				 int empid=rs.getInt(1);
				 String name=rs.getString("emp_name");
				 int age=rs.getInt("age");
				 double salary=rs.getDouble("salary");
				 String desg=rs.getString("designation");
				long mobile =rs.getLong("mobile");
				 
				 System.out.println("empid ="+empid);
				 System.out.println("name is= "+name);
				 System.out.println("age is ="+age);
				 System.out.println("salary is ="+salary);
				 System.out.println("designation ="+desg);  
				 System.out.println("mobile number ="+mobile);
				 System.out.println("------------------------------------");
				 
				 
				 
			 }
	}
		catch (SQLException e){
			e.printStackTrace();
		}
		finally {
			
			if(rs!=null) {
				try {
					rs.close();
					System.out.println("connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
			
			
			if(smt!=null) {
				try {
					smt.close();
					System.out.println("connection closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
			
			
			
			if(con!=null) {
		try {
			con.close();
			System.out.println("connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
			}
}
}