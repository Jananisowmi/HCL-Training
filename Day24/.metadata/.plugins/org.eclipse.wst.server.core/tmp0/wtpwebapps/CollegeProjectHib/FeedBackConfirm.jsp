<%@page import="com.hcl.hib.CollegeCrud"%>
<%@page import="com.hcl.hib.Feedback"%>
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
  String fid=(String)session.getAttribute("fid");
  String studentName=(String)session.getAttribute("studentName");
  String instructor=(String)session.getAttribute("instructor");
  String subject=request.getParameter("subject");
  String fbvalue=request.getParameter("feedback");
 %>
<form method="get" action="FeedBackConfirm.jsp">
  <center>
   FeedBack ID:
   <input type="text" value=<%=fid%> name="fid" /><br/><br/>
   Student Name:
   <input type="text" value=<%=studentName%> name="studentName" /><br/><br/>
   Instructor:
   <input type="text" value=<%=instructor%> name="instructor" /><br/><br/>
   Subject:
   <input type="text" value=<%=subject%> name="subject" /><br/><br/>
   Feedback value:
   <input type="text" value=<%=fbvalue%> name="fbvalue" /><br/><br/>
    <input type="submit" value="Confirm Please"/>
  </center>

  <% 
        if(request.getParameter("fid") !=null && 
         request.getParameter("studentName") !=null &&
         request.getParameter("instructor") !=null &&
         request.getParameter("subject") !=null &&
         request.getParameter("fbvalue") !=null){
	     Feedback s=new Feedback();
	    s.setFid(request.getParameter("fid"));
	    s.setStudentName(request.getParameter("studentName"));
	    s.setInstructor(request.getParameter("instructor"));
	    s.setSubject(request.getParameter("subject"));
	    s.setFbvalue(request.getParameter("fbvalue"));
	    CollegeCrud crud=new CollegeCrud();
	    out.println(crud.insertFeedback(s));
} 
	%>

</form>
</body>
</html>