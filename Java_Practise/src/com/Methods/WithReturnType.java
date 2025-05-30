package com.Methods;

public class WithReturnType {

	int add()
	{
		int a=10,b=80;
		int c=a-b;
		return c;
		
	}
	
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithReturnType obj= new WithReturnType();
		System.out.println(obj.add());
		System.out.println(obj.add(90, 80));

	}

}
