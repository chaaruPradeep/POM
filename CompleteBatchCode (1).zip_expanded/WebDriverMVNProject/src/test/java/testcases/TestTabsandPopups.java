package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTabsandPopups {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver,20);
		
		System.out.println("---Generating window ids from first window---");
		Set<String> winids = driver.getWindowHandles();
		
		Iterator<String> iterator = winids.iterator();
		
		String first_window = iterator.next();
		System.out.println(first_window);
		
			
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		System.out.println("---Generating window ids from second window---");
		
		winids = driver.getWindowHandles();
		iterator = winids.iterator();
		
		System.out.println(iterator.next()); //first
		String second_window = iterator.next(); //second
		System.out.println(second_window);
		
		driver.switchTo().window(second_window);
		
		
		driver.findElement(By.xpath("html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/p[3]/a")).click();	
		//	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[4]/div[3]/div/div/div[1]/div/a"))).click();
		
		
System.out.println("---Generating window ids from third window---");
		
		winids = driver.getWindowHandles();
		iterator = winids.iterator();
		
		System.out.println(iterator.next()); //first
		System.out.println(iterator.next()); 
		String third_window = iterator.next(); //3d
		System.out.println(third_window);
		
		driver.switchTo().window(third_window);
		System.out.println(driver.getTitle().contains("JPMiles on all"));
		
		driver.quit();
		/*driver.close(); //3rd
		driver.switchTo().window(second_window);
		driver.close();*/
	}

}
