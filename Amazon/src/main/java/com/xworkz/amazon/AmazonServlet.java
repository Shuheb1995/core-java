package com.xworkz.amazon;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/amazon")
public class AmazonServlet extends HttpServlet{
	
	public AmazonServlet() {
		System.out.println("Runs AmazonServlet");
	}
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) {
	System.out.println("Running doGet method");
}
}
