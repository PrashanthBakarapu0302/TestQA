package com.Interface;

public interface FamilyDetails {
	
	public void name();
	
	public void age();
	
	public void gender();
	
	public default void childrens()
	{
		commonmethods();
		System.out.println("NIrvireddy");
		System.out.println("VihaanRedy");
	}
	
	public static void oldAge()
	{
		commonmethods();
		System.out.println("Shivaam");
		System.out.println("sathavva");
	}

	
	private static void commonmethods()
	{
		System.out.println("ramreddy");
	}
}
