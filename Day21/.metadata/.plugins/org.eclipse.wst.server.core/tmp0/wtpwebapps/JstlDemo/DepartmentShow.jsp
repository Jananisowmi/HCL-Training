<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="f" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>


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
<sql:query var="deptQuery" dataSource="${conn}" >
   select * from Department
   </sql:query>
   <f:forEach var="e" items="${deptQuery.rows}">
  Department No :
   <f:out value="${e.deptno}"/> <br/> 
   Name :
   <f:out value="${e.name}"/> <br/> 
  Location :
   <f:out value="${e.loc}"/> <br/> 
  Head:
   <f:out value="${e.head}"/> <br/> 
  <hr/> 
   </f:forEach>

</body>
</html>