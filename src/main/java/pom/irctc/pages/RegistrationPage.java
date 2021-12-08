package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	
	public RegistrationPage moveToLastWindow()
	{		
		switchToLastWindow();
		return this;
	}	
	//doubt
	public RegistrationPage pageDown()
	{
		webPageDown("//html/body");
		return this;
	}
	public RegistrationPage waitProp(long time)
	{
		waitProperty(1000);
		return this;
	}
	
	public RegistrationPage enterUserName(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterUserName.XPath"), data);
		return this;
	}
	public RegistrationPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterPassword.XPath"), data);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterConfirmPassword.XPath"), data);
		return this;
	}
	public RegistrationPage clickPreferedLang()
	{		
		clickByXpath(prop.getProperty("RegistrationPage.ClickPrefLang.XPath"));		
		return this;
	}
	public RegistrationPage selectPreferedLang()
	{				
		clickByXpath(prop.getProperty("RegistrationPage.SelectPrefLang.XPath"));
		return this;
	}
	public RegistrationPage clickSecurityQuestion()
	{
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickSecurityQues.XPath"));
		return this;
	}
	public RegistrationPage selectSecurityQuestion()
	{
				
		clickByXpath(prop.getProperty("RegistrationPage.SelectSecurityQues.XPath"));		
		return this;
	}
	
	
	public RegistrationPage enterSecurityAnswer(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterSecurityAnswer.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnContinue()
	{
		clickByXpath(prop.getProperty("RegistrationPage.ClickOnContinue.XPath"));
		return this;
	}
	public RegistrationPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterFirstName.XPath"), data);
		return this;
	}
	public RegistrationPage enterMiddleName(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterMiddleName.XPath"), data);
		return this;
	}
	public RegistrationPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterLastName.XPath"), data);
		return this;
	}
	//doubt
	public RegistrationPage clickOccupation()
	{
		clickByXpath(prop.getProperty("RegistrationPage.ClickOccupation.XPath"));		
		return this;
	}
	public RegistrationPage selectOccupation(String data)
	{		
		clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.XPath"));
		return this;
	}
	public RegistrationPage enterDateOfBirth(String data)
	{		
		enterByXpath(prop.getProperty("RegistrationPage.EnterDateOfBirth.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnMarried()
	{
		clickByXpath(prop.getProperty("RegistrationPage.ClickOnMarried.XPath"));
		return this;
	}
	public RegistrationPage selectCountry(String data)
	{
		selectVisibileTextByXPath(prop.getProperty("RegistrationPage.SelectCountry.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnGender()
	{
		clickByXpath(prop.getProperty("RegistrationPage.ClickOnGender.XPath"));
		return this;
	}
	public RegistrationPage enterEmailAddress(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterEmailAddress.XPath"), data);
		return this;
	}
	public RegistrationPage enterMobileNo(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterMobileNo.XPath"), data);
		return this;	
	}
	public RegistrationPage selectNationality(String data)
	{
		selectVisibileTextByXPath(prop.getProperty("RegistrationPage.SelectNationality.XPath"), data);
		return this;
	}	
	
	public RegistrationPage enterHomeOrFlatNo(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterHomeOrFlatNo.XPath"), data);
		return this;
	}
	public RegistrationPage enterStreetOrLane(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterStreetOrLane.XPath"), data);
		return this;
	}
	public RegistrationPage enterArea(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterArea.XPath"), data);
		return this;
	}
	public RegistrationPage enterPinCode(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterPinCode.XPath"), data);
		return this;
	}
	public RegistrationPage selectResidenceCity(String data)
	{
		selectVisibileTextByXPath(prop.getProperty("RegistrationPage.SelectResidenceCity.XPath"), data);
		return this;		
	}
	public RegistrationPage selectResidencePostOff(String data)
	{
		selectVisibileTextByXPath(prop.getProperty("RegistrationPage.SelectResidencePostOff.XPath"), data);
		return this;
	}
	public RegistrationPage enterResPhone(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterResPhone.XPath"), data);
		return this;
	}
	public RegistrationPage clickNoToResidenceOffice()
	{
		clickByXpath(prop.getProperty("RegistrationPage.ClickNoToResidenceOffice.XPath"));
		return this;
	}
	
	public RegistrationPage enterOfficeFlatNo(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterOfficeFlatNo.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeStreetOrLane(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterOfficeStreetOrLane.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeArea(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterOfficeArea.XPath"), data);
		return this;
	}
	public RegistrationPage clickOffCountry()
	{
		clickByXpath(prop.getProperty("RegistrationPage.ClickOffCountry.XPath"));
		return this;
	}
	public RegistrationPage selectOffCountry(String data)
	{
		clickByXpath(prop.getProperty("RegistrationPage.SelectOffCountry.XPath"));
		return this;
	}
	public RegistrationPage enterOfficePinCode(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterOfficePinCode.XPath"), data);
		return this;
	}
	public RegistrationPage enterOffState(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterOffState.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeCity(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterOfficeCity.XPath"), data);
		return this;		
	}
	public RegistrationPage enterOfficePostOff(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterOfficePostOff.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficePhone(String data)
	{
		enterByXpath(prop.getProperty("RegistrationPage.EnterOfficePhone.XPath"), data);
		return this;
	}
}

