package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;




public class TC004 extends ProjectWrappers{
	@BeforeClass
	public void beforClass()
	{
		testCaseName="TC004";
		testCaseDescription="To Book coach for the guest user";
		author="Saranya";
		category="Smoke";
		browserName="chrome";
		appName="irctcbookyourcoach";
	}
	@Test
	public void irctcBookYourCoach()
	{
		new CovidAlertPage()
		.clickOnOK()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.moveToLastWindow()
		.waitProp(5000)
		.clickOnSideMenu()
		.clickOnBookYourCoach()
		.waitProp(5000)
		.moveToLastWindow()		
		.clickOnNewUserOrSignUp()
		.enterUserId("SaranyaVasanth")
		.waitProp(5000)
		.enterPassword("Saranya123")
		.waitProp(5000)
		.enterConfirmPassword("Saranya123")			
		.waitProp(5000)
		.selectSecurityQuestion("What was the name of your first school?")
		.waitProp(5000)
		.enterSecurityAnswer("St Mont Fort")
		.waitProp(5000)
		.clickDateOfBirth()
		.waitProp(5000)
		.clickDateOfBirthMonth("Sep")
		.waitProp(5000)
		.clickDateOfBirthYear("1988")
		.waitProp(5000)
		.clickDateOfBirthDate()
		.waitProp(5000)
		.pageDown()
		.clickGender()
		.waitProp(5000)
		.clickMarritalStatus()		
		.waitProp(5000)
		.enterEmailId("saranyamohali@gmail.com")			
		.waitProp(5000)
		.selectOccupation("Professional")
		.waitProp(5000)
		.enterFirstName("Reya")
		.waitProp(5000)
		.enterMiddleName("Varsha")
		.waitProp(5000)
		.enterLastName("Vasanth")
		.waitProp(5000)
		.pageDown()		
		.selectNationlity("Indian")
		.waitProp(5000)		
		.enterFlatNo("401")		
		.waitProp(5000)		
		.enterStreet("Murugan street")
		.waitProp(5000)		
		.enterArea("Thalumbur")
		.waitProp(5000)				
		.selectCountry("India")
		.waitProp(5000)		
		.enterMobileNo("9962089929")
		.pageDown()		
		.waitProp(5000)		
		.enterPinCode("600013")		
		.waitProp(10000)			
		.pageDown()
		.waitProp(5000)		
		.selectPostOffice("Rayapuram S.O")
		.waitProp(5000)			
		.clickOnNoForOfficeAddress()
		.waitProp(5000)			
		.enterOfficeFlatNo("301")
		.waitProp(5000)			
		.enterOfficeStreet("Jackuline Street")
		.waitProp(5000)			
		.enterOfficeArea("KODAMBAKKAM")
		.waitProp(5000)	
		.pageDown()		
		.selectOfficeCountry("India")
		.waitProp(5000)			
		.enterOfficeMobileNo("9962089929")
		.waitProp(5000)			
		.enterOfficePinCode("600024")	
		.pageDown()		
		.waitProp(5000)					
		.selectOfficePostOffice("Kodambakkam S.O");
		}

}
