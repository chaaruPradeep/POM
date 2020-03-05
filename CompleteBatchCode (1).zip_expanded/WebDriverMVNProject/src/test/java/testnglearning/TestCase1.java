package testnglearning;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@AfterTest
	public void closeDBConn() {
		
		System.out.println("Closing db conn");
		
	}
	
	@BeforeMethod
	public void launchBrowser() {
		
		System.out.println("Launching browser");
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Closing the browser");
	}
	
	
	@Test(priority=1,groups="p1")
	public void doUserReg() {
		
		
		System.out.println("Executing user reg test");
		Assert.fail();
		
	}
	
	@Test(priority=2,groups="p2")
	public void doLogin() {
		
		System.out.println("Executing login test");
		Reporter.log("Inside Login Test");
		
	}
	
	@BeforeTest
	public void createDBConn() {
		
		System.out.println("Creating db conn");
		
	}
	
	


}
