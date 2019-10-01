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
  
  <sql:query var="accountQuery" dataSource="${conn}" >
select * from Accounts where accountNo=?
  <sql:param value="${param.accountNo}" />
   </sql:query>
<a:set var="flag" value="0" />

<a:forEach var="e" items="${accountQuery.rows}">
 
 First Name :
   <a:out value="${e.firstName}"/> <br/> 
  Last Name :
   <a:out value="${e.lastName}"/> <br/> 
  City :
   <a:out value="${e.city}"/> <br/> 
  State :
   <a:out value="${e.state}"/> <br/>
  Amount:
   <a:out value="${e.amount}"/> <br/> 
cheqFacility :
   <a:out value="${e.cheqFacil}"/> <br/>
   Account Type:
   <a:out value="${e.accountType}"/> <br/> <hr/> 
   <a:set var="flag" value="1" />
   </a:forEach>
   <a:if test="${flag==0}">
   <a:out value="Account No Not Fount" />
   </a:if>

<br/><br/>

</body>
</html>