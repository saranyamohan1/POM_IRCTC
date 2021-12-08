package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.page.IndianFrroSignUpPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() 
	{
		testCaseName="TC005";
		testCaseDescription="To register as new user in immigration Form C";
		author="Saranya";
		category="Smoke";
		browserName="chrome";
		appName="indianfrro";					
	}
	
	@Test
	public void irctcIndianFrro()
	{
		new IndianFrroSignUpPage()
		.clickOnSignUp()
		.enterUserId("Reyavarsha1")
		.enterPassword("Reyavarsha1")
		.enterConfrmPassword("Reyavarsha1")		
		.selectSecurityQuestion("What is the name of the hospital where you were born?")
		.enterSecurityAnswer("Chennai")
		.enterUserName("Saranya")
		.clickGender()
		.selectGender("Female")
		.enterDateOfBirth("24/09/1988")
		.enterDesignation("Associate")
		.enterEmailId("saranyamohali@gmail.com")
		.enterMobileNo("7358095317")
		.enterPhoneNumber("4425900284")		
		.selectNationality("INDIA")
		.enterHotelName("Accord")
		.enterCapacity("3")
		.enterAddress("No,10 xyz street,T.Nagar,Chennai-600021")		
		.selectState("TAMIL NADU")
		.waitProp(10000)
		.pageDown()		
		.selectCity("CHENNAI")		
		.selectAccomadationType("Hotel")		
		.selectAccomadationGrade("Three Star")
		.enterHotelEmail("saranyamohan.be@gmail.com")
		.enterHotelMobile("9909299029")
		.enterHotelPhoneNumber("044595955")
		.enterOfficeName("Reya")
		.enterOfficeAddress("No,20 abc street,T.Nagar,Chennai-600021")		
		.selectOfficeState("TAMIL NADU")
		.waitProp(10000)		
		.selectOfficeCity("CHENNAI")
		.enterOfficeEmail("owner@accord.com")
		.enterOfficePhoneNo("25900283")
		.enterOfficeMobile("7358095317")
		.clickAddButton()
		.waitProp(5000)
		.enterOfficeName("Maha")
		.enterOfficeAddress("No,20 abc street,mylapore,Chennai-600024")		
		.selectOfficeState("TAMIL NADU")
		.waitProp(10000)
		.selectOfficeCity("CHENNAI")
		.enterOfficeEmail("owner@accord.com")
		.enterOfficePhoneNo("25900285")
		.enterOfficeMobile("7358000012");	
	}
}
