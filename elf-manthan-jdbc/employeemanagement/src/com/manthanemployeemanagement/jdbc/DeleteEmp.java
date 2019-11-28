package com.manthanemployeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmp {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement p=null;
		int rr=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter empl;oyee details ");
		System.out.println("eneter id ");
		int id=s.nextInt();
		s.close();
		try {
			//1st way to load
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			//2nd way to load
			
con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
				
				p=con.prepareStatement("delete from employee_info where emp_id=?");
				p.setInt(1, id);
				 rr=p.executeUpdate();
				
 
				 if(rr>0)
			 System.out.println("deleted");
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

