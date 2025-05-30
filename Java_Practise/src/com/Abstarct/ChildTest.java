package com.Abstarct;

public class ChildTest extends AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     AbstractTest.m2();
     //testing tools
		
		ChildTest obj= new ChildTest();
		obj.m1();
		
		
		
		
		

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hello abstartct parent class");
		
	}

}
