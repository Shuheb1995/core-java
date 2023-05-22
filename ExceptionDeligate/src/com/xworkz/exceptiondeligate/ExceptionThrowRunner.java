package com.xworkz.exceptiondeligate;

import java.io.FileNotFoundException;

public class ExceptionThrowRunner {

	public static void main(String[] args) {
		
		try {
		ExceptionThrow.throw_check();
		ExceptionThrow.throw_checker();
		}
		catch(ClassNotFoundException cls) {
			cls.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
