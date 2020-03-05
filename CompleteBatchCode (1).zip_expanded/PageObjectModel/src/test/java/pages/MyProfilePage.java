package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Page;

public class MyProfilePage extends Page {
	

	
	public MyProfilePage uploadImage() {
		
		
		//driver.findElement(By.xpath("//a[contains(@id,'_g')]")).click();
		//driver.findElement(By.xpath("//div/a[@data-action-type='upload_photo']/div/input[starts-with(@id,'js_')][@title='Choose a file to upload']")).sendKeys("C:\\Users\\WAY2AUTOMATION\\Desktop\\logo.png");
		System.out.println("Image Uploaded !!!");
		return this;
	}
	
	
	public void gotoFriends() {
		
		
	}
	
	
	public void gotoPhotos() {
		
		
	}

}
