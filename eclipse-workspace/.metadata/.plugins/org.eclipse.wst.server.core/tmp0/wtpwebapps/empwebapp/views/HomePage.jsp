<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<% EmployeeInfoBean employeeInfoBean
=
 (EmployeeInfoBean)session.getAttribute("employeeInfoBean"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:navy;">Hello  <%= employeeInfoBean.getEmpName() %></h3>

 <a href='./addEmppForm'>Add New Employee</a><br>
 <a href='./searchEmple'>Search Employee</a><br>
 <a href='./upEmpForm'>UpdateEmployee</a><br>
 <a href='./delEmpForm'>Delete Employee</a><br>
  <a href='./seeAll'>See All Employee</a><br>
  <a href='./lf'>logout</a><br>
</body>
</html>