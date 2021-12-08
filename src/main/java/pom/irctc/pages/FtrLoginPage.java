package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrLoginPage extends GenericWrappers{
	public FtrLoginPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}	
	
	public BookYourCoach clickOnNewUserOrSignUp()
	{
		clickByXpath(prop.getProperty("FtrLoginPage.ClickOnNewUserOrSignUp.XPath"));
		return new BookYourCoach();
	}
	public FtrLoginPage waitProp(long time)
	{
		waitProperty(time);
		return this;
	}

}
