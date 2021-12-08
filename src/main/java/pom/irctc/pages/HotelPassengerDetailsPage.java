package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPassengerDetailsPage extends GenericWrappers{
	
	public HotelPassengerDetailsPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	public HotelPassengerDetailsPage waitProp(long time)
	{
		waitProperty(time);
		return this;
	}
	public HotelPassengerDetailsPage pageDown()
	{
		webPageDown("//html/body");
		return this;
	}
	public HotelPassengerDetailsPage verifyHotelName() 
	{	
		verifyTextByXpath(prop.getProperty("HotelPassengerDetailsPage.VerifyHotelName.XPath"),HotelFeePage.hotelName);
		return this;
	}
	
	public HotelPassengerDetailsPage verifyHotelPrice()
	{
		verifyTextByXpath(prop.getProperty("HotelPassengerDetailsPage.VerifyHotelPrice.XPath"),HotelFeePage.hotelPrice);
		
		return this;
	}
	
	public HotelPassengerDetailsPage selectTitle(String data)
	{			
			selectVisibileTextByXPath(prop.getProperty("HotelPassengerDetailsPage.SelectTitle.XPath"), data);
			return this;
	}
	public HotelPassengerDetailsPage enterFirstName(String data)
	{
			enterByXpath(prop.getProperty("HotelPassengerDetailsPage.EnterFirstName.XPath"), data);
			return this;
	}
		
	public HotelPassengerDetailsPage enterLastName(String data)
	{
			enterByXpath(prop.getProperty("HotelPassengerDetailsPage.EnterLastName.XPath"), data);
			return this;
	}
	public HotelPassengerDetailsPage selectCountry(String data)
	{
			selectVisibileTextByXPath(prop.getProperty("HotelPassengerDetailsPage.SelectCountry.XPath"), data);
			return this;
	}	
	public HotelPassengerDetailsPage selectState(String data)
	{
			selectVisibileTextByXPath(prop.getProperty("HotelPassengerDetailsPage.SelectState.XPath"), data);
			return this;
	}	
	public HotelPassengerDetailsPage enterMobileNumber(String data)
	{
			enterByXpath(prop.getProperty("HotelPassengerDetailsPage.EnterMobileNumber.XPath"), data);
			return this;
	}
		
	public HotelPassengerDetailsPage enterEmailId(String data)
	{
			enterByXpath(prop.getProperty("HotelPassengerDetailsPage.EnterEmailId.XPath"), data);
			return this;
	}
	public HotelPassengerDetailsPage selectGstNo(String data)
	{
			selectVisibileTextByXPath(prop.getProperty("HotelPassengerDetailsPage.SelectGstNo.XPath"), data);
			return this;
	}		
	public HotelGstNoPage clickOnContinueOnGstNo() 	
	{
			clickByXpath(prop.getProperty("HotelGstNoPage.ClickOnContinueOnGstNo.XPath"));
			return new HotelGstNoPage();
	}
		
		 //doubt gst yes
		public HotelPassengerDetailsPage selectGstYes(String data)
		{
			selectVisibileTextByXPath(prop.getProperty("HotelPassengerDetailsPage.SelectGstYes.XPath"), data);
			return this;
		}
		
		public HotelPassengerDetailsPage enterCutomerGstIn(String data)
		{
			enterByXpath(prop.getProperty("HotelPassengerDetailsPage.EnterCutomerGstIn.XPath"), data);
			return this;
		}
		public HotelPassengerDetailsPage enterCompanyName(String data)
		{
			enterByXpath(prop.getProperty("HotelPassengerDetailsPage.EnterCompanyName.XPath"), data);
			return this;
		}
		public HotelPassengerDetailsPage enterCompanyAddress(String data)
		{
			enterByXpath(prop.getProperty("HotelPassengerDetailsPage.EnterCompanyAddress.XPath"), data);
			return this;
		}
		public HotelPassengerDetailsPage clickOnContinueOnGstYes() 	
		{
			clickByXpath(prop.getProperty("HotelPassengerDetailsPage.ClickOnContinueOnGstYes.XPath"));
			return new HotelPassengerDetailsPage();
		}
		
		public HotelPassengerDetailsPage verifyGSTNumberText(String data)
		{
			verifyTextByXpath(prop.getProperty("HotelPassengerDetailsPage.VerifyGSTNumberText.XPath"), data);
			return this;
		}	
}
