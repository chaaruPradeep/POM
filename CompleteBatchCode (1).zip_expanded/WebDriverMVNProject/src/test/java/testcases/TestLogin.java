package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLogin {
	//TestNG

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 * English - UK
		 * English - US
		 * 
		 * 
		 */
		
		//driver.findElement(By.xpath("//*[@id='searchLanguage']")).sendKeys("Eesti");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchLanguage']"));
		
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Eesti");
		//select.selectByValue("hi");
		select.selectByIndex(0);
		//select.getOptions();
		
		driver.findElements(By.xpath("//*[@id='load_form']/div/div[2]/input")).get(1).click();
		
		
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
		
		System.out.println(values.size());
		
		System.out.println(values.get(7).getAttribute("lang"));
		
		for(int i=0; i<values.size(); i++) {
			
			System.out.println(values.get(i).getAttribute("lang"));
		}
		
		
		System.out.println("----Printing all link----");
		
		WebElement block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]"));
		
		
		
		List<WebElement> links = block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		for(WebElement link:links) {
			
			System.out.println(link.getText()+"---URL IS----"+link.getAttribute("href"));
		}
		
		
		
		
		
		
	}

}
