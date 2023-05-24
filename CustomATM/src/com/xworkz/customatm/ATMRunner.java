package com.xworkz.customatm;

import javax.naming.NameNotFoundException;

import com.xworkz.customatm.constant.BankNameIsNullException;
import com.xworkz.customatm.constant.DtoLengthOutOfSize;
import com.xworkz.customatm.constant.DtoNullException;
import com.xworkz.customatm.constant.IntegerIsZeroException;
import com.xworkz.customatm.constant.LocationIsNullException;
import com.xworkz.customatm.constant.LocationNotFoundException;
import com.xworkz.customatm.dao.AtmDao;
import com.xworkz.customatm.dto.AtmDto;

public class ATMRunner {
	
	public static void main(String[] args) {
		
		AtmDto dto = new AtmDto("SBI", "BTM Layout", "Debit Card", 40000, "24*7");
		AtmDto dto1 = new AtmDto("Axis", "Frazer Town", "Debit Card", 100000, "24/7");
		AtmDao dao = new AtmDao();
		
		
			
	 
		try {
			dao.saveDto(dto);
			dao.saveDto(null);
		} 
		catch (DtoLengthOutOfSize e) {
			e.printStackTrace();
		} catch (DtoNullException e) {
			e.printStackTrace();
		}
		
		AtmDto[] prnt = dao.readDto();
		for(int i=0; i<prnt.length;i++) {
			if(prnt[i]!=null) {
				System.out.println(prnt[i]);
			}
			
		}
		
		try {
			boolean show = dao.updateWithdrawalLimit("SBI", 0);
		} catch (IntegerIsZeroException | BankNameIsNullException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			boolean show1 = dao.searchdto("Canara");
		} catch (LocationNotFoundException e) {
			e.printStackTrace();
		} catch (LocationIsNullException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			boolean show2 = dao.deleteDto("Axis");
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		} catch (BankNameIsNullException e) {
			e.printStackTrace();
		}
	}

}
