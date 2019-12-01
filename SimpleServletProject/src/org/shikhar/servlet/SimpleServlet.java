package org.shikhar.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A google servlet", urlPatterns = { "/SimpleServletPath" })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//this will print to log file in console
		System.out.println("Hello from do get method");
		//send html to client
		PrintWriter writer = response.getWriter();
		writer.println("<h3>Helllo in Html</h3>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
