<%@page import="com.hcl.hib.CollegeCrud"%>
<%@page import="java.util.List"%>
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
	CollegeCrud c=new CollegeCrud();
	String fid=c.feedbackId();
	session.setAttribute("fid", fid);
	%> 
<form method="get" action="AddFeedback.jsp" name="frmFeedback" >
 Feedback Id :
 <input type="text" name="fid"  value=<%=fid %>>
 <% List<String>lstsub=CollegeCrud.instructorList(); %>
 Student Name :
  <input type="text" name="studentName" ><br/><br/> <br/><br/>
  <center>
   Instructor :
  <select name="instructor" onchange="change()">
  <option value="please select">Please select instructor</option>
  <%
    
		for(String s : lstsub){
			%>
			<option value="<%=s%>">  <%=s%></option>
			<% 
	
		}
	%>
   </select>
     </center>
     <%
	session.setAttribute("studentName",request.getParameter("studentName"));
	session.setAttribute("instructor",request.getParameter("instructor"));
	%>
	</form>
  
  
<h4>Please give your feedback</h4>
<form method="get" action="FeedBackConfirm.jsp">
  
  Select Subject :
  <select name="subject">
  <option value="dropdown"></option>
  <%
  String ins=request.getParameter("instructor");

  session.setAttribute("instructor", ins);
  List<String> lstinstr1=new CollegeCrud().subjectList(ins);
  for(String s : lstinstr1){
  %>
   <option value=<%=s%>><%=s%></option>
  <%
     }
  %>
  </select> 
  <input type="radio" id="choice1"
   name="feedback" value="Excellent">
  <label for="Choice1">Excellent</label>
  
   <input type="radio" id="choice2"
   name="feedback" value="Good">
  <label for="Choice2">Good</label>
  
  <input type="radio" id="choice3"
  name="feedback" value="Adequate">
  <label for="Choice3">Adequate</label>
  
  <input type="radio" id="choice4"
  name="feedback" value="Inadequate">
  <label for="Choice4">Inadequate</label>
  <input type="submit" value="show"/><br/><br/>
</form>
<script>
  function change() {
	  document.frmFeedback.submit();
  }
</script>					
</body>
</html>