package testnglearning;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 {
	
	
	@Test(groups= {"p1","p2"})
	public void validateTitle() {
		
		String actual_title  =  "Yahoo.com";
		String expected_title = "Gmail.com";
		
		
		
		//Boolean b = isElementPresent("//input");
		//Assert.assertEquals(expected_title, actual_title);
		Assert.assertTrue(false,"Element not found - Test case failed");
		System.out.println("Hello");
		Reporter.log("Test case failed");
		/*if(actual_title.equals(expected_title)) {
			
			System.out.println("Test case pass");
		}else {
			
			System.out.println("Test case fail");
		}*/
		
	}

}
