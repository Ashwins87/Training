package Training1.Shell1;

import org.junit.Test;

import junit.framework.Assert;



public class CountTest {


	@Test
	    public void test1() throws Exception {
	        Count.add();
	        Assert.assertEquals(1, Count.count);//pass.Now count=1
	        System.out.println("Test step pass");
	    }

	    @Test
	    public void test2() throws Exception {
	    	try
	    	{
	        Count.add();
	        Assert.assertEquals(2, Count.count);//error, now the count=2
	        
	    	}
	    	
	    }
}
