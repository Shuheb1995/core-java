package com.xworkz.exceptiondeligate;

import java.io.FileNotFoundException;

public class ExceptionThrow {
	
	public static void throw_check() throws ClassNotFoundException {
		int a = 0;
		
		throw new ClassNotFoundException("Handled Class Not Found Exception ");
		
	}
	public static void throw_checker() throws FileNotFoundException {
		
		String[] array = new String[5];
		throw new FileNotFoundException("File  Not Found Exception Handled");
	}

}
