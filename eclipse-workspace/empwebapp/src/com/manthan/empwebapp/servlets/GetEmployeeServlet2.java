package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet2 extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String empId=req.getParameter("empId");
		
		
		PrintWriter out=resp.getWriter();
	    
	    
	    
	    out.print("<html>");
	    out.print("<body>");
	    out.print("<style>");
	    out.print("body{background-color:#f89}");
	    
	    out.print("</style>");	
	    out.print("<h1> Employee details for emp id-" + empId+"</h1>");
	    out.print("Employee name =<b>syed</b> <br>");
	    out.print("Salary =900000 <br>");
	    out.print("desg =Analyst <br>");
	    out.print("</body>");
	    out.print("</html>");
			
		}
}
