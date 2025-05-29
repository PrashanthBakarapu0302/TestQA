package com.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationChildclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Akhilesh\\OneDrive\\Desktop\\file\\prash.txt");
ObjectOutputStream oos= new ObjectOutputStream(fos);
SerilizationTest obj= new SerilizationTest();

oos.writeObject(obj);
oos.close();

		
	}

	
}
