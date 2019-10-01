<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <sql:setDataSource var="conn"
  driver="com.mysql.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/sqlpractice"
  user="root"
  password="root"
  />
<sql:query var="empQuery" dataSource="${conn}" >
   select * from Employ where Empno=?
   <sql:param value="${param.empno}" />
   </sql:query>
<a:set var="flag" value="0" />
<a:forEach var="e" items="${empQuery.rows}">
 Employ No :
   <a:out value="${e.empno}"/> <br/> 
   Name :
   <a:out value="${e.name}"/> <br/> 
   Department :
   <a:out value="${e.dept}"/> <br/> 
   Designation :
   <a:out value="${e.desig}"/> <br/> 
   Basic :
   <a:out value="${e.basic}"/> <br/> <hr/> 
   <a:set var="flag" value="1" />
   </a:forEach>
   <a:if test="${flag==0}">
   <a:out value="Employ No Not Fount" />
   </a:if>
</body>
</html>