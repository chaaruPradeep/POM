package base;

import org.openqa.selenium.By;

import pages.LandingPage;

public class TopNavigation {
	
	

	public void logOut() {

		Page.driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		Page.driver.findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
		
	}

	public LandingPage gotoLandingPage() {

		Page.driver.findElement(By.xpath("//div[1]/h1/a/span[contains(text(),'Facebook')]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new LandingPage();
	}

	public void doSearch() {

	}

}
