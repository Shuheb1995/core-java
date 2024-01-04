package com.xworkz.pizza;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.xworkz.pizza.dto.PizzaDto;
@WebServlet(urlPatterns = "/pizza")
public class PizzaServlet extends HttpServlet{
	
	public PizzaServlet() {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("doPost method is running");
		
		PizzaDto dto = new PizzaDto();
		dto.setPizzaName(req.getParameter("pizzaName"));
		dto.setType(req.getParameter("type"));
		dto.setSize(req.getParameter("size"));
		dto.setLocation(req.getParameter("location"));
		dto.setPaymentMode(req.getParameter("paymentMode"));
		
		String pizza = req.getParameter("pizzaName");
		String type = req.getParameter("type");
		String size = req.getParameter("pizzaSize");
		String location = req.getParameter("location");
		String pay = req.getParameter("paymentMode");
		
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		
		writer.println("<h2>"+pizza+"</h2>");
		writer.println("<h2>"+type+"</h2>");
		writer.println("<h2>"+size+"</h2>");
		writer.println("<h2>"+location+"</h2>");
		writer.println("<h2>"+pay+"</h2>");
	}
	

}
