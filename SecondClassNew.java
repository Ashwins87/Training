package Training1.Shell1;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondClassNew
{

	@Test 
	public void testcase1()
	{
		
		System.out.println("Test case sample completed");
	} //@test Annotation should always be present in a class
	
	@BeforeClass
	
	public static void newmethod()
	{
		System.out.println("New beofre class");
	}  //before class should be static
	
	@Before
	public void newbefore()
	{
		System.out.println("New method");
	}
}
