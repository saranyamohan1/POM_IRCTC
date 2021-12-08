package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelGstNoOtpVerficationPage extends GenericWrappers{
	public  HotelGstNoOtpVerficationPage verifyOtpValidationText(String data)
	{	
		verifyTextByXpath(prop.getProperty("HotelGstNoOtpVerficationPage.VerifyOtpValidationText.XPath"), data);
		return this;
	
	}	

}
