package com.manthan.empwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPBinding;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOimpl;

@WebServlet("/delEmpJsp")
public class DeleteEmployee extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session !=null) {
			
			int empId=Integer.parseInt(req.getParameter("empId"));
			 EmployeeDAO dao=new EmployeeDAOimpl();
			if(dao.deleteEmp(empId)) {
				req.setAttribute("msg", "Deleted successfully");
			}
			else {
				req.setAttribute("msg", "Invalid id ");
			}
			
			req.getRequestDispatcher("./delEmpForm").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "please login first");
			req.getRequestDispatcher("./loginform").forward(req, resp);
		}
		
	}
}
