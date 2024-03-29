package com.cg.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int visitCount;

	@Override
	public void init() throws ServletException {
		visitCount=1001;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// setting response MIME type
		response.setContentType("text/html");
		
		//Getting output stream for response
		PrintWriter out = response.getWriter();
		
		//Printing HTML on response stream
		out.println("<h1>Hello Beautiful world</h1>");
		out.println("<h2>Welcome to my first servlet</h2>");
		out.println("<h1>Here you go</h1>");
		
		Date now = new Date();
		out.println("<h3>Visit time : " + now + "</h3>");
		
		//Getting servlet's configuration object
		ServletConfig config = getServletConfig();
		//Reading init-param from config
		String author = config.getInitParameter("Author");
		out.println("<h3>Servlet author: " + author + "</h3>");
		out.println("<h3> Servlet name: " + config.getServletName() +"</h3>");
		
		out.println("<h3>You're visitor no. " +  visitCount++ +"</h3>");
	}	
}
