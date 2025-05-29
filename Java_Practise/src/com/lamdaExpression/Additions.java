package com.lamdaExpression;

public class Additions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj=(a,b)->
		{
			int c=a+b;
			System.out.println(c);
			return c;
		};
		obj.addition(10, 90);
		
		obj.m2();
		Calculator.m1();

	}

}
