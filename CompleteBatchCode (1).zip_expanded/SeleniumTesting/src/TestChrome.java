import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestChrome {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
	/*	String title = driver.getTitle();
		title.length();*/
		
	/*	String title = driver.getTitle();
		title.length();
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();*/
		
		//
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		
		//System.out.println(driver.getTitle().length());
		
		
		//driver.findElement(By.xpath("")).sendKeys("");
/*		WebElement username = driver.findElement(By.xpath("//*[@id='identifierId']"));
		username.sendKeys("trainer@way2automation.com");
		
		WebElement button = driver.findElement(By.xpath("//*[@id='identifierNext']/content"));
		button.click();

		WebElement password = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		password.sendKeys("asdfsdf");*/
		
		
		driver.findElement(By.xpath("//*[starts-with(@id,'identif')]")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("asdfsfs");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"))).sendKeys("asdfsdf");
		
		
		
		driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();
	//	System.out.println(driver.findElement(By.xpath("//*[@id='password']/div[2]/div[2]")).getText());
		
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='password']/div[2]/div[2]"))).getText());
		
		
	}

}
