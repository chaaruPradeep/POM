package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;

public class ChromeDriver implements WebDriver{
	
	
	public ChromeDriver() {
		
		System.out.println("Launch Chrome");
	}
	
	
public void get(String url) {
		
		System.out.println("Navigating to the URL in Chrome");
	}
	
	public void getTitle() {
		
		System.out.println("Getting the title in Chrome");
	}
	
	
	public void click() {
		
		System.out.println("Clicking on an Element in Chrome");
	}
	
	
	public void sendKeys() {
		
		System.out.println("Typing in an Element in Chrome");
	}


	@Override
	public void captureScreenshot() {


		System.out.println("Capturing screenshot in Chrome");
		
	}


}
