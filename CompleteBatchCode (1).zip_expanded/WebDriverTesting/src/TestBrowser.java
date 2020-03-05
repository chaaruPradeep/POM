import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBrowser {

	public static void main(String[] args) {

		
		//latest ff, latest selenium jar, latest exe files
		/*
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		
	
		*/
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
