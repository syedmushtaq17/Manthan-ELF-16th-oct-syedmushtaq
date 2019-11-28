package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	public MyFirstServlet(){
		System.out.println("Constructor in mysfirst");
	}
	
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    Date date=new Date();
//		PrintWriter out=resp.getWriter();
//    resp.setHeader("refresh","10");
//    
//    
//    ServletConfig config=getServletConfig();
//    String msg=config.getInitParameter("message");
//    
//    ServletContext context=req.getServletContext();
//    String countryCode=context.getInitParameter("countryCode");
//    
//    //  java code         ^^^^^^^^^^^^^
//    out.println("<html>");
//    //htmil code for refresh.
//    out.print("<head>");
//    out.print("<meta http-equiv='refresh' content='2'>");
//    out.print("</head>");
//    // htmil code for refresh.
//    out.println("<body>");
//    out.println("<h1> Current Date and Time <br>" +date + "</h1>");
//    out.print("<br>"+msg);
//    out.print("<br> <h1>country is </h1>"+countryCode);
//    out.println("</body>");
//    out.println("</html>");
//	}
}
