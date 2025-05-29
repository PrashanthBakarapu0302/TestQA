package typeCasting;

public class ChildTest extends ParentTest{

	
	public void m2()
	{
		System.out.println("hello child class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//creating the child but refer to parent class-upcasting
		ParentTest obj= new ChildTest();
		obj.m1();
		
		//down casting.
		ParentTest p= new ChildTest();
		ChildTest c= (ChildTest) p;
		
		c.m1();
		c.m2();
		
		
		
	}

}
