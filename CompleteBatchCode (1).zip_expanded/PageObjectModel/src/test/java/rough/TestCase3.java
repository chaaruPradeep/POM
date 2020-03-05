package rough;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
	
	@Test
	public void firstTest() {
		
		System.out.println("Inside first");
	}
	
	@Test
	public void secondTest() {
		
		System.out.println("Inside second");
		Assert.fail();
		
	}
	
	@Test
	public void thirdTest() {
		
		System.out.println("Inside Third");
	}

}
