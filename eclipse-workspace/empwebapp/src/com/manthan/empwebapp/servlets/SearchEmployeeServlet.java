package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchEmp")
public class SearchEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String empIdVal = req.getParameter("empId");
		Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs = null;
		int empId = Integer.parseInt(empIdVal);

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");

			String query = "select * from employee_info where emp_id=? ";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			PrintWriter out = resp.getWriter();
			out.print("<html>");
			out.print("<body>");

			if (rs.next()) {

				out.print("Employee details for the emp is");
				out.print("<h2 style ='backgroung-color: #f50'>Employee id is " + rs.getInt("emp_id") + "</h2>");
				out.print("<h3 style ='backgroung-color: #f40'>Employee name is " + rs.getString("emp_name") + "</h3>");
				out.print("<h3 style ='backgroung-color: #f30'>Employee age is " + rs.getInt("age") + "</h3>");
				out.print("<h3 style ='backgroung-color: #f20'>Employee designation is " + rs.getString("designation") + "</h3>");
				out.print("<h3 style ='backgroung-color: #f10'>Employee mobile is " + rs.getLong("mobile") + "</h3>");

			} else {
				out.print("<h2 style = 'color:red;'> Employee id " + empId + " not found</h2>");
			}

			out.print("</body>");
			out.print("</html>");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
