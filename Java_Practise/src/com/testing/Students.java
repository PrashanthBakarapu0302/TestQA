package com.testing;

public class Students {

	String name;

	int hallno;
	

	
	Students (String name,int hallno)
	{
		this.name=name;
		this.hallno=hallno;
		
		System.out.println(name+" "+hallno);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Students st= new Students("prashanth",123);
	
		

	}

}
