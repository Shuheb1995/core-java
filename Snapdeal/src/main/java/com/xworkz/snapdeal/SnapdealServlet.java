package com.xworkz.snapdeal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/snapdeal")
public class SnapdealServlet extends HttpServlet {

	public SnapdealServlet() {
		System.out.println("SnapdealServlet Constructor is running");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("SnapdealServlet doGet method is running ");
		String username = req.getParameter("name");
		String email = req.getParameter("email");

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h2>What are you doing here</h2>");
		writer.println(username);
		writer.println(email);
	}

}
