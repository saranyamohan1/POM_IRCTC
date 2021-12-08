package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelFeePage extends GenericWrappers{

	public static String hotelName;
	public static String hotelPrice;
	
	public HotelFeePage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	public HotelFeePage pageDown()
	{
		webPageDown("//html/body");
		return this;
	}
	
	public HotelFeePage waitProp(long time)
	{
		waitProperty(time);
		return this;
	}
	
	public HotelFeePage getHotelName()
	{
		 hotelName=getTextByXpath(prop.getProperty("HotelFeePage.GetHotelName.XPath"));		
		return this;
	}
		
	public HotelFeePage  getHotelPrice()
	{
		hotelPrice=getTextByXpath(prop.getProperty("HotelFeePage.GetHotelPrice.XPath"));		
		return  this;
	}
	public HotelPassengerDetailsPage clickOnContinueToBook()
	{
		clickByXpath(prop.getProperty("HotelPassengerDetailsPage.ClickOnContinueToBook.XPath"));
		return new HotelPassengerDetailsPage();
	}
}
