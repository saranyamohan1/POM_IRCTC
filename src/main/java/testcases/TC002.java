package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers
{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To Book Hotels Without GST for the guest user";
		author="Saranya";
		category="Smoke";
		browserName="chrome";
		appName="irctchotelsgstno";
	}
	
	@Test
	public void irctcHotelGSTNoValidation() 
	{
		new CovidAlertPage()
		.clickOnOK()
		.clickOnHolidays()
		.clickOnStays()
		.clickOnLounge()	
		.moveToLastWindow()
		.waitProp(5000)
		.clickOnHotels()			
		.moveToLastWindow()
		.clickOnLogin()	
		.clickOnGuestUserLogin()
		.enterLoginEmail("saranyamohan.be@gmail.com")
		.enterLoginMobileNo("7358095317")		
		.clickOnLoginSubmit()
		.waitProp(10000)
		.enterCityOrHotelsName("Chennai")
		.waitProp(5000)
		.clickCityOrHotelName("Chennai")
		.waitProp(5000)
		.clickOnDepartureData()
		.waitProp(5000)
		.selectDepartureDate()
		.waitProp(5000)
		.clickOnArrivalDate()
		.waitProp(5000)
		.selectOnArrivalDate()
		.waitProp(5000)		
		.clickOnRoomsAndGuest()
		.waitProp(5000)
		.selectHotelRoom("1")
		.waitProp(5000)
		.selectHotelAdult("2")			
		.waitProp(10000)
		.clickOnDone()
		.waitProp(5000)
		.clickOnFindHotels()
		.waitProp(5000)		
		.clickOnFirstHotelDispalyed()
		.moveToLastWindow()
		.waitProp(10000)
		.getHotelName()
		.waitProp(5000)
		.getHotelPrice()
		.waitProp(5000)
		.pageDown()
		.clickOnContinueToBook()
		.waitProp(5000)
		.selectTitle("Mr")
		.enterFirstName("Saranya")
		.enterLastName("Vasanth")
		.selectCountry("India")
		.selectState("TAMIL NADU")
		.waitProp(5000)
		.verifyHotelName()		
		.verifyHotelPrice()		
		.pageDown()
		.clickOnContinueOnGstNo()
		.waitProp(5000)
		.clickIAgreeTermsAndConditions()
		.waitProp(5000)
		.clickMakePayment()
		.clickOnVerify()
		.verifyOtpValidationText("otp is required.");
	}
}
