package com.ibm.exception;

public class ExceptionExample {
	
public static void main(String[] args) {
		
		try {
			int arr[] = {1,2,3,4,5};
			
			System.out.println(arr[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException | ArithmeticException | StringIndexOutOfBoundException e2) {
			
			
			System.out.println("Array boundary");
		}
		
		//catch(ArithmeticException ) {
		//	System.out.println("Some other");
		//}
		
		finally {
			System.out.println("Finally executed");
		}
	}

}
