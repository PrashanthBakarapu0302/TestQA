package oopsConcepts;

public class ChildMethodOverride extends ParentOverride{

	public void T1()
	{
		System.out.println("child method override");
		super.T1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildMethodOverride obj= new ChildMethodOverride();
		obj.T1();
		
		
		ParentOverride obj1=new ParentOverride();
		obj1.T1();
		
		ParentOverride obj2= new ChildMethodOverride();
		obj2.T1();

	}

}
