package wrappers;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers {

	public String browserName;
	
	public String appName;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
		
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		switch (appName) {
		case "facebook":
			invokeApp(browserName, "https://www.facebook.com");			
			break;
		case "irctcregistration":
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;
		case "irctchotelsgstno":
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;
		case "irctchotelsgstyes":
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;	
		case "irctcbookyourcoach":
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;
		case "indianfrro":
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
		case "irctccharter":
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;
		case "panindia":
			invokeApp(browserName, "https://panind.com/india/new_pan/");
			break;	
		case "phptravels":
			invokeApp(browserName, "https://www.phptravels.org/register.php");
			break;
		default:
			System.err.println("Please provide valid application name");
			break;
		}
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
	}
	
	@AfterTest
	public void afterTest() {
		unloadObjects();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
}
