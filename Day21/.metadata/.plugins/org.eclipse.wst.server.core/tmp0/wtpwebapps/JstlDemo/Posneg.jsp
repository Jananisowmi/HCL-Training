<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <b:set var="x" value="-12" />
 <b:if test="${x>=0}" >
  <b:out value="Positive No" />
 </b:if>
 <b:if test="${x<0}" >
  <b:out value="Negative No" />
  </b:if>
 
  
</body>
</html>