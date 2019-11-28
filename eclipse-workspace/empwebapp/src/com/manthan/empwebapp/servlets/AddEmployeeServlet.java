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
import com.manthan.empwebapp.util.EmployeeDAOImplManager;


@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{

	EmployeeDAO dao= EmployeeDAOImplManager.getDaoInstance();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
		EmployeeInfoBean employeeInfoBean =new EmployeeInfoBean();
		 PrintWriter out = resp.getWriter();
			out.print("<html>");
			out.print("<body>");
			
		
		int empId=Integer.parseInt(req.getParameter("empId"));
      String empName=req.getParameter("empName");
      String desg=req.getParameter("desg");
      int age=Integer.parseInt(req.getParameter("age"));
      double salary=Double.parseDouble(req.getParameter("salary"));
      long mobile=Long.parseLong(req.getParameter("mobile"));
  
      employeeInfoBean.setAge(age);
      employeeInfoBean.setDesg(desg);
      employeeInfoBean.setEmpId(empId);
      employeeInfoBean.setEmpName(empName);
      employeeInfoBean.setSalary(salary);
      HttpSession session=req.getSession(false);
		if(session!=null) {
			
			EmployeeInfoBean bean=(EmployeeInfoBean) session.getAttribute("employeeInfoBean");
     
     if(dao.addEmployee(employeeInfoBean)) {
    	 out.println("<h2>Employee record  Inserted sucessfully</h2>");
    	 out.println("<h2>Thansk "+ bean.getEmpName()+"for inserting </h2>");
     }

     else {
    	 out.println("<h2>Employee record  Insertion failed</h2>");
     out.println("<h2>Sorry "+ bean.getEmpName()+", "+ bean.getDesg()+"for inserting </h2>");
     
		}
	}
	else {
		 out.println("<h2>Please login first</h2>");
		 req.getRequestDispatcher("./loginForm.html").include(req, resp);
		 
	}
			out.print("</body>");
			out.print("</html>");
			
	
}
}
