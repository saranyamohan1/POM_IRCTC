package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomadationPage extends GenericWrappers{
	
	public AccomadationPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}	
	public AccomadationPage waitProp(long time)
	{
		waitProperty(time);
		return this;
	}
	public HotelsPage clickOnHotels()
	{		
		clickByXpath(prop.getProperty("AccomadationPage.ClickOnHotels.XPath"));
		return new HotelsPage();
	}
	public AccomadationPage clickOnSideMenu() {			
		clickByXpath(prop.getProperty("AccomadationPage.ClickOnSideMenu.XPath"));
		return new AccomadationPage();
	}
	
	 public FtrLoginPage clickOnBookYourCoach()
	 {
		 clickByXpath(prop.getProperty("AccomadationPage.ClickOnBookYourCoach.XPath"));
		 return new FtrLoginPage();
	 }
	 public CharterPage clickOnCharter()
	 {
		clickByXpath(prop.getProperty("AccomadationPage.ClickOnCharter.XPath")); 
		 return new CharterPage();
	 }
	 
}
