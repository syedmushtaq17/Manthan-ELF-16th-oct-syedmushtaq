<%@page import="java.sql.ResultSet"%>
<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@page import="com.manthan.empwebapp.dao.EmployeeDAOimpl"%>
<%@page import="com.manthan.empwebapp.dao.EmployeeDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% EmployeeDAO dao=new EmployeeDAOimpl();
       EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
       
       
  	 Connection con =null;
  	 ResultSet r =null;
  	java.sql.PreparedStatement stmt =null;
  	String url="select * from employee_info;";
  	 String dburl= "jdbc:mysql://aws.cn3u7edqifoe.ap-south-1.rds.amazonaws.com/elf_employee_db";
  	 
  	 try {
  		 
  		Class.forName("com.mysql.jdbc.Driver");
  		con=DriverManager.getConnection(dburl,"root","rootroot");
  		
  		stmt=con.prepareStatement(url);
  		r=stmt.executeQuery();
  		
  		
  		
  
       
       
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>



<tr>
<th>Employee_id   </th>

<th>Employee_name	</th>
<th> Age</th>
<th>Salary</th>
<th>Designation</th>
<th>Mobile</th>
</tr>


	<%  
	 
	while(r.next()){ %>

<td>
<%= r.getInt("emp_id") %>
</td>

<td>
<%= r.getString("emp_name") %>
</td>
<td>
<%=  r.getInt("age")%>
</td>
<td>
<%= r.getDouble("salary") %>
</td>
<td>
<%=  r.getString("designation") %>
</td>
<td>
<%= r.getLong("mobile") %>
</td> 
</tr>
<%} %>



    



</table>



</body>
</html>


   <% 
   
 	} catch (Exception e) {
  		e.printStackTrace();
  	}
   
   
   finally {
	if(r!=null) {
		try {
			r.close();
	} catch (SQLException e) {
e.printStackTrace();
		}
	}
	if(stmt!=null) {
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	if(con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
}
	
}



   %>