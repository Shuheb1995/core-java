package com.xworkz.resumes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/resumes")
public class ResumesServlet extends HttpServlet {
	
	public ResumesServlet() {
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		String firstname = req.getParameter("firstName");
		String lastname = req.getParameter("lastName");
		String email = req.getParameter("email");
		String projectName = req.getParameter("projectName");
		String jobRole = req.getParameter("jobRole");

		System.out.println(firstname);

		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		writer.println("<h2>"+firstname+"</h2>");
		writer.println("<h2>"+lastname+"</h2>");
		writer.println("<h2>"+email+"</h2>");
		writer.println("<h2>"+projectName+"</h2>");
		writer.println("<h2>"+jobRole+"</h2>");
		
		
		
	
			}

}
