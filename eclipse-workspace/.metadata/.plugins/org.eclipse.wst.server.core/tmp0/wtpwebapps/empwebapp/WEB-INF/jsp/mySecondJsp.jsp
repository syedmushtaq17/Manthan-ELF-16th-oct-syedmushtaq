<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!
    	int a=100;
    
    
    	public int  getA()
    	{
    		return a;
    		
    	}
    
    	
    	public void setA(int a) {
    		this.a=a;
    	}
    	
    	
    	String name="kunal";
    	public String getName(){
    		return name;
    	}
    	
    	public String getName(String givenName){
    		return givenName;
    	}
    	
    	public void setName(String name){
    		this.name=name;
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello User </h1>
a1=<%=a %><br>
a2=<%=getA() %><br>

Name1=<%=name %><br>
Name2=<%=getName() %><br>
Name3=<%=getName("Anbx") %><br>




<% for (int i=0;i<5;i++){ %>

<%= getName() %><br>
<% } %>

 
<%-- <jsp:forward page="/myFirstServlet" />--%>

<jsp:include page="date.html" />

<jsp:include page="/myFirstServlet" />

</body>
</html>