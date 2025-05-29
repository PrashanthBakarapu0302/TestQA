package inheritance;

public class ChildClass  extends ParentClass{

	public void m2()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj= new ChildClass();
	    obj.m2();
	    obj.m1();
	    
	    ParentClass obj1= new ParentClass();
	    obj1.m1();
	   
	    
	    ParentClass obj2= new ChildClass();
	    obj2.m1();
	    obj.m2();
	    
	    ChildClass obj3= new ChildClass();
	    obj3.m1();
	    obj3.m2();
	    

	}

}
