package com.sample;

import java.io.File;
import java.io.IOException;
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

			URL url = new URL(request.getParameter("last_name"));

			File f = new File("\\test");
			try {
				FileUtils.copyURLToFile(url, f);
			} catch (IOException e) {
				e.printStackTrace();
			}

			name = request.getParameter("last_name");
			out.println("Hello " + name + " !!");
			out.println("<a href=\"" + f.getAbsolutePath() + "\">Download</a>");
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
