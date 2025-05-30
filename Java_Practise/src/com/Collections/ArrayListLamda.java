package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list= Arrays.asList(20,49,87,76);
		List<Integer> even=new ArrayList<>();
		
		even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(even);
		
		//we have string name but i need the length of string in b/w 5 to 7
		
		
		List<String> list1= Arrays.asList("nirviB","rekha","vihaan","tom","pr","gaddam");
		List<String> even1=new ArrayList<>();
		
		even1=list1.stream().filter(str->str.length()>5 && str.length()<7).collect(Collectors.toList());
		System.out.println(even1);
		
		List<Integer> cart= Arrays.asList(20,49,87,76,90,79,10,30);
		List<Integer> sort=new ArrayList<>();
		
		sort=cart.stream().filter(n->n>10 && n<=49).collect(Collectors.toList());
		System.out.println(sort);
		
		
		List<String> arr= Arrays.asList("nirviB","rekha","vihaan","tom","pr","gaddam");
		List<String> arr1=new ArrayList<>();
		
		arr1=arr.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(arr1);
		
	}

}
