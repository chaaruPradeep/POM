package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;

import base.Page;

public class HomePage extends Page {


	/*
	 * 
	 * 
	 * Logs
	 * keywords - click, type, select
	 * excel
	 * properties
	 * 
	 * 
	 */
	
	
	
	public LandingPage doLogin(String username,String password) {
		
		
		
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	
		return new LandingPage();
	
	}
	
	
	public void createAccount(String firstNAme,String surName, String dob) {
		
		
	}
	
	
	public void validateLinks() {
		
		
	}
	
	

}
