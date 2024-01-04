package com.xworkz.payingguest;

import com.xworkz.payingguest.dto.PayingGuestDto;
import com.xworkz.payingguest.service.PayingGuestService;
import com.xworkz.payingguest.service.PayingGuestServiceImpl;

public class PayingGuestRunner {

	public static void main(String[] args) {
		
		PayingGuestDto dto = new PayingGuestDto(1,"Star Pg", "BTM 1st Stage", 5000,"Bed Space with gym",false,"24*7","Available");
		PayingGuestDto dto1 = new PayingGuestDto(2,"Legends Pg", "BTM 2nd Stage", 6000,"Bed Space with table",true,"24*7","Available");
		PayingGuestDto dto2 = new PayingGuestDto(3,"Pubg Pg", "Koramangala", 7000,"Bed Space with working space",true,"24*7","Available");
		PayingGuestDto dto3 = new PayingGuestDto(4,"FreeFire Pg", "Bommanahalli", 4500,"Bed Space 2 sharing",false,"24*7","Available");
		PayingGuestDto dto4 = new PayingGuestDto(5,"Ladies Pg", "JP Nagar", 5500,"Bed Space with Games",true,"24*7","Available");
		
		PayingGuestService service = new PayingGuestServiceImpl();
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
//		
//		PayingGuestDto find = service.findbyName("'Star Pg'");
//		System.out.println("Dto found by Name");
//		System.out.println(find);
//		
//		service.readAll();
//		
//		boolean update = service.updateByName("'Legends Pg'","Electronic City");
//		System.out.println("Dto updated");
//		System.out.println(update);
		
		boolean updating = service.updateLocationAndRentByName("'FreeFire Pg'", "Jp Nagar", 3000);
		System.out.println("Location and Rent Updated");
		System.out.println(updating);
		
		
//		boolean delete = service.deleteByName("'Star Pg'");
//		System.out.println("Dto is deleted");
//		System.out.println(delete);
		

	}

}
