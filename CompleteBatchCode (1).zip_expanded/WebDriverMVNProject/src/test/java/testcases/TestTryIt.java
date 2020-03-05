package testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestTryIt {
	
	public static WebDriver driver;
	
	
	public static void captureElementScreenshot(WebElement ele) throws IOException {
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg = ImageIO.read(screenshot);
		// Get the location of element on the page
		Point point = ele.getLocation();

		// Get width and height of the element
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
		    eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", screenshot);

		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
	
		// Copy the element screenshot to disk
		File screenshotLocation = new File(System.getProperty("user.dir")+"//screenshot//"+"Element_"+fileName);
		FileUtils.copyFile(screenshot, screenshotLocation);
	}
	
	
	public static void captureScreenshot() throws IOException {
		
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
	
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"//screenshot//"+fileName));
	
	}

	public static void main(String[] args) throws IOException {

		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("iframeResult");
		//driver.findElement(By.xpath("/html/body/button")).click();
		 ((JavascriptExecutor) driver).executeScript("myFunction()");
		 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.xpath("//*[@id='mySubmit']")));
		 
		 
		 
		driver.switchTo().defaultContent();

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println(frames.size());

		for (WebElement frame : frames) {

			System.out.println(frame.getAttribute("id"));
		}
		
		
		captureScreenshot();
		captureElementScreenshot(driver.findElement(By.xpath("html/body/div[5]/div/button")));
		
	}

}
