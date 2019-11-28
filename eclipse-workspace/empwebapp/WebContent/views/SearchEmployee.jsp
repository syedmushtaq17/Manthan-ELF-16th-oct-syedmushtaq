<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <% EmployeeInfoBean employeeInfoBean =(EmployeeInfoBean)request.getAttribute("searchEmployee");
 String msg =(String)request.getAttribute("msg");
 %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>
<legend>Employee LogIn</legend>
<form action="./searchEpl" method="get">
Employee ID: <input type="text" name="empId" required>
<br><br>
<input type="submit" value="Search">


</form>
</fieldset>
<% if (msg !=null && !msg.isEmpty()){%>
  
  <h2 style="color: red">   <%=msg %> </h2>

<%   } %>
 
 <% if (employeeInfoBean !=null){%>
 <h2> hello</h2>
 <table>
 <tr>
 <td> Employee ID </td>
 <td> :</td>
 <td> <%=employeeInfoBean.getEmpId() %></td>
 
 
 </tr>
 
 <tr>
 <td> Employee Name </td>
 <td> :</td>
 <td> <%=employeeInfoBean.getEmpName() %></td>
 
 
 </tr>
 
 <tr>
 <td> Age </td>
 <td> :</td>
 <td> <%=employeeInfoBean.getAge() %></td>
 </tr>
 
 
  
 <tr>
 <td> salary </td>
 <td> :</td>
 <td> <%=employeeInfoBean.getSalary() %></td>
 </tr>
 
  
 <tr>
 <td>Mobile </td>
 <td> :</td>
 <td> <%=employeeInfoBean.getMobile() %></td>
 </tr>
 
  
 <tr>
 <td> Designation </td>
 <td> :</td>
 <td> <%=employeeInfoBean.getDesg() %></td>
 </tr>
 
 
 </table>
 <% } %>
</body>
</html>