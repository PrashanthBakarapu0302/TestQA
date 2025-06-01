package hooksmy;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//one
public class HooksTest {
	
	
	@Before
	
		public void SetUp()
		{
			System.out.println("hello hooks setup");
		}
	
	@After
	public void TearDown()
	{
		System.out.println("teardown");
	}

}
