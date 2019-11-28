package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOimpl;

@WebServlet("/deleteEmp")
public class DeleteEmployee extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession(false);
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if(session!=null) {
			
			EmployeeDAO dao=new EmployeeDAOimpl();
			
			
			int empid=Integer.parseInt(req.getParameter("empId"));
			
			
			
			if(dao.deleteEmp(empid)) {
				out.print("<h2>Employee deleted successfully</h2>");
			}
			
			else {
				out.print("<h2>Invalid employee ID</h2>");
			}
	
	
		}
		
		
			else {
				out.print("<h2>LogIn first</h2>");
				req.getRequestDispatcher("./loginForm.html").include(req, resp);
			}
				
		
		
		
		 out.print("</body>");
			out.print("</html>");
			}
		


	}

