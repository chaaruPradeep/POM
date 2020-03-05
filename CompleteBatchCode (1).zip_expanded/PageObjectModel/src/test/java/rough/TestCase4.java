package rough;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4 {
	
	
	
	@Test
	public void firstTest() {
		
		System.out.println("Inside first - from test 4");
	}
	
	@Test
	public void secondTest() {
		
		System.out.println("Inside second - from test 4");
		Assert.fail();
		
	}
	
	@Test
	public void thirdTest() {
		
		System.out.println("Inside Third - from test 4");
	}

}
