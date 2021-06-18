package com.ibm.exception;

public class ArithmaticException {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
			int z =i/j;
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
			System.out.println("Never divide this number");
			
		}
	}

}
