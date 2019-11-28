package com.manthan.empwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lf")
public class Logoutserv extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession(false);
		if(session!=null) {
			
		session.invalidate();
		req.setAttribute("msg", "Logged Out Success");
		
		
}
		else {
			req.setAttribute("msg", "Login First");
			req.getRequestDispatcher("/loginfrom").forward(req, resp);
		}
		req.getRequestDispatcher("/logForm").forward(req, resp);
		
	}
	}