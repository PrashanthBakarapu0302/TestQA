package com.PojoTest;

import org.junit.Test;

import com.PojoClassess.OrangeHRM;
import com.Utilities.JsonUtil;

public class OrangeTest {
	
	
	@Test
	public void Orange()
	{
		
		
		JsonUtil.fromJsonFile("src\\test\\java\\com\\JsonFiles\\orangeHRM.json",OrangeHRM.class);
		
	}

}
