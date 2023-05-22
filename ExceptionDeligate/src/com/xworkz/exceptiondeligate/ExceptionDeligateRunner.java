package com.xworkz.exceptiondeligate;

import java.io.FileNotFoundException;

public class ExceptionDeligateRunner {
	
	public static void main(String[] args) {
		//Null Pointer Exception(Unchecked Exception)
		ExceptionDelegate.myMethod3();
		
		//Array Out Of Bound Exception(Unchecked Exception)
		ExceptionDelegate.null_excp("Ulaga Kuduka");
		
		try {
			//File Not Found Exception(checked Exception)
			ExceptionDelegate.myMethod();
			
			//Class Not Found Exception(checked Exception)
			ExceptionDelegate.myMethod1();
		
	}
		catch (FileNotFoundException ref){
			System.out.println("FileNotFoundException Handled");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ClassNotFoundException Handled");
		}
		}

}
