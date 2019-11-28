package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter out=resp.getWriter();
    
    ServletContext context=req.getServletContext();
    String countryCode=context.getInitParameter("countryCode");
    ServletConfig config=getServletConfig();
    String msg=config.getInitParameter("message");
    
    
    
    out.print("<html>");
    out.print("<body>");
    out.print("<style>");
    out.print("body{background-color:#f16}");
    
    out.print("</style>");	
    out.print("<h1> Employee details-</h1>");
    out.print("Employee id =101 <br>");
    out.print("Employee name =<b>syed</b> <br>");
    out.print("Salary =900000 <br>");
    out.print(countryCode);
    out.print("message is "+msg);
    out.print("</body>");
    out.print("</html>");
		
	}
}
