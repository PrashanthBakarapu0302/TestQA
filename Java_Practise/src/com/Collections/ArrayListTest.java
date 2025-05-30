package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list);
			break;
		}
		
		for(int nu:list)
		{
			//System.out.println(nu);
		}
		
		
		//while we are adding the variables to list we have written some big code
		
		List<Integer> li=Arrays.asList(10,20,30,40,50,60,99);
		List<Integer> evenno=new ArrayList<>();
		for(int no:li)
		{
			//System.out.println(no);
			//here i need to find the even numbers
			if(no%2==0)
			{
				evenno.add(no);
				
			}
			
		}
     System.out.println(evenno);
	
		
		
		/*List<String> list1=Arrays.asList("prashanth","reddy","bakarapu");
		
		for(String x:list1)
		{
			System.out.println(x);
		}*/
	}

}
