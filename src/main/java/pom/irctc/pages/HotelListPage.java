package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers{
	public HotelListPage moveToLastWindow()
	{
		switchToLastWindow();
		return this;
	}
	public HotelListPage pageDown()
	{
		webPageDown("//html/body");
		return this;
	}
	public HotelListPage waitProp(long time)
	{
		waitProperty(time);
		return this;
	}
	public HotelListPage enterCityOrHotelsName(String data)
	{		
		enterByXpath(prop.getProperty("HotelListPage.EnterCityOrHotelsName.XPath"), data);
		return this;
	}
	
	public HotelListPage clickCityOrHotelName(String data)
	{
		clickByXpath(prop.getProperty("HotelListPage.ClickCityOrHotelName.XPath"));		
		return this;
	}			
	public HotelListPage clickOnDepartureData()
	{
		clickByXpath(prop.getProperty("HotelListPage.ClickOnDepartureData.XPath"));		
		return this;
	}
	public HotelListPage selectDepartureDate()
	{
		clickByXpath(prop.getProperty("HotelListPage.SelectDepartureDate.XPath"));		
		return this;
	}
	public HotelListPage clickOnArrivalDate()
	{
		clickByXpath(prop.getProperty("HotelListPage.ClickOnArrivalDate.XPath"));		
		return this;
	}
	public HotelListPage selectOnArrivalDate()
	{
		clickByXpath(prop.getProperty("HotelListPage.SelectOnArrivalDate.XPath"));		
		return this;
	}
	
	public HotelListPage clickOnRoomsAndGuest()
	{
		clickByXpath(prop.getProperty("HotelListPage.ClickOnRoomsAndGuest.XPath"));					
		return this;
	}
	
	public HotelListPage selectHotelRoom(String data)	
	{
		//clickByXpath("//select[@name='hotelRoom']");
		selectVisibileTextByXPath(prop.getProperty("HotelListPage.SelectHotelRoom.XPath"), data);		
		return this;
	}
	public HotelListPage selectHotelAdult(String data)
	{
		//clickByXpath("//select[@name='hotelAdult']");
		selectVisibileTextByXPath(prop.getProperty("HotelListPage.SelectHotelAdult.XPath"), data);
		return this;
	}
	
	public HotelListPage clickOnDone()
	{
		clickByXpath(prop.getProperty("HotelListPage.ClickOnDone.XPath"));
		return this;
	}
	
	public HotelListPage clickOnFindHotels()
	{
		clickByXpath(prop.getProperty("HotelListPage.ClickOnFindHotels.XPath"));
		return new HotelListPage();
	}

	public HotelFeePage clickOnFirstHotelDispalyed()
	{
		clickByXpath(prop.getProperty("HotelFeePage.ClickOnFirstHotelDispalyed.XPath"));
		return new HotelFeePage();
	}
}


