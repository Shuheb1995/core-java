package com.xworkz.exceptiondeligate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDelegate {
	
	public static void myMethod() throws FileNotFoundException {
		FileInputStream ref = new FileInputStream("C://bool");
		
	}
	
	public static void myMethod1() throws ClassNotFoundException {
		Class.forName("hjfytf");
	}
	
	public static void myMethod3() {
		String[] array = new String[3];
		System.out.println(array[5]);
	}
	
	public static void null_excp(String name) {
		name = null;
		name.equals(name);
		System.out.println(name);
	}

}
