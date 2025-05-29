package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= Arrays.asList(10,20,30,50,40,69);
		
		List<Integer> Evenno=new ArrayList<>();
		List<Integer> Oddno=new ArrayList<>();
		
		for(int no:list)
		{
			if(no%2==0)
			{
				Evenno.add(no);
				
			}
			else
			{
				Oddno.add(no);
			}
	
			}
		System.out.println(Evenno);	
		System.out.println(Oddno);	

}
}