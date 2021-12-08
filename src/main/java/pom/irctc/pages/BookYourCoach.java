package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookYourCoach extends GenericWrappers{

	public BookYourCoach pageDown()
	{
		webPageDown("//html/body");
		return this;
	}
	public BookYourCoach waitProp(long time)
	{
		waitProperty(time);
		return this;
	}	
	
	public BookYourCoach enterUserId(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterUserId.XPath"), data);
		return this;
	}
	public BookYourCoach enterPassword(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterPassword.XPath"), data);
		return this;
	}
	public BookYourCoach enterConfirmPassword(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterConfirmPassword.XPath"), data);
		return this;
	}
	
	public BookYourCoach selectSecurityQuestion(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.SelectSecurityQuestion.XPath"), data);
		return this;
	}
	
	public BookYourCoach enterSecurityAnswer(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterSecurityAnswer.XPath"), data);
		return this;		
	}
	public BookYourCoach clickDateOfBirth()
	{
		clickByXpath(prop.getProperty("BookYourCoach.ClickDateOfBirth.XPath"));		
		return this;
	}
	public BookYourCoach clickDateOfBirthMonth(String data)
	{
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.ClickDateOfBirthMonth.XPath"), data);
		return this;
	}
	public BookYourCoach clickDateOfBirthYear(String data)
	{
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.ClickDateOfBirthYear.XPath"), data);
		return this;
	}
	public BookYourCoach clickDateOfBirthDate()
	{
		clickByXpath(prop.getProperty("BookYourCoach.ClickDateOfBirthDate.XPath"));
		return this;
	}
	public BookYourCoach clickGender()
	{
		clickByXpath(prop.getProperty("BookYourCoach.ClickGender.XPath"));
		return this;
	}
	public BookYourCoach clickMarritalStatus()
	{
		clickByXpath(prop.getProperty("BookYourCoach.ClickMarritalStatus.XPath"));
		return this;
	}
	public BookYourCoach enterEmailId(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterEmailId.XPath"), data);
		return this;
	}
	
	public BookYourCoach selectOccupation(String data)
	{				
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.SelectOccupation.XPath"), data);
		return this;
	}
	
	public BookYourCoach enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterFirstName.XPath"), data);
		return this;
	}
	public BookYourCoach enterMiddleName(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterMiddleName.XPath"), data);
		return this;
	}
	public BookYourCoach enterLastName(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterLastName.XPath"), data);
		return this;
	}
	
	public BookYourCoach selectNationlity(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.SelectNationlity.XPath"), data);
		return this;
	}
	
	public BookYourCoach enterFlatNo(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterFlatNo.XPath"), data);
		return this;
	}
	
	
	public BookYourCoach enterStreet(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterStreet.XPath"), data);
		return this;
	}
	public BookYourCoach enterArea(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterArea.XPath"), data);
		return this;
	}
	
	
	public BookYourCoach selectCountry(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.SelectCountry.XPath"), data);
		return this;
	}
	
	public BookYourCoach enterMobileNo(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterMobileNo.XPath"), data);
		return this;
	}
	public BookYourCoach enterPinCode(String data)
	{
		
		enterByXpath(prop.getProperty("BookYourCoach.EnterPinCode.XPath"), data);		
		return this;
	}
	public BookYourCoach moveToNextElementOfPincode()
	{	
		elementKeyTab(prop.getProperty("BookYourCoach.MoveToNextElementOfPincode.XPath"));
		return this;
	}
	
	public BookYourCoach selectCity(String data)
	{		
		selectVisibileTextById(prop.getProperty("BookYourCoach.SelectCity.XPath"), data);
		return this;
	}
	
	public BookYourCoach selectState(String data)
	{		
		selectVisibileTextById(prop.getProperty("BookYourCoach.SelectState.XPath"), data);
		return this;
	}
	
	public BookYourCoach selectPostOffice(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.SelectPostOffice.XPath"), data);
		return this;
	}
	public BookYourCoach clickOnNoForOfficeAddress()
	{
		clickByXpath(prop.getProperty("BookYourCoach.ClickOnNoForOfficeAddress.XPath"));
		return this;
	}
	
	public BookYourCoach enterOfficeFlatNo(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterOfficeFlatNo.XPath"), data);
		return this;
	}
	public BookYourCoach enterOfficeStreet(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterOfficeStreet.XPath"), data);
		return this;
	}
	public BookYourCoach enterOfficeArea(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterOfficeArea.XPath"), data);
		return this;
	}	
	public BookYourCoach selectOfficeCountry(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.SelectOfficeCountry.XPath"), data);
		return this;
	}
	public BookYourCoach enterOfficeMobileNo(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterOfficeMobileNo.XPath"), data);
		return this;
	}
	public BookYourCoach enterOfficePinCode(String data)
	{
		enterByXpath(prop.getProperty("BookYourCoach.EnterOfficePinCode.XPath"), data);
		return this;
	}
	
	public BookYourCoach moveToNextElementOfficePincode()
	{	
		elementKeyTab(prop.getProperty("BookYourCoach.MoveToNextElementOfficePincode.XPath"));
		return this;
	}
	public BookYourCoach selectOfficeCity(String data)
	{		
		selectVisibileTextById(prop.getProperty("BookYourCoach.SelectOfficeCity.XPath"), data);
		return this;
	}	
	
	public BookYourCoach selectOfficeState(String data)
	{		
		selectVisibileTextById(prop.getProperty("BookYourCoach.SelectOfficeState.XPath"), data);
		return this;
	}
	
	public BookYourCoach selectOfficePostOffice(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("BookYourCoach.SelectOfficePostOffice.XPath"), data);
		return this;
	}
}


