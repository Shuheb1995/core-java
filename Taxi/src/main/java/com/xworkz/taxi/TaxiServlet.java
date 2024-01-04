package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

@WebServlet(value = "/save")
public class TaxiServlet extends HttpServlet{
	
	public TaxiServlet() {
		super();
		System.out.println("Constructor is running");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Do Post Method Started");
		
		String taxiNumber = req.getParameter("taxiNumber");
		String earnings = req.getParameter("earnings");
		String isAvailabe = req.getParameter("isAvailable");
		String location = req.getParameter("location");
		String trips = req.getParameter("trips");
		
		TaxiDto dto = new TaxiDto(taxiNumber , earnings , Boolean.valueOf(isAvailabe) , location , trips);
		System.out.println(dto);
		TaxiService service = new TaxiServiceImpl();
		boolean save = service.saveTaxi(dto);
		System.out.println(save);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		req.getRequestDispatcher("/BookTaxi.jsp").forward(req , resp);
	}

}
