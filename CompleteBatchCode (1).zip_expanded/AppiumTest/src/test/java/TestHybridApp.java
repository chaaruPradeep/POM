import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestHybridApp {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		/*
		 * 
		 * adb shell

		dumpsys window windows | grep -E 'mCurrentFocus'
		 * 
		 * 
		 */
		
		File app = new File("C:\\Users\\WAY2AUTOMATION\\Downloads\\app-release.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "android");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		//cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
		//cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.selendroid.testapp.HomeScreenActivity");
		
		//app pkg, activity
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	// TODO Auto-generated method stub
		Thread.sleep(5000);
		
		System.out.println(driver.getPageSource());
		
		/*Set<String> contextNames = driver.getContextHandles();
		Thread.sleep(3000);
		for(String context: contextNames){
			
			System.out.println(context);
			if(context.contains("WEBVIEW")){
				
				driver.context(context);
			}
		}
		
		//driver.findElement(By.id("userName")).sendKeys("Hello");
		System.out.println(driver.findElements(By.id("diverseyImg")).size());
*/		//driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("Hello Appium !!!");
	}

}
