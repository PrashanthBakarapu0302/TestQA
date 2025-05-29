package constructors;

public class ParentTest extends Base {
	
	int a=30;
	
	void m2()
	{
		int a=40;
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println(super.a);
		
		System.out.println(super.m1());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ParentTest obj= new ParentTest();
		obj.m2();
	}

}
