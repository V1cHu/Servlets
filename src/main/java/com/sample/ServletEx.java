package com.sample;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletEx extends HttpServlet  {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException{
		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String name;

			name = request.getParameter("last_name");
			out.println("Hello " + name + " !!");
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
