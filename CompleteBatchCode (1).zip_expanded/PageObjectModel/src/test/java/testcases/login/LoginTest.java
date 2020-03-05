package testcases.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;

public class LoginTest {
	
	@Test(/*dataProvider="getData"*/)
	public void doLogin(/*String username,String password*/) {
		
		HomePage home = new HomePage();
		LandingPage lp = home.doLogin("prafulgupta84@yahoo.in", "Selenium@123");
	
	}

	/*@DataProvider
	public Object[][] getData(){
		
		
	}*/
}
