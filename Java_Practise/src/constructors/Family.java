package constructors;

public class Family {

	String names;
	double phoneNo;
	
	Family(String names,int phoneNo)
	{
		this.names=names;
		this.phoneNo=phoneNo;
		System.out.println(names+" "+ phoneNo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Family obj= new Family("Pr",7036177);
		
	Family obj1= new Family("rekha",123);
	
	
		
	}

}
