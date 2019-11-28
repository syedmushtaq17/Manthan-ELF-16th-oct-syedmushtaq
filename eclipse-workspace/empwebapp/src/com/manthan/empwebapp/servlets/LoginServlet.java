package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOimpl;

@WebServlet("/login")
public class LoginServlet extends  HttpServlet{
   
	//check here for impl manager
	
	
			//check
	 EmployeeDAO dao=new EmployeeDAOimpl();//forimplmanager
	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int empIdVal=Integer.parseInt(req.getParameter("empId"));
	String password=req.getParameter("password");
	
	
	EmployeeInfoBean employeeInfoBean=dao.authenticate(empIdVal, password);
	
PrintWriter out=resp.getWriter();
    
    
    
    out.print("<html>");
    out.print("<body>");
	if(employeeInfoBean!=null) {
		
		HttpSession session=req.getSession(true);
		session.setAttribute("employeeInfoBean", employeeInfoBean);
		session.setMaxInactiveInterval(30);
	    out.print("<h2> Welcome "+employeeInfoBean.getEmpId()+"</h2><br>");
	    out.print("<a href='./addEmployee.html'>Add New Employee</a><br>");
	    out.print("<a href='./searchEmployee.html'>Search Employee</a><br>");
	    out.print("<a href='./UpdateEmp.html'>UpdateEmployee</a><br>");
	    out.print("<a href='./deleteEmployee.html'>Delete Employee</a><br>");
	    out.print("<a href='./logout'>logout</a><br>");
	}
	else {
		 out.print("<h2> Invalid credientials  </h2>");
		 req.getRequestDispatcher("./loginForm.html").include(req, resp);
		    
	}
	 out.print("</body>");
	    out.print("</html>");
			
	}
	
}
