package pom.panindia.page;

import wrappers.GenericWrappers;

public class PanIndia extends GenericWrappers{
	public PanIndia pageDown()
	{
		webPageDown("//html/body");
		return this;
	}
public PanIndia waitProp(long time)	
{
		waitProperty(time);
		return this;
}
 public PanIndia selectFullNameTitle(String data)
 {
	 selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectFullNameTitle.XPath"), data);
	 return this;
 }
 public PanIndia enterPanFirstName(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanFirstName.XPath"), data);
	 return this;
 }
 public PanIndia enterPanMiddleName(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanMiddleName.XPath"), data);
	 return this;
 }	
 public PanIndia enterPanLastName(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanMiddleName.XPath"), data);
	 return this;
 }	
 
 public PanIndia enterPanFathersFirstName(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanFathersFirstName.XPath"), data);
	 return this;
 }	
 
 public PanIndia enterPanFathersMiddleName(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanFathersMiddleName.XPath"), data);
	 return this;
 }	
 
 public PanIndia enterPanFathersLastName(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanFathersLastName.XPath"), data);
	 return this;
 }	
 public PanIndia enterPanMobileNumber(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanMobileNumber.XPath"), data);
	 return this;
 }	
 public PanIndia enterPanEmail(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanEmail.XPath"), data);
	 return this;
 }	
 public PanIndia selectPanSourceOfIncome(String data)
 {
	 selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanSourceOfIncome.XPath"), data);
	 return this;
 }
 
 public PanIndia clickOnOffice()
 {
	 clickByXpath(prop.getProperty("PanIndia.ClickOnOffice.XPath"));
	 return this;
 }
 public PanIndia enterPanDob(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanDob.XPath"), data);
	 return this;
 }	
 
 public PanIndia enterPanResidenceHouseNo(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanResidenceHouseNo.XPath"), data);
	 return this;
 }
 
 public PanIndia enterPanResidenceArea(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanResidenceArea.XPath"), data);
	 return this;
 } 
 public PanIndia enterPanResidenceCity(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanResidenceCity.XPath"), data);
	 return this;
 } 
 public PanIndia selectPanResidenceStateOrUnionTerritory(String data)
 {
	 selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanResidenceStateOrUnionTerritory.XPath"), data);
	 return this;
 }
 
 public PanIndia enterPanResidencePincode(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanResidencePincode.XPath"), data);
	 return this;
 }  

 public PanIndia selectPanResidenceCountry(String data)
 {
	 selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanResidenceCountry.XPath"), data);
	 return this;
 }
 public PanIndia enterPanOfficeName(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanOfficeName.XPath"), data);
	 return this;
 } 
 public PanIndia enterPanOfficeNo(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanOfficeNo.XPath"), data);
	 return this;
 }
 
 public PanIndia enterPanOfficeArea(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanOfficeArea.XPath"), data);
	 return this;
 } 
 public PanIndia enterPanOfficeCity(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanOfficeCity.XPath"), data);
	 return this;
 } 
 public PanIndia selectOfficeStateOrUnionTerritory(String data)
 {
	 selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectOfficeStateOrUnionTerritory.XPath"), data);
	 return this;
 }
 
 public PanIndia enterPanOfficePincode(String data)
 {
	 enterByXpath(prop.getProperty("PanIndia.EnterPanOfficePincode.XPath"), data);
	 return this;
 }  

 public PanIndia selectPanOfficeCountry(String data)
 {
	 selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanOfficeCountry.XPath"), data);
	 return this;
 }
public PanIndia selectPanIdentityProof(String data)
{
	selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanIdentityProof.XPath"), data);
	return this;
}

public PanIndia selectPanAddressProof(String data)
{
	selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanAddressProof.XPath"), data);
	return this;
}
public PanIndia selectPanDOBProof(String data)
{
	selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanDOBProof.XPath"), data);
	return this;
}
public PanIndia selectPanAadhaarProof(String data)
{
	selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanAadhaarProof.XPath"), data);
	return this;
}
public PanIndia selectPanOfficeAddressProof(String data)
{
	selectVisibileTextByXPath(prop.getProperty("PanIndia.SelectPanOfficeAddressProof.XPath"), data);
	return this;
}


















 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
