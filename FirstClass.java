package Training1.Shell1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstClass {

	@Test 
	public void testcase1()
	{
		
		System.out.println("Test case 1 completed");
	}
	
	
	@Before
	public void setup()
	{
		System.out.println("Before method");
		
	}
	
	@After
	public void teardown() 
	{
		System.out.println("After method");
	}
}
