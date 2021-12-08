package pom.phptravels.page;

import wrappers.GenericWrappers;

public class PhpTravelsPage extends GenericWrappers{

	public PhpTravelsPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterFirstName.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterLastName.XPath"), data);
		return this;
	}
public PhpTravelsPage enterEmailAddress(String data)
{
	
	enterByXpath(prop.getProperty("PhpTravelsPage.EnterEmailAddress.XPath"), data);
	return this;
}
public PhpTravelsPage enterPhoneNumbner(String data)
{
	enterByXpath(prop.getProperty("PhpTravelsPage.EnterPhoneNumbner.XPath"), data);
	return this;
}
	public PhpTravelsPage enterCompanyName(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterCompanyName.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterAddress1(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterAddress1.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterAddress2(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterAddress2.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterCity(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterCity.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterState(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterState.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterPostalCode(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterPostalCode.XPath"), data);
		return this;
	}
	public PhpTravelsPage clickCountry()
	{
		clickByXpath(prop.getProperty("PhpTravelsPage.ClickCountry.XPath"));		
		return this;
	}
	public PhpTravelsPage selectCountry(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("PhpTravelsPage.SelectCountry.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterAdditionalMobileNumber(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterAdditionalMobileNumber.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterPassword1(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterPassword1.XPath"), data);
		return this;
	}
	public PhpTravelsPage enterPassword2(String data)
	{
		enterByXpath(prop.getProperty("PhpTravelsPage.EnterPassword2.XPath"), data);
		return this;
	}
	public PhpTravelsPage clickOnMailinhList()
	{
		clickByXpath(prop.getProperty("PhpTravelsPage.ClickOnMailinhList.XPath"));
		return this;
	}
		
}
