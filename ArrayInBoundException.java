package com.ibm.exception;

public class ArrayInBoundException {
	
	public static void main(String[] args) {
		
		try {
			int arr[] = {1,2,3,4,5};
			
			System.out.println(arr[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array boundary");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Some other");
		}
		
		finally {
			System.out.println("Finally executed");
		}
	}

}
