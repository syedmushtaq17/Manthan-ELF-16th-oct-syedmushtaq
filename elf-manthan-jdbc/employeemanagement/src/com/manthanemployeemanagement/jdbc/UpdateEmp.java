package com.manthanemployeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmp {

	public static void main(String[] args) {

		Connection con=null;
		PreparedStatement p=null;
		int rr=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter empl;oyee details ");
		System.out.println("eneter id ");
		int id=s.nextInt();
	
		s.nextLine();
		System.out.println("enter mobile");
		Long mob=s.nextLong();
		s.close();
		try {
			//1st way to load
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			//2nd way to load
			
con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
				
				p=con.prepareStatement("update  employee_info set mobile=? where emp_id=?");
				p.setInt(2, id);
				p.setLong(1,mob);
				 rr=p.executeUpdate();
				
 
				 if(rr>0)
			 System.out.println("updated");
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
