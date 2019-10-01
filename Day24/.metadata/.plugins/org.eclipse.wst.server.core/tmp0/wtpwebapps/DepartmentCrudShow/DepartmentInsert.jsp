<%@page import="com.hcl.hib.DepartmentCrud"%>
<%@page import="com.hcl.hib.Department"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
 <form method="get" action="DepartmentInsert.jsp">
 <center>
 Department No: 
  <input type="text" name="deptno" /> <br/><br/>
  
  Name of Department : 
  <input type="text" name="dname" /> <br/><br/>  
  
  Location : 
  <input type="text" name="loc" /> <br/><br/>
  
  Head : 
  <input type="text" name="head" /> <br/><br/>
  <input type="submit" value="Insert" />
  </center>
 </form>
<%
  if(request.getParameter("deptno")!=null &&
     request.getParameter("dname")!=null &&
     request.getParameter("loc")!=null &&
     request.getParameter("head")!=null 
      ) {
	  Department e=new  Department();
	e.setDeptno(Integer.parseInt(request.getParameter("deptno"))) ;
	e.setDname(request.getParameter("dname"));
	e.setLoc(request.getParameter("loc"));
	e.setHead(request.getParameter("head"));
	
	 DepartmentCrud crud=new  DepartmentCrud();
	out.println(crud.insertDepartment(e));
  }
 %>
</body>
</html>