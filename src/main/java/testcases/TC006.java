package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC006";
		testCaseDescription="Irctc enquiry form for charter";
		author="Saranya";
		category="Smoke";
		browserName="chrome";
		appName="irctccharter";
		
	}
	@Test
	public void irctcCharter()
	{
		new CovidAlertPage()
		.clickOnOK()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()
		.moveToLastWindow()
		.clickOnSideMenu()	
		.clickOnCharter()
		.moveToLastWindow()
		.dismissMenu()
		.clickOnEnquiryForm()
		.enterApplicantName("Saranya")
		.enterOrganisationName("TCS")
		.enterAddress("12/22 vaigundam street,chennai")
		.enterMobileNo("7358095317")
		.enterEmail("saranyamohan.be@gmail.com")
		.clickRequestFor()
		.selectRequestFor("Saloon Charter")
		.waitProp(5000)
		.enterOriginStation("Chennai")
		.enterDestinationStation("Delhi")	
		.waitProp(5000)
		.clickOnDepartureDate()
		.selectDepartureDate()
		.waitProp(5000)
		.clickOnArrivalDate()
		.selectArrivalDate()
		.enterTimeDuration("5")
		.enterNumberAndTypeOfCoaches("2")
		.enterNumberOfPassengers("4")
		.enterCharterPurpose("Vacation")
		.enterAdditionalServices("Vacation");		
	}
}
