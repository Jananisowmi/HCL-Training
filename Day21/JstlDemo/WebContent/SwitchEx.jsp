<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="e" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <e:set var="no" value="${param.no}" />
 Selected Value is: <e:out value="${no}" />
 <e:choose>
        <e:when test="${no==1}">
        <e:out value="Hi I am Adityakohli..." />
       </e:when>
  
        <e:when test="${no==3}">
        <e:out value="Hi I am Janani..." />
       </e:when>
       
       <e:when test="${no==5}">
        <e:out value="Hi I am kohli..." />
       </e:when>
       <e:otherwise>
       <e:out value="Invalid Chioce" />
       </e:otherwise>
       </e:choose>
   
  
  
</body>
</html>