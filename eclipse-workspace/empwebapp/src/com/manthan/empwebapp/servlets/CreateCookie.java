package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createCookie")
public class CreateCookie extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie cookie =new Cookie("empName", "Venkatesh");
	resp.addCookie(cookie);
	PrintWriter out=resp.getWriter();
	out.print("<html>");
	out.print("<body>");
	out.print("<h2> cookie is added successfully");
	out.print("</body>");
	out.print("</html>");
	
			
			
	

	}
}
