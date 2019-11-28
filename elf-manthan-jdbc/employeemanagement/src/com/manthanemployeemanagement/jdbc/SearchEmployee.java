package com.manthanemployeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class SearchEmployee {

	public static void main(String[] args) {

		Connection con=null;
		Statement smt=null;
		int r=0;
		ResultSet rs=null;
		ResultSet rr=null;
		java.sql.PreparedStatement ss=null;
		

		Scanner s=new Scanner(System.in);
		System.out.println("enter empl;oyee id ");
		int id=s.nextInt();
		int id1=s.nextInt();
		try {
			Driver driver=new Driver();                                           
			DriverManager.registerDriver(driver);
			//
con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
				
				
				
				ss=con.prepareStatement("SELECT * FROM EMPLOYEE_INFO where emp_id= ? or emp_id=?");
				ss.setInt(1, id);
				ss.setInt(2, id1);
				rr=ss.executeQuery();
			 smt=con.createStatement();
			 rs=smt.executeQuery("SELECT * FROM EMPLOYEE_INFO where emp_id="+id);
			 
//  we can also yuse string like this--------------------------------------^^^6^			 
			 if(rr.next()) {
				 System.out.println("employee id found ");
				 System.out.println("empid ="+ rr.getInt("emp_id"));
				 System.out.println("name is= "+rr.getString("emp_name"));
				 System.out.println("age is ="+rr.getInt("age"));
				 System.out.println("salary is ="+rr.getDouble("salary"));
				 System.out.println("designation ="+rr.getString("designation"));  
				 System.out.println("mobile number ="+rr.getLong("mobile"));
			 }
			 else
				 System.out.println("employee id not- found");
		}
		catch(Exception e) {
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
		
	}// end of main;

}//end of class;
