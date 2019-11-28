package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOimpl;

@WebServlet("/updateEmp")
public class UpdateEmp extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	

	HttpSession session=req.getSession(false);
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if(session!=null) {
			
			EmployeeDAO dao=new EmployeeDAOimpl();
			
			
			int empid=Integer.parseInt(req.getParameter("empId"));
			String desg=req.getParameter("desg");
			
			
			if(dao.updateEmp(empid,desg)) {
				out.print("<h2>Employee Updated successfully</h2>");
			}
			
			else {
				out.print("<h2>Invalid employee ID</h2>");
				req.getRequestDispatcher("./UpdateEmp.html").include(req, resp);
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
