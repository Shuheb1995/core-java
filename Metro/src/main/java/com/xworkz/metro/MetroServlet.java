package com.xworkz.metro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.metro.dto.MetroDto;
import com.xworkz.metro.service.MetroService;
import com.xworkz.metro.service.MetroServiceImpl;
@WebServlet(urlPatterns="/pass")
public class MetroServlet extends HttpServlet {
	
	public MetroServlet() {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("doPost method is running");
		
		MetroDto metro = new MetroDto();
		
		metro.setid(req.getParameter("id"));
		metro.setName(req.getParameter("name"));
		metro.setCity(req.getParameter("city"));
		metro.setState(req.getParameter("state"));
		metro.setPincode(req.getParameter("pincode"));
		metro.setBirthDate(req.getParameter("birthDate"));
		metro.setGender(req.getParameter("gender"));
		metro.setMaritalStatus(req.getParameter("maritalStatus"));
		metro.setMobileNumber(req.getParameter("mobileNumber"));
		metro.setPeriod(req.getParameter("period"));
		metro.setFare(req.getParameter("fare"));
		
		MetroService service = new MetroServiceImpl();
		try {
			service.save(metro);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		resp.setContentType("text/HTML");
		PrintWriter writer = resp.getWriter();
		
		writer.println("<h1>"+"WELCOME TO BENGALURU METRO"+"</h1>");
		writer.println("<h3>"+metro.getid()+"</h3>");
		writer.println("<h3>"+metro.getName()+"</h3>");
		writer.println("<h3>"+metro.getCity()+"</h3>");
		writer.println("<h3>"+metro.getState()+"</h3>");
		writer.println("<h3>"+metro.getPincode()+"</h3>");
		writer.println("<h3>"+metro.getBirthDate()+"</h3>");
		writer.println("<h3>"+metro.getGender()+"</h3>");
		writer.println("<h3>"+metro.getMaritalStatus()+"</h3>");
		writer.println("<h3>"+metro.getMobileNumber()+"</h3>");
		writer.println("<h3>"+metro.getPeriod()+"</h3>");
		writer.println("<h3>"+metro.getFare()+"</h3>");
		
			
			
	}

}
