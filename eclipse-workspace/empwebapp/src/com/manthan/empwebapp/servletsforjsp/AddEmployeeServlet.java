package com.manthan.empwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOimpl;

@WebServlet("/addEmppForms")
public class AddEmployeeServlet extends HttpServlet {

	EmployeeDAO dao=new EmployeeDAOimpl();
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session!=null) {

			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
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
	      
	      if(dao.addEmployee(employeeInfoBean)) {
	    	  req.setAttribute("msg", "Empllotee added success");
	      }
	      else {
	    	  req.setAttribute("msg", "Failed to insert record");
	      }
	      req.getRequestDispatcher("./addEmppForm").forward(req, resp);
		}
		else {
	
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
		
	}
}
