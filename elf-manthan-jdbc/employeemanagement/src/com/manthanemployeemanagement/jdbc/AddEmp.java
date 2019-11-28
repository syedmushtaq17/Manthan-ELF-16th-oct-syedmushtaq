package com.manthanemployeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class AddEmp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter empl;oyee details ");
		System.out.println("eneter id ");
		int id=s.nextInt();
		s.nextLine();
		System.out.println("eneter neme ");
		String name=s.nextLine();
		System.out.println("eneter age ");
		int age=s.nextInt();
		System.out.println("eneter salary ");
		double salary=s.nextDouble();
		s.nextLine();
		System.out.println("eneter design ");
		String desg=s.nextLine();

		System.out.println("eneter number ");
		long mobile=s.nextLong();

		
		
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
			
con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
				
				p=con.prepareStatement("insert into employee_info values(?,?,?,?,?,?)");
				p.setInt(1, id);
				p.setString(2, name);
				p.setInt(3, age);
				p.setDouble(4,salary);
				p.setString(5, desg);
				p.setLong(6,mobile);
				 rr=p.executeUpdate();
				
 
				 if(rr>0)
			 System.out.println("success");
				 else
					 System.out.println("failed");
				 

				

	}
		catch (Exception e){
			e.printStackTrace();
		}
		
	finally {
			
			
			
			if(p!=null) {
				try {
					p.close();
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
