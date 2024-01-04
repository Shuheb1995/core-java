package com.xworkz.meesho;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/meesho")
public class MeeshoServlet extends HttpServlet {
	
	public MeeshoServlet() {
		System.out.println("Meesho Constructor");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Meesho doGet method is running");
	}

}
