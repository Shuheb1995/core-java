package com.xworkz.myntra;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/myntra")
public class MyntraServlet extends HttpServlet {
	
	public MyntraServlet() {
		System.out.println("Constructor is running");
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		System.out.println("Get method is running");
	}

}
