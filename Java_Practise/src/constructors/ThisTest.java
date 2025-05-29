package constructors;

public class ThisTest {

	int a=10,b=20;
	
	void m1()
	{
		int a=30,b=40;
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisTest obj= new ThisTest();
		obj.m1();
		
		
	}

}
