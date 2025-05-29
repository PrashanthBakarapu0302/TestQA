package com.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set= new HashSet<>();
		
		set.add(90);
		set.add(10);
		set.add(80);
		set.add(90);
		set.add(76);
		set.add(null);
		System.out.println(set);
		
Set<Integer> set1= new LinkedHashSet<>();
		
		set1.add(90);
		set1.add(10);
		set1.add(80);
		set1.add(90);
		set1.add(76);
		set1.add(null);
		System.out.println(set1);
		
		LinkedHashSet<String> se= new LinkedHashSet<>();
		se.add("prashanth");
		se.add("reddy");
		se.add("bakarapu");
		se.add("hello");
		se.add("Reddy");
		se.add(null);
		se.add(null);
		System.out.println(se);
		
   Set<Integer> set2= new TreeSet<>();
	    set2.add(90);
		set2.add(10);
		set2.add(80);
		set2.add(90);
		set2.add(76);
		set2.add(5);
		set2.add(76);
		System.out.println(set2);
		
		TreeSet<String> se1= new TreeSet<>();
		se1.add("prashanth");
		se1.add("reddy");
		se1.add("bakarapu");
		se1.add("hello");
		se1.add("Reddy");
		se1.add("apple");
		se1.add("bakarapu");
		
		System.out.println(se1);
	
		
		

	}

}
