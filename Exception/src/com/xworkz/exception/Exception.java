package com.xworkz.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {
	
	

	public static void main(String[] args) {
		
		
		
		try {
			//ClassNotFound Exception
			Class.forName("vcdv");
			
			//FileNotFound Exception
			FileInputStream file = new FileInputStream("Boolean");
			System.out.println(file);
			
			//Arithmetic Exception
			int a=10;
			int b=a/0;
			System.out.println(b +"Arithmetic Exception");
		}
		catch (ArithmeticException exc){
			System.out.println("Arithmetic Exception Handled");
		}
		catch(FileNotFoundException ref) {
			System.out.println("FileNotFound Exception Handled");
			} 
		catch (ClassNotFoundException e){
			e.printStackTrace();
			System.out.println("ClassNotFound Exception Handled");
		}
	}

}
