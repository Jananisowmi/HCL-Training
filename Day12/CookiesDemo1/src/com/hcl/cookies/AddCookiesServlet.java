package com.hcl.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookiesServlet
 */
public class AddCookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookiesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Cookie ckAnand=new Cookie("Anand" ,"52");
		ckAnand.setMaxAge(1000*24*60*60);
		response.addCookie(ckAnand);

		Cookie ckBindu=new Cookie("Bindu" ,"62");
		ckBindu.setMaxAge(1000*24*60*60);
		response.addCookie(ckBindu);
		
		Cookie ckJaanu=new Cookie("Jaanu" ,"72");
		ckJaanu.setMaxAge(1000*24*60*60);
		response.addCookie(ckJaanu);
		
		Cookie ckAnisha=new Cookie("Anisha" ,"82");
		ckAnisha.setMaxAge(1000*24*60*60);
		response.addCookie(ckAnisha);
		
		Cookie ckHema=new Cookie("Hema" ,"92");
		ckHema.setMaxAge(1000*24*60*60);
		response.addCookie(ckHema);
		
		out.println("Cookie Created Successfully <br/><br/>");
		out.println("<a href='ShowCookieServelt' > Show Cookie <br/><br/>");
	
	
	
	
	
	
	
	
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
