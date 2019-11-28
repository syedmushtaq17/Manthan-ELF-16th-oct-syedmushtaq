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
<form action="./delEmpJsp" method="get">

<table>

<tr>
<td> 

<input type="text" name="empId">

</td>

</tr>

<tr>
  <td colspan="3"><input type="submit" value="Delete"></td>
  </tr>
</table>

</form>

</fieldset>

<% if (msg !=null && !msg.isEmpty()){%>
  
  <h2 style="color: red">   <%=msg %> </h2>

<%   } %>


</body>
</html>