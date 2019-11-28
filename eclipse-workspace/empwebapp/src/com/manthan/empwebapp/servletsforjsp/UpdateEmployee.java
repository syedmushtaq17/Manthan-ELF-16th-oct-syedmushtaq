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

@WebServlet("/upEmp")
public class UpdateEmployee extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession session=req.getSession(false);
		if(session !=null) {
			
			EmployeeDAO dao =new EmployeeDAOimpl();
			EmployeeInfoBean employeeInfoBean =new EmployeeInfoBean();
			int empId=Integer.parseInt(req.getParameter("empId"));
			String desg =req.getParameter("desg");
			if(dao.updateEmp(empId, desg)) {
				req.setAttribute("msg", "Updated success");
			}
			else {
				req.setAttribute("msg", "failed to update");
			}
			req.getRequestDispatcher("./upEmpForm").forward(req, resp);
			
		}
		else {
			req.setAttribute("msg", "Login First");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
	
	
	}
}
