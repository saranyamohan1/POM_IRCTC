package pom.facebook.page;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers{
	

	
	public FacebookSignUpPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.FirstName.XPath"), data);
		return this;
	}
	public FacebookSignUpPage enterSurName(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.LastName.XPath"), data);
		return this;
	}
	public FacebookSignUpPage enterMobOrEmailAddress(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.MobOrEmail.XPath"), data);
		return this;
	}
	public FacebookSignUpPage enterReEnterMobileOrEmailAddress(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.RepeatMobOrEmail.XPath"), data);
		return this;
	}
	public FacebookSignUpPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.Password.XPath"), data);
		return this;
	}
	
	
	public FacebookSignUpPage selectDay(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("FacebookSignUpPage.Day.XPath"), data);		
		return this;
	}

	
	public FacebookSignUpPage selectMonth(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("FacebookSignUpPage.Month.XPath"), data);		
		return this;
	}
	
	
	public FacebookSignUpPage selectYear(String data)
	{	
		selectVisibileTextByXPath(prop.getProperty("FacebookSignUpPage.Year.XPath"), data);		
		return this;
	}
	public FacebookSignUpPage clickOnGender()
	{
		clickByXpath(prop.getProperty("FacebookSignUpPage.Gender.XPath"));
		return this;
	}
	
	public FacebookSignUpPage clickOnSignUpButton()
	{
		clickByXpath(prop.getProperty("FacebookSignUpPage.SignUp.XPath"));
		return this;
	}
	
}
