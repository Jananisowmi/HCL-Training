<%@page import="com.hcl.hib.CollegeCrud"%>
<%@page import="com.hcl.hib.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddSubject.jsp" name="productForm">
<select name="subject" id="dropdown" onchange="change()">

 <option value="dropdown">please select</option>
 <option value="TPDE">TPDE</option>
 <option value="DigitalElectronics">DigitalElectronics</option>
 <option value="DSP">DSP</option>
 <option value="Networking">Networking</option>
 <option value="MobileCommunication">MobileCommunication</option>
 <option value="Java">Java</option>
 </select>
 <br/><br/>
  
  
   Theory : 
   <input type="text" name="theory"  readonly="readonly"/> <br/><br/>
   
   Practical :
   <input type="text" name="practical"  readonly="readonly"/> <br/><br/>
   
   Year :
   <input type="text" name="year"/> <br/><br/>
   
   Instructor :
   <input type="text" name="instructor" /> <br/> <br/>
   <input type="submit" value="Click" /> <br/><br/>
   


<script>
        function change(){
        var j= document.getElementById("dropdown").value;
        
       
        if(j =="TPDE"){
        	productForm.theory.value="42";
        	productForm.practical.value="14";
        }
        if(j =="DigitalElectronics"){
        	productForm.theory.value="90";
        	productForm.practical.value="50";
        }
        if(j =="DSP"){
        	productForm.theory.value="69";
        	productForm.practical.value="41";
        }
        
        if(j =="Networking"){
        	productForm.theory.value="69";
        	productForm.practical.value="41";
        }
        
        if(j =="MobileCommunication"){
        	productForm.theory.value="107";
        	productForm.practical.value="93";
        }
        
        if(j =="Java"){
        	productForm.theory.value="84";
        	productForm.practical.value="56";
        }
        }
        </script>
   <% if( request.getParameter("year")!=null &&
     request.getParameter("instructor")!=null &&
     request.getParameter("subject")!=null &&
     request.getParameter("theory")!=null &&
     request.getParameter("practical")!=null)
       {
	  Subject s=new Subject();
	s.setYear(Integer.parseInt(request.getParameter("year"))) ;
	s.setInstructor(request.getParameter("instructor"));
	s.setSubject(request.getParameter("subject"));
	s.setTheory(Integer.parseInt(request.getParameter("theory"))) ;
	s.setPractical(Integer.parseInt(request.getParameter("practical"))) ;
	 CollegeCrud crud=new CollegeCrud();
	out.println(crud.insertSubject(s));
  }
 %>
 
</form>
</body>
</html>