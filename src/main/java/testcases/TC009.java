package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.page.PhpTravelsPage;
import wrappers.ProjectWrappers;


public class TC009 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC009";
		testCaseDescription="To register as a user in phpTravels";
		author="Saranya";
		category="Smoke";
		browserName="chrome";
		appName="phptravels";		
	}
	
	@Test
	public void phpTravelsValidation()
	{
		new PhpTravelsPage()
		.enterFirstName("Saranya")
		.enterLastName("Vasanth")
		.enterEmailAddress("saranyamohali@gmail.com")
		.enterPhoneNumbner("04425900284")
		.enterCompanyName("Wipro")
		.enterAddress1("Shanthi street")
		.enterAddress2("Shenoy Nagar")
		.enterCity("Chennai")
		.enterState("Tamil Nadu")
		.enterPostalCode("600013")		
		.selectCountry("India")
		.enterAdditionalMobileNumber("7358095317")
		.enterPassword1("A42t591234")
		.enterPassword2("A42t591234")
		.clickOnMailinhList();		
	}

}
