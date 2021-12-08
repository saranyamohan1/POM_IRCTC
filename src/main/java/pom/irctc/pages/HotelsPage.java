package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers{
	
	
	public HotelsPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	public HotelLoginPage clickOnLogin() 
	{
		clickByXpath(prop.getProperty("HotelsPage.ClickOnLogin.XPath"));
		return new HotelLoginPage(); 
	}	
	}
