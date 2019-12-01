package org.shikhar.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("using web xml servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//using get
		String username = request.getParameter("username");
		out.println("Hello from get method" +username);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("using web xml servlet called");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//using get
		String username = request.getParameter("username");
		String fullname = request.getParameter("fullname");
		out.println("Hello from post method " +username + " " +fullname);
	    String prof = request.getParameter("prof");
	    out.println("you are" +" " + prof);
	   // String location = request.getParameter("location");
	   // out.println("you are" + " " +location);
	    //calling multiple parameters like checkbox
	   String[] location =  request.getParameterValues("location");
	   out.println("you are at " + " " +location.length + "places");
	   for(int i = 0; i<location.length;i++){
		   out.println(location[i]);
	   }
	}
}
