package com.InnerClass;

public class InnerClassTest {

	private int a=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first main method");
		
	
		

	}
	
	public class InnerClassTest3
	{
		public void show()
		{
			System.out.println(a);
		}
		
		public void test()
		{
			InnerClassTest3 obj= new InnerClassTest3();
			obj.show();
		}
	}

	private class InnerClassTest4
	{
		
	}
	protected class InnerClassTest5
	{
		
	}
}



 class InnerClassTest1 {

	

}
 
 class InnerClassTest2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("second main method");


		}

	}