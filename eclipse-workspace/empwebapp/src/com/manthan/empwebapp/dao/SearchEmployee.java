package com.manthan.empwebapp.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;
@WebServlet("/searchEmp2")
public class SearchEmployee extends HttpServlet{
	
	EmployeeDAO DAO =EmployeeDAOImplManager.getDaoInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empIdVal= Integer.parseInt(req.getParameter("empId"));
		
		
	EmployeeInfoBean employeeInfoBean=	DAO.searchEmployee(empIdVal);
	PrintWriter out=resp.getWriter();
	
	out.print("<html>");
	out.print("<body>");
  if(employeeInfoBean !=null) {
	  
	  
	  
	  out.print("Employee details for the emp is");
		out.print("<h2>Employee id is " + employeeInfoBean.getEmpId() + "</h2>");
		out.print("<h3>Employee name is " + employeeInfoBean.getEmpName() + "</h3>");
		out.print("<h3>Employee age is " + employeeInfoBean.getAge() + "</h3>");
		out.print("<h3>Employee designation is " + employeeInfoBean.getDesg() + "</h3>");
		out.print("<h3>Employee mobile is " + employeeInfoBean.getMobile() + "</h3>");
		out.print("<h3>Employee salary is " + employeeInfoBean.getSalary() + "</h3>");
	  
	  
	  
  }
  else
  {
	  out.print("<h2 style = 'color:red;'> Employee id " + empIdVal + " not found</h2>");
  }
  out.print("</body>");
  out.print("</html>");
		
		
	}

	
	
}
