package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		Reporter.log("<a target=\"_blank\" href=\"F:\\screenshot\\error.jpg\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href=\"F:\\screenshot\\error.jpg\"><img src=\"F:\\screenshot\\error.jpg\" height=200 width=200></a>");
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {

	
		System.out.println("TEst case pass"+" Test case name : "+arg0.getName());
	}

}
