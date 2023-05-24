package com.xworkz.customexception;

import com.xworkz.customexception.constant.IndexOutOfLimitException;
import com.xworkz.customexception.constant.NameIsNullException;

public class CustomException {

	public static void custom_expn(String name) throws NameIsNullException {
		if (name != null) {
			
			name.equals(name);
			System.out.println(name);
			return;
		}
		throw new NameIsNullException("Customised or User Defined Exception");
	}

	public static void custom_expn1(String name) throws IndexOutOfLimitException {
	if (name != null) {
			String[] files = new String[10];
			for (int i = 0; i < files.length; i++) {
				if (files[i] == null) {
					files[i] = name;
					System.out.println(files[i]);
					return;
				}

			}

		}
		throw new IndexOutOfLimitException("My own Power of Exception");

	}

}
