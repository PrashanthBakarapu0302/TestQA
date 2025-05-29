package com.Methods;

public class WithoutReturntype {
	
	 void add()
	{
		int a=10,b=30;
		int c=a+b;
		System.out.println(c);
	}
	 
	 void sub()
	 
	 {
		 int a=100,b=200;
		 int c=b-a;
		 System.out.println(c);
		 
	 }

	 void mult()
	 {
		 int a=5,b=9;
		 int c=a*b;
		 System.out.println(c); 
	 }
	 
	 void adding(int a,int b)
	 {
		 int c=a+b;
		 System.out.println(c); 
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WithoutReturntype  obj= new WithoutReturntype ();
		obj.add();
		obj.sub();
		obj.mult();
		obj.adding(20, 90);

	}

}
