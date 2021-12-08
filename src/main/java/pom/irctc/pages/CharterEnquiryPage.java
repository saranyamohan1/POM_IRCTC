package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterEnquiryPage extends GenericWrappers{
	public CharterEnquiryPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	public CharterEnquiryPage pageDown()
	{
		webPageDown("//html/body");
		return this;
	}
	public CharterEnquiryPage waitProp(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public CharterEnquiryPage enterApplicantName(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterApplicantName.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterOrganisationName(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterOrganisationName.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterAddress(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterAddress.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterMobileNo(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterMobileNo.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterEmail.XPath"), data);
		return this;
	}
	public CharterEnquiryPage clickRequestFor()
	{
		clickByXpath(prop.getProperty("CharterEnquiryPage.ClickRequestFor.XPath"));		
		return this;
	}
	public CharterEnquiryPage selectRequestFor(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("CharterEnquiryPage.SelectRequestFor.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterOriginStation(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterOriginStation.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterDestinationStation(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterDestinationStation.XPath"), data);
		return this;
	}
	public CharterEnquiryPage clickOnDepartureDate()
	{
		clickByXpath(prop.getProperty("CharterEnquiryPage.ClickOnDepartureDate.XPath"));		
		return this;
	}
	public CharterEnquiryPage selectDepartureDate()
	{		
		clickByXpath(prop.getProperty("CharterEnquiryPage.SelectDepartureDate.XPath"));
		return this;
	}
	public CharterEnquiryPage clickOnArrivalDate()
	{
		clickByXpath(prop.getProperty("CharterEnquiryPage.ClickOnArrivalDate.XPath"));		
		return this;
	}
	public CharterEnquiryPage selectArrivalDate()
	{		
		clickByXpath(prop.getProperty("CharterEnquiryPage.SelectArrivalDate.XPath"));
		return this;
	}
	public CharterEnquiryPage enterTimeDuration(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterTimeDuration.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterNumberAndTypeOfCoaches(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterNumberAndTypeOfCoaches.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterNumberOfPassengers(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterNumberOfPassengers.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterCharterPurpose(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterCharterPurpose.XPath"), data);
		return this;
	}
	public CharterEnquiryPage enterAdditionalServices(String data)
	{
		enterByXpath(prop.getProperty("CharterEnquiryPage.EnterAdditionalServices.XPath"), data);
		return this;
	}
}
