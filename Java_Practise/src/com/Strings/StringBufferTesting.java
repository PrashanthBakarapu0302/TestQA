package com.Strings;

public class StringBufferTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer buffer= new StringBuffer("hello");
		//length of the given string
		System.out.println(buffer.length());
		
		//append--add the string with existing string.
		
		StringBuffer sb= new StringBuffer("welcome");
		sb.append("testing");
		sb.append(" nizamabad  ");
		
		System.out.print(sb);
		//delet specific index
		//System.out.print(sb.deleteCharAt(0));
		
		System.out.println(sb.delete(2, 6));
		
		
		//substring
		StringBuffer sb1= new StringBuffer("testingtools");
		sb1.substring(1);
		System.out.println(sb1);
		
		String yi= "testingtools";
		StringBuffer bu= new StringBuffer(yi);
		bu.reverse();
		System.out.println(bu);
		
		

	}

}
