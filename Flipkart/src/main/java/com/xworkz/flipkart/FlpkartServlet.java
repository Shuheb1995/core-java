package com.xworkz.flipkart;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/varumnbodybuilder")
public class FlpkartServlet extends HttpServlet {
	
	public FlpkartServlet() {
		System.out.println("This is Servlet Servor");
	}
@Override
public void doGet(HttpServletRequest req, HttpServletResponse resp) {
	System.out.println("doGet Method is Running");
}
}
