package com.manthan.empwebapp.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.mysql.jdbc.PreparedStatement;

public class EmployeeDAOimpl implements EmployeeDAO {

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		EmployeeInfoBean employeeInfoBean =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://aws.cn3u7edqifoe.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");

			String query = "select * from employee_info where emp_id=? ";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			
			
			
			if (rs.next()) {

				employeeInfoBean=new EmployeeInfoBean();
				employeeInfoBean.setEmpId(rs.getInt("emp_id") );
		 employeeInfoBean.setEmpName(rs.getString("emp_name") );
		 employeeInfoBean.setAge(rs.getInt("age") );
				employeeInfoBean.setMobile( rs.getLong("mobile") );
				employeeInfoBean.setDesg( rs.getString("designation") );
				employeeInfoBean.setSalary(rs.getDouble("salary"));

			} 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		 finally {
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				if (con != null) {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		
		
		
		
		return employeeInfoBean;
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean isAdded=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://aws.cn3u7edqifoe.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");
		
			String query="insert into employee_info values (?,?,?,?,?,?,?)";
			
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, employeeInfoBean.getEmpId());
			pstmt.setString(2, employeeInfoBean.getEmpName());
			pstmt.setInt(3,employeeInfoBean.getAge());
			pstmt.setDouble(4, employeeInfoBean.getSalary());
			pstmt.setString(5, employeeInfoBean.getDesg());
			pstmt.setLong(6, employeeInfoBean.getMobile());
			pstmt.setString(7, "qwerty");
			
			
			int n=pstmt.executeUpdate();
			if(n>0)
				isAdded=true;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return isAdded;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		//check here for impl manager
		
		
		//check
  
		Connection con=null;
		java.sql.PreparedStatement pstmt=null;
		ResultSet rs=null;
		EmployeeInfoBean employeeInfoBean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://aws.cn3u7edqifoe.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");
			String query="select * from employee_info where emp_id=? and password=?";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, empId);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				employeeInfoBean=new EmployeeInfoBean();
				employeeInfoBean.setAge(rs.getInt("age"));
				employeeInfoBean.setDesg(rs.getString("designation"));
				employeeInfoBean.setEmpId(rs.getInt("emp_id"));
				employeeInfoBean.setEmpName(rs.getString("emp_name"));
				employeeInfoBean.setMobile(rs.getLong("mobile"));
				employeeInfoBean.setSalary(rs.getDouble("salary"));
			
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	return employeeInfoBean;
	
	}
    public boolean deleteEmp(int empId) {
	  
	  boolean del=false;
	  
	  
		
		
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;

		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://aws.cn3u7edqifoe.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");

			String query = " delete  from  employee_info where emp_id=?;";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			int rs = pstmt.executeUpdate();
			
			if(rs>0)
				del=true;
		

			

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	  
	  
	  
	  
	  
	  
	  return del;
	  
	  
  }

	@Override
	public boolean updateEmp(int empId, String desg) {
	
		boolean up=false;
		


		
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;

		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://aws.cn3u7edqifoe.ap-south-1.rds.amazonaws.com/elf_employee_db", "root", "rootroot");

			String query = "  update employee_info set designation =? where emp_id=?;";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(2, empId);
			pstmt.setString(1, desg);
			int rs = pstmt.executeUpdate();
			
			if(rs>0)
				up=true;
		

			

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	  
	  
		
		
	
		
		return up;
	}

	@Override
	public ResultSet seeAllEmployee() {

	 Connection con =null;
	 ResultSet rs =null;
	java.sql.PreparedStatement stmt =null;
	String url="select * from employee_info;";
	 String dburl= "jdbc:mysql://aws.cn3u7edqifoe.ap-south-1.rds.amazonaws.com/elf_employee_db";
	 
	 try {
		 
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(dburl,"root","rootroot");
		
		stmt=con.prepareStatement(url);
		rs=stmt.executeQuery();
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
		finally {
			if(rs!=null) {
				try {
					rs.close();
			} catch (SQLException e) {
	 e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
		}
}
		
	 return rs;
	
	
	}
	
}
