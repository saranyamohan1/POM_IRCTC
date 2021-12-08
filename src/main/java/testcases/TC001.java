package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
		testCaseName="TC001";
		testCaseDescription="To Register as a New User in irctc website";
		author="Saranya";
		category="Smoke";
		browserName="chrome";
		appName="irctcregistration";		
	}
	
	
	
	@Test
	public void irctcRegistraion()
	{
		// TODO Auto-generated method stub
		new CovidAlertPage()
		.clickOnOK()
		.clickOnRegister()				
		.enterUserName("SaranyaVasanth")
		.enterPassword("password1")
		.enterConfirmPassword("password1")
		.clickPreferedLang()
		.selectPreferedLang()
		.clickSecurityQuestion()
		.selectSecurityQuestion()
		.enterSecurityAnswer("Pinky")
		.clickOnContinue()
		.enterFirstName("Reya")
		.enterMiddleName("Varsha")
		.enterLastName("Vasanth")
		.clickOccupation()
		.selectOccupation("PROFESSIONAL")
		.enterDateOfBirth("20-09-2000")
		.waitProp(2000)
		.clickOnMarried()
		.selectCountry("India")
		.clickOnGender()
		.enterEmailAddress("saranyamohali@gmail.com")
		.enterMobileNo("7358095317")
		.selectNationality("India")
		.clickOnContinue()		
		.enterHomeOrFlatNo("12")
		.enterStreetOrLane("Murugan Street")
		.enterArea("Royapuram")
		.enterPinCode("600013")
		.pageDown()
		.waitProp(5000)
		.selectResidenceCity("Chennai")	
		.waitProp(5000)
		.selectResidencePostOff("Rayapuram S.O")
		.enterResPhone("9962089929")
		.clickNoToResidenceOffice()
		.enterOfficeFlatNo("Flat B5 A401")
		.enterOfficeStreetOrLane("Murugan Street")
		.enterOfficeArea("Thalumbur")
		.clickOffCountry()
		.pageDown()
		.waitProp(10000)
		.selectOffCountry("India")		
		.enterOfficePinCode("600024")
		.enterOffState("TAMIL NADU")
		.enterOfficeCity("Chennai")
		.enterOfficePostOff("Kodambakkam S.O");		
	}
}
