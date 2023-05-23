package com.xworkz.customexception;

import com.xworkz.customexception.constant.IndexOutOfLimitException;
import com.xworkz.customexception.constant.NameIsNullException;

public class CustomRunner {
	
	public static void main(String[] args) {
		try {
			CustomException.custom_expn(null);
		} catch (NameIsNullException e) {
			e.printStackTrace();
		}
		
		try {
			CustomException.custom_expn1(null);
		} catch (IndexOutOfLimitException e) {
			e.printStackTrace();
		}
	}

}
