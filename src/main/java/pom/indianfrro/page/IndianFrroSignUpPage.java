package pom.indianfrro.page;

import wrappers.GenericWrappers;

public class IndianFrroSignUpPage extends GenericWrappers{
	
	public IndianFrro clickOnSignUp()
	{
		clickByXpath(prop.getProperty("IndianFrroSignUpPage.ClickOnSignUp.XPath"));
		return new IndianFrro();
	}

}
