package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.facebook.page.FacebookHomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass(){
		testCaseName="TC007";	
		testCaseDescription="To verify Facebook Sign up for the new user ";
		author="Saranya";
		category="Smoke";
		browserName="chrome";
		appName="facebook";
	}
	
	@Test
	public void faceBookValidation()
	{
		new FacebookHomePage()
		.clickOnCreateNewAccount()
		.enterFirstName("Saranya")
		.enterSurName("Vasanth")
		.enterMobOrEmailAddress("saranyamohali@gmail.com")
		.enterReEnterMobileOrEmailAddress("saranyamohali@gmail.com")
		.enterPassword("password1")
		.selectDay("11")
		.selectMonth("Nov")
		.selectYear("2000")
		.clickOnGender()
		.clickOnSignUpButton();
	}

}
