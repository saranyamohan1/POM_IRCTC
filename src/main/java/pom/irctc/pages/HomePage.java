package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
public  RegistrationPage clickOnRegister()
{	
	clickByXpath(prop.getProperty("HomePage.ClickOnRegister.XPath"));
	return new RegistrationPage();
}

public HomePage clickOnHolidays()
{		
	clickByXpath(prop.getProperty("HomePage.ClickOnHolidays.XPath"));
	return this;
}
public HomePage clickOnStays()
{			
	clickByXpath(prop.getProperty("HomePage.ClickOnStays.XPath"));	
	return this;
}
 
public AccomadationPage clickOnLounge()
{		
	clickByXpath(prop.getProperty("HomePage.ClickOnLounge.XPath"));
	return new AccomadationPage();
}
public AccomadationPage moveToLastWindow()
{
	switchToLastWindow();
	return new AccomadationPage();
}
}
