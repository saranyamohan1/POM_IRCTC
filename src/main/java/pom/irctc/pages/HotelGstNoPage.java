package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelGstNoPage extends GenericWrappers{
	public HotelGstNoPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	
	public HotelGstNoPage waitProp(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public HotelGstNoPage clickIAgreeTermsAndConditions()
	{
	
		clickByXpath(prop.getProperty("HotelGstNoPage.ClickIAgreeTermsAndConditions.XPath"));
		return this;		
		
	}
	public HotelGstNoPage clickMakePayment()
	{
		clickByXpath(prop.getProperty("HotelGstNoPage.ClickMakePayment.XPath"));
		return this;
	}
	public HotelGstNoOtpVerficationPage clickOnVerify()
	{
		clickByXpath(prop.getProperty("HotelGstNoOtpVerficationPage.ClickOnVerify.XPath"));		
		return new HotelGstNoOtpVerficationPage();
	}		
	
		
}
