<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MyDetails.jsp" method="get">
<%
	int empId=Integer.parseInt((String)session.getAttribute("user"));
%>
<% EmployeeDetails obj=new EmployeeDetails();%>
<% obj=new EMSDao().SearchEmp(empId); %>

<h1> MyDetails Section</h1> <br/><br/><br/><br/>
<table border="0" align="left">
<tr>
  
  <td cellspacing="20" cellpadding="20"  align="left">Employee Id : <%=empId%><br/></td>
  <td cellspacing="20" cellpadding="20" align="left">Date Joined : <%=obj.getD() %><br/></td>
  </tr>
  <tr>

</body>
</html>