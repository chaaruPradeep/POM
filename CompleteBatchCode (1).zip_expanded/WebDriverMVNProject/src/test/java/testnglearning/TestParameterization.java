package testnglearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {

	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	@Test(dataProvider="getData")
	
	public void doLogin(String username,String password) throws InterruptedException {
		
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
		
	}
	
	
	@DataProvider()
	public Object[][] getData() {
		
		String sheetName = "LoginTest";
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\testdata.xlsx");
		
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
		
		//excel.setCellData(sheetName, colName, rowNum, data)
		
		System.out.println("Total rows are : "+rowNum+" and total cols are : "+colNum);
		
		
	/*	System.out.println(excel.getCellData(sheetName, 0, 1));*/
		
		Object[][] data = new Object[rowNum-1][colNum];
		
		
		
		data[0][0] = excel.getCellData(sheetName, 0, 2);
		data[0][1] = excel.getCellData(sheetName, 1, 2);
		
		data[1][0] = excel.getCellData(sheetName, 0, 3);
		data[1][1] = excel.getCellData(sheetName, 1, 3);
		
		data[2][0] = excel.getCellData(sheetName, 0, 4);
		data[2][1] = excel.getCellData(sheetName, 1, 4);
		
		
		for(int rows=2 ;rows<=rowNum; rows++) {
			for(int cols=0; cols<colNum; cols++) {
				
			
				
				data[rows-2][cols] = excel.getCellData(sheetName, cols, rows);
				
			}
			
			
		}
		
		
		return data;
		
	}
	
	
	
	
}
