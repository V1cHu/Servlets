package com.sample;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

@SuppressWarnings("serial")
public class ServletEx extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException {
		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String name;

			name = request.getParameter("last_name");

			File f = new File(File.separator + "test");
			URL url = new URL("http://i.imgur.com/ZrFEoC4.jpg");
			FileUtils.copyURLToFile(url, f);

			out.println("Hello " + name + " !!");
			out.println();
			out.println("<a href=\"test\">Download</a>");
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
