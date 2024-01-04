package com.xworkz.metro;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.metro.dto.MetroDto;
import com.xworkz.metro.service.MetroService;
import com.xworkz.metro.service.MetroServiceImpl;

@WebServlet(urlPatterns = "/search")
public class MetroServlets extends HttpServlet {

	public MetroServlets() {
		System.out.println("Search Method is running");
	}
	
	MetroDto metro = new MetroDto();
	MetroService service = new MetroServiceImpl();

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		

		System.out.println("Search DoPost method is Running");

		
		
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String pincode = req.getParameter("pincode");
		String birthDate = req.getParameter("birthDate");
		String gender = req.getParameter("gender");
		String maritalStatus = req.getParameter("maritalStatus");
		String mobileNumber = req.getParameter("mobileNumber");
		String period = req.getParameter("period");
		String fare = req.getParameter("fare");


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

		
		
		resp.setContentType("text/HTML");
		PrintWriter writers = resp.getWriter();

		try {
			ResultSet found = service.find(metro,name);
			System.out.println(found);
			System.out.println("print service object");
		} catch (Exception e) {

			e.printStackTrace();
		}

		

		writers.println("<h1>" + "WELCOME TO BENGALURU METRO " +name+ "</h1>");
		writers.println("<h3>" + metro.getid() + "</h3>");
		writers.println("<h3>" + metro.getName() + "</h3>");
		writers.println("<h3>" + metro.getCity() + "</h3>");
		writers.println("<h3>" + metro.getState() + "</h3>");
		writers.println("<h3>" + metro.getPincode() + "</h3>");
		writers.println("<h3>" + metro.getBirthDate() + "</h3>");
		writers.println("<h3>" + metro.getGender() + "</h3>");
		writers.println("<h3>" + metro.getMaritalStatus() + "</h3>");
		writers.println("<h3>" + metro.getMobileNumber() + "</h3>");
		writers.println("<h3>" + metro.getPeriod() + "</h3>");
		writers.println("<h3>" + metro.getFare() + "</h3>");

		
	}

}
