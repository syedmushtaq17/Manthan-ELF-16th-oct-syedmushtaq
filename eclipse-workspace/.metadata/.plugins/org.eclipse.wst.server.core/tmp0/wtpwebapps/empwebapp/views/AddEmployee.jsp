<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%  String msg =(String)request.getAttribute("msg");
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if (msg!=null && !msg.isEmpty()) { %>

<h2><%=msg %></h2>
<%} %>
<form action="./addEmppForms" method="post">



<table>
			<tr>
				<td>Employee Id</td>
				<td>:</td>
				<td><input type="text" name="empId" required></td>
			</tr>

			<tr>
				<td>Employee Name</td>
				<td>:</td>
				<td><input type="text" name="empName" required></td>
			</tr>

			<tr>
				<td>Age</td>
				<td>:</td>
				<td><input type="number" name="age" required></td>
			</tr>

			<tr>
				<td>Employee Salary</td>
				<td>:</td>
				<td><input type="number" name="salary" required></td>
			</tr>

			<tr>
				<td>Designation</td>
				<td>:</td>
				<td><input type="text" name="desg" required></td>
			</tr>

			<tr>
				<td>Mobile no</td>
				<td>:</td>
				<td><input type="number" name="mobile" required></td>
			</tr>

			<tr>

				<td colspan="3" align="center"><td><input type="submit" name="Add Employee" required>
			</td></tr>

		</table>







</form>
</body>
</html>