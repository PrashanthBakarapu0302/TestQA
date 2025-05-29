package com.Strings;

public class StringTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  String str="prashanth";
  
  //Length of the String
  
  System.out.println(str.length());
	//charAt	
  System.out.println(str.charAt(8)); 
		
  for(int i=0;i<str.length();i++)
  {
	 char ch= str.charAt(i);
	 System.out.println(ch);
  }
  
  //concat
  
  String s1="prashanth";
  String s2="reddy";
  String s=s1.concat(s2);
  System.out.println(s);
  
  //compare and compareToIngnoreCase to metod will compare it will give the unicode value.
   
  String c1="nirvi";
  String c2="NIRVI";
  System.out.println(c1.compareTo(c2));
  System.out.println(c1.compareToIgnoreCase(c2));
  
  //equals and equalsToIgnoreCase
  System.out.println(c1.equals(c2));
  
  System.out.println(c1.equalsIgnoreCase(c2));
  
  //startsWith and endswith
  String s3="nirvi";
  System.out.println(s3.startsWith("ni"));
  System.out.println(s3.endsWith("iv"));
  
  
  //int indexOf - this method will return the index of 1st occurrence of the specified index.
  
  String t1="hello";
  System.out.println(t1.indexOf('l'));
  System.out.println(t1.lastIndexOf('l'));
  
  
  //String Replace
  
  String q="testing";
  System.out.println(q.replace('t', 'a'));
  
  
  //SubString 
  String q1="testing";
  System.out.println(q1.substring(1));
  System.out.println(q1.substring(1, 3));
  
  //String toUpperCase toLowerCase
  String q2="teSTting";
  System.out.println(q2.toUpperCase());
  System.out.println(q2.toLowerCase());
  
  //trim remove the starting and ending spaces in the string
  String y1=" hello java welcome ";
  System.out.println(y1.trim() );
  
   
	}

}
