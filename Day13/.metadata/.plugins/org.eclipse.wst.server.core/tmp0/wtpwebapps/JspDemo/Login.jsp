<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
   String name=request.getParameter("userName");
   String pwd=request.getParameter("passWord");
   if(name.equals("Janani") && pwd.equals("Jaanu")) {
	   %> 
	   
	   <jsp:forward page="Menupage.jsp"/>
	   <% 
   } else { 
	   out.println("please Reenter Credentials");
	   
	   %>
	  <jsp:include page="Login.html" />
	  <%
   }
	  %>
	   
	   
  
</body>
</html>