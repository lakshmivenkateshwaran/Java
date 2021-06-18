package com.ibm.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsException {
	
	public static void main(String[] args)throws IOException {
		
		FileInputStream fis = null;
		
		fis = new FileInputStream("D:\\Java\\Workspace\\sample.java");
		int k;
		
		while((k = fis.read() ) != -1)
		{
			System.out.println((char)k);
		}
		
		fis.close();
		
		
	}

}
