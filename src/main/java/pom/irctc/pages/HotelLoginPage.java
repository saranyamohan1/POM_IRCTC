package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelLoginPage extends GenericWrappers{
	
	public HotelLoginPage waitProp(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public HotelLoginPage clickOnGuestUserLogin()
	{
		clickByXpath(prop.getProperty("HotelLoginPage.ClickOnGuestUserLogin.XPath"));		
		return this;
	}
	public HotelLoginPage enterLoginEmail(String data)
	{
		enterByXpath(prop.getProperty("HotelLoginPage.EnterLoginEmail.XPath"), data);		
		return this;
	}
	public HotelLoginPage enterLoginMobileNo(String data)
	{
		enterByXpath(prop.getProperty("HotelLoginPage.EnterLoginMobileNo.XPath"), data);		
		return this;
	}
		
	public HotelListPage clickOnLoginSubmit()
	{
		//doubt login button
		clickByXpath(prop.getProperty("HotelLoginPage.ClickOnLoginSubmit.XPath"));		
		return new HotelListPage(); 
	}
}
