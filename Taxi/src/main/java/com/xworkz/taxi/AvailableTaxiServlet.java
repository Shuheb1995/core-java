package com.xworkz.taxi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;


@WebServlet(urlPatterns = "/find")
public class AvailableTaxiServlet extends HttpServlet {
	
	TaxiService service = new TaxiServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		List<TaxiDto> data = service.findAllTaxiAvailable();
		PrintWriter writer = resp.getWriter();
		writer.print("<h2>Available Taxis</h2>");
		writer.print("<table border=1>");
		for(TaxiDto dto : data){
			writer.print("     <tr>");
			writer.print("     <td>");
			writer.print(dto.getTaxiNumber());
			writer.print("</td>");
			
			writer.print("     <td>");
			writer.print(dto.getEarnings());
			writer.print("</td>");
			
			writer.print("     <td>");
			writer.print(dto.getLocation());
			writer.print("</td>");
			
			writer.print("     <td>");
			writer.print(dto.getTrips());
			writer.print("</td>");
			writer.print("</tr>");
	}
		writer.print("</table>");
		writer.print("<button type=\"submit\">Book Taxi</button>");
		
//		req.getRequestDispatcher("/Book.jsp").forward(req, resp);
	}
	
	

}
