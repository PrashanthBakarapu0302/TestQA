package oopsConcepts;

public class MethodOverloadingTest {

	public void m1()
	{
		System.out.println("hello m1-0");
	}
	
	public void m1(int a)
	{
		System.out.println("hello m1-1");
	}
	
	public void m1(int a,int b)
	{
		System.out.println("hello m1-2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingTest obj= new MethodOverloadingTest();
		
		obj.m1(10);
		obj.m1();
		obj.m1(10, 90);

	}

}
