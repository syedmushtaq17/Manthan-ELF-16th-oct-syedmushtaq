<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%String msg=(String)request.getAttribute("msg"); %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(msg!=null){ %>
<%=msg %>
<%} %>

<fieldset>
<legend>Employee LogIn</legend>
<form action="./login4" method="post">

 <table>
 
  <tr>
    <td>Employee ID</td>
    <td>:</td>
    <td>
    <input type="text" name="empId">
    </td>
    
  </tr>
  
  
  <tr>
    <td>Password</td>
    <td>:</td>
    <td>
    <input type="password" name="password">
    </td>
    
  </tr>
  <tr>
  <td colspan="3"><input type="submit" value="LogIn"></td>
  </tr>
</table>



</form>
</fieldset>


</body>
</html>

