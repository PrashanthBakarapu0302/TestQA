package com.ExceptionalHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("programm start");
		
		int a=9,b=0,c;
		
		FileInputStream input= new FileInputStream("d://");
	
		try
		{
			c=a/b;	
			System.out.println(c);
			
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			throw ae;
		}
		
		finally
		{
			System.out.println("finally block");
		}
		//System.out.println(c);
		System.out.println("programm end");
		
	}
	
	}
