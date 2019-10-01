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
  url="jdbc:mysql://localhost:3306/bank"
  user="root"
  password="root"
  />
  
   <sql:update var="accounts" dataSource="${conn}">
   Update Accounts set city=?,state=? where AccountNo=?
   <sql:param value="${param.city}" />
   <sql:param value="${param.state}" />
   <sql:param value="${param.accno}" />
   </sql:update>
   <a:out value="Account Updated successfully"/>
   

</body>
</html>