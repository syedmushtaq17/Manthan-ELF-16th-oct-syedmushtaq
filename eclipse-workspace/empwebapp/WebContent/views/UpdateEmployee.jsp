<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>

<legend> Employee ID</legend>
<form action="./upEmp" method="get">

<table>

<tr>
<td> 

<input type="number" name="empId">

</td>

</tr>


<tr>
    <td>Employee DESIGNATION</td>
    <td>:</td>
    <td>
    <input type="text" name="desg">
    </td>
    
  </tr>
  
  
  
  

<tr>
  <td colspan="3"><input type="submit" value="Update"></td>
  </tr>
</table>

</form>

</fieldset>
<% if(msg!=null && !msg.isEmpty()){ %>
<h2><%=msg %></h2>
<% } %>
</body>
</html>