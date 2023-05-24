package com.xworkz.customatm.dao;

import javax.naming.NameNotFoundException;

import com.xworkz.customatm.constant.BankNameIsNullException;
import com.xworkz.customatm.constant.DtoLengthOutOfSize;
import com.xworkz.customatm.constant.DtoNullException;
import com.xworkz.customatm.constant.IntegerIsZeroException;
import com.xworkz.customatm.constant.LocationIsNullException;
import com.xworkz.customatm.constant.LocationNotFoundException;
import com.xworkz.customatm.dto.AtmDto;

public class AtmDao {

	AtmDto[] atm = new AtmDto[1];

	public boolean saveDto(AtmDto dto) throws DtoLengthOutOfSize, DtoNullException {
		if (dto != null) {
			if (dto.getBankName() != null && dto.getBankName().length() < 6) {
				for (int i = 0; i < atm.length; i++) {
					if (atm[i] == null) {
						atm[i] = dto;
						System.out.println("dto is Saved");
						return true;
					}

				}
				return false;
			}
			throw new DtoLengthOutOfSize("Dto Length is greater than size");
		}
		throw new DtoNullException("Dto is null");

	}

	public AtmDto[] readDto() {
		return atm;
	}

	public boolean updateWithdrawalLimit(String bankName, int maxWithdraw)
			throws IntegerIsZeroException, BankNameIsNullException {
		if (bankName != null) {
			if (maxWithdraw != 0) {
				for (int i = 0; i < atm.length; i++) {
					if (atm[i] != null && atm[i].getBankName() != null) {
						if (atm[i].getBankName().equals(bankName)) {
							atm[i].setMaxWithdraw(maxWithdraw);
							System.out.println("Withdrawal Limit Updated");
							return true;
						}
					}
				}
				return false;

			}
			throw new IntegerIsZeroException("int should have a value");

		}
		throw new BankNameIsNullException("Bank Name should not be null");

	}

	public boolean searchdto(String location) throws LocationNotFoundException, LocationIsNullException {
		if (location != null) {
			for (int i = 0; i < atm.length; i++) {
				if (atm[i] != null && atm[i].getLocation() != null) {
					if (atm[i].getLocation().equals(location)) {
						System.out.println("Found ATM by location");
						return true;
					}
				}

			}
			throw new LocationNotFoundException("Give valid location");
		}
		throw new LocationIsNullException("Location should not be null");
	}

	public boolean deleteDto(String bankName) throws NameNotFoundException, BankNameIsNullException {
		if (bankName != null) {
			for (int i = 0; i < atm.length; i++) {
				if (atm[i] != null && atm[i].getBankName() != null) {
					if (atm[i].getBankName().equals(bankName)) {
						atm[i].setBankName(null);
						System.out.println("Bank Name is Deleted");
						return true;
					}
				}

			}
			throw new NameNotFoundException("Give Valid name to delete Dto");
		}
		throw new BankNameIsNullException("Enter Bank Name, Bank Name should not be null");
	}

}
