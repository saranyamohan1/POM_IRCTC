package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{

	public CharterPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}	
	public CharterPage dismissMenu() 
	{
		clickByXpath(prop.getProperty("CharterPage.DismissMenu.XPath"));
		return this;		
	}
	public CharterEnquiryPage clickOnEnquiryForm()
	{
		clickByXpath(prop.getProperty("CharterEnquiryPage.ClickOnEnquiryForm.XPath"));
		return new CharterEnquiryPage();
	}
	}


