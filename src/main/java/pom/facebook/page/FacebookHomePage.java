package pom.facebook.page;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers{
	
	public FacebookSignUpPage clickOnCreateNewAccount() 
	{
		
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.XPath"));
		
		return new FacebookSignUpPage();
		
	}

}
