package com.sample;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServletEx extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException {
		try {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String name;

			name = request.getParameter("last_name");

			DownloadFile downloadFile = new DownloadFile();

			// URL website = new URL("http://i.imgur.com/ZrFEoC4.jpg");

			// https://upload.wikimedia.org/wikipedia/commons/3/31/Mark_Zuckerberg_at_the_37th_G8_Summit_in_Deauville_018_v1.jpg
			// http://i.imgur.com/ZrFEoC4.jpg

			out.println("Hello " + name + " !!");
			out.println("<a href=\"/file.old\">Download</a>");
			out.println(downloadFile.download());
			out.println(downloadFile.getStatus());
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
