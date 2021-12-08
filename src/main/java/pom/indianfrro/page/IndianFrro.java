package pom.indianfrro.page;

import wrappers.GenericWrappers;

public class IndianFrro extends GenericWrappers{
	
	public IndianFrro pageDown()
	{
		webPageDown("//html/body");
		return this;
	}
	public IndianFrro waitProp(long time)
	{
		waitProperty(time);
		return this;
	}	
	public IndianFrro enterUserId(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterUserId.XPath"), data);
		return this;
	}
	
	public IndianFrro enterPassword(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterPassword.XPath"), data);
		return this;
	}
	public IndianFrro enterConfrmPassword(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterConfrmPassword.XPath"), data);
		return this;
	}
	
	public IndianFrro clickSecurityQuestion()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickSecurityQuestion.XPath"));		
		return this;
	}
	public IndianFrro selectSecurityQuestion(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectSecurityQuestion.XPath"), data);
		return this;
	}
	public IndianFrro enterSecurityAnswer(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterSecurityAnswer.XPath"), data);
		return this;
	}
	public IndianFrro enterUserName(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterUserName.XPath"), data);
		return this;
	}
	public IndianFrro clickGender()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickGender.XPath"));		
		return this;
	}
	public IndianFrro selectGender(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectGender.XPath"), data);
		return this;
	}
	public IndianFrro enterDateOfBirth(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterDateOfBirth.XPath"), data);
		return this;
	}
	public IndianFrro enterDesignation(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterDesignation.XPath"), data);
		return this;
	}
	public IndianFrro enterEmailId(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterEmailId.XPath"), data);
		return this;
	}
	public IndianFrro enterMobileNo(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterMobileNo.XPath"), data);
		return this;
	}
	public IndianFrro enterPhoneNumber(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterPhoneNumber.XPath"), data);
		return this;
	}
	public IndianFrro clickNationality()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickNationality.XPath"));		
		return this;
	}
	public IndianFrro selectNationality(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectNationality.XPath"), data);
		return this;
	}
	public IndianFrro enterHotelName(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterHotelName.XPath"), data);
		return this;
	}
	public IndianFrro enterCapacity(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterCapacity.XPath"), data);
		return this;
	}
	public IndianFrro enterAddress(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterAddress.XPath"), data);
		return this;
	}
	public IndianFrro clickState()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickState.XPath"));		
	 return this;	
	}
	public IndianFrro selectState(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectState.XPath"),data);
	 return this;	
	}
	public IndianFrro clickCity()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickCity.XPath"));		
		return this;	
	} 
	public IndianFrro selectCity(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectCity.XPath"), data);
	 return this;	
	}
	public IndianFrro clickAccomadationType()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickAccomadationType.XPath"));		
	 return this;	
	}
	public IndianFrro selectAccomadationType(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectAccomadationType.XPath"), data);
	 return this;	
	}
	public IndianFrro clickAccomadationGrade()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickAccomadationGrade.XPath"));		
	 return this;	
	}
	public IndianFrro selectAccomadationGrade(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectAccomadationGrade.XPath"), data);
	 return this;	
	}
	public IndianFrro enterHotelEmail(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterHotelEmail.XPath"), data);
		return this;		
	}
	public IndianFrro enterHotelMobile(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterHotelMobile.XPath"), data);
		return this;
	}
	public IndianFrro enterHotelPhoneNumber(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterHotelPhoneNumber.XPath"), data);
		return this;
	}
	public IndianFrro enterOfficeName(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterOfficeName.XPath"), data);
		return this;
	}
	public IndianFrro enterOfficeAddress(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterOfficeAddress.XPath"), data);
		return this;
	}
	public IndianFrro clickOfficeState()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickOfficeState.XPath"));			
		return this;
	}
	public IndianFrro selectOfficeState(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectOfficeState.XPath"), data);		
		return this;
	}	
	public IndianFrro selectOfficeCity(String data)
	{		
		selectVisibileTextByXPath(prop.getProperty("IndianFrro.SelectOfficeCity.XPath"), data);
		return this;
	}
	public IndianFrro enterOfficeEmail(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterOfficeEmail.XPath"), data);
		return this;
	}
	public  IndianFrro enterOfficePhoneNo(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterOfficePhoneNo.XPath"), data);
		return this;
	}
	public IndianFrro enterOfficeMobile(String data)
	{
		enterByXpath(prop.getProperty("IndianFrro.EnterOfficeMobile.XPath"), data);
		return this;
	}
	public IndianFrro clickAddButton()
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickAddButton.XPath"));
		return this;
	}
	
	public IndianFrro clickDeleteButton() 
	{
		clickByXpath(prop.getProperty("IndianFrro.ClickDeleteButton.XPath"));
		return this;
	}
	}

