package com.revature.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		resp.getWriter().write("Hello World");
	}
}
