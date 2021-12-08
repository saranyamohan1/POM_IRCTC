package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.ImeActivationFailedException;
import org.openqa.selenium.ImeNotAvailableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects() {
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void unloadObjects() {
		prop=null;
	}
	
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" launched successfully with the URL "+url);
			
			reportStep("The browser "+browser+" launched successfully with the URL "+url, "pass");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not create error");
			reportStep("The browser "+browser+" is not launched due to session not create error", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
		}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data );
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" ïs not found in the DOM");
			reportStep("The element with id "+idValue+" ïs not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
			
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+"is not interactable in the application");
			reportStep("The element with id "+idValue+"is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is detached form the current DOM");
			reportStep("The element with id "+idValue+" is detached form the current DOM", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.out.println("The element with id "+idValue+" in the webpage is not loaded due to unkown error");
			reportStep("The element with id "+idValue+" in the webpage is not loaded due to unkown error", "fail");
		} 		
	}
	

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data", "pass");
		} catch (NoSuchElementException e ) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		}catch(ElementNotVisibleException e){
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
		}catch(ElementNotInteractableException e) {		
			//System.err.println("The element with name "+nameValue+ " is not intractable in the application");
			reportStep("The element with name "+nameValue+ " is not intractable in the application", "fail");
		}catch(StaleElementReferenceException e) {
			//System.err.println("The element with name"+nameValue+" is detached form the current DOM");
			reportStep("The element with name"+nameValue+" is detached form the current DOM", "fail");
		}catch(WebDriverException e){
			//System.err.println("The elemenet with name "+nameValue+" in the webpage is not loaded due to unkown error");
			reportStep("The elemenet with name "+nameValue+" in the webpage is not loaded due to unkown error", "fail");
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
		//	System.out.println("The element with xPath "+xpathValue+" is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with this xPath "+xpathValue+" is not found in the DOM");
			reportStep("The element with this xPath "+xpathValue+" is not found in the DOM ", "fail");
		}catch(ElementNotVisibleException e) {
			//System.err.println("The element with this xPath "+xpathValue+" is not visible in the application");
			reportStep("The element with this xPath "+xpathValue+" is not visible in the application", "fail");
		}catch(ElementNotInteractableException e){
			//System.err.println("The element with this xPath "+xpathValue+" is not intractable in the application");
			reportStep("The element with this xPath "+xpathValue+" is not intractable in the application", "fail");
		}catch(StaleElementReferenceException e) {
			//System.err.println("The element with this xPath "+xpathValue+ " is detached form the current DOM");
			reportStep("The element with this xpath "+xpathValue+ " is detached form the current DOM", "fail");
		}catch(WebDriverException e) {
			//System.err.println("The element with this xPath "+xpathValue+" in the webpage is not loaded due to unkown error");
			reportStep("The element with this xPath "+xpathValue+" in the webpage is not loaded due to unkown error", "fail");
		}		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		String actualTitle = driver.getTitle();
		try {
			if(actualTitle.equals(title)) {
				//System.out.println("The actual title "+actualTitle+"of the page is mached with expected title"+title );
				reportStep("The actual title "+actualTitle+"of the page is mached with expected title", "pass");
			} else {
				//System.err.println("The actual title "+actualTitle+"of the page is not matched with the expected "+title);
				reportStep("The actual title "+actualTitle+"of the page is not matched with the expected ", "pass");
			}
		}catch(UnreachableBrowserException e) 
		{
			//System.err.println("The webpage with the title "+actualTitle+ " is failed to load in the browser");\
			reportStep("The webpage with the title "+actualTitle+" is failed to load in the browser", "fail");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The webpage window with the title "+actualTitle+" is not opened");
			reportStep("The webpage window with the title "+actualTitle+" is not opened", "fail");
		}catch(SessionNotCreatedException e) {
			//System.err.println("The session of the webpage with the title "+actualTitle+" is not created");
			reportStep("The session of the webpage with the title "+actualTitle+" is not created", "fail");
		}catch(NoSuchSessionException e) {
			//System.err.println("The session of the webpage with the title "+actualTitle+" is not maintained");
			reportStep("The session of the webpage with the title "+actualTitle+" is not maintained", "fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The webpage with the title "+actualTitle+ " is not loaded due to unkown error");
			reportStep("The webpage with the title "+actualTitle+ " is not loaded due to unkown error", "fail");
		}		
	}

	public String verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		String actualText=driver.findElementById(id).getText();
		try {
			if(actualText.equals(text))
			{
				//System.out.println("The actual text "+actualText+" is matched with the given text "+text);
				reportStep("The actual text "+actualText+" is matched with the given text ", "pass");
			}else
			{
				//System.err.println("The actual text "+actualText+" is not matched with the given text "+text);
				reportStep("The actual text "+actualText+" is not matched with the given text ", "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the id "+id+"  having the text "+actualText+" is not found in the DOM");
			reportStep("The element with the id "+id+"  having the text "+actualText+" is not found in the DOM", "fail");		
		}
		catch(ElementNotVisibleException e){
			//System.err.println("The element with the id "+id+" having the text "+actualText+ " is not visible in the application");
			reportStep("The element with the id "+id+" having the text "+actualText+ " is not visible in the application", "fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with the id "+id+ "having the text "+ actualText +" is not interactable in the application");
			reportStep("The element with the id "+id+ "having the text "+ actualText +" is not interactable in the application", "fail");
		}catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with the id "+id+" having the text "+actualText+ " is detached form the current DOM");
			reportStep("The element with the id "+id+" having the text "+actualText+ " is detached form the current DOM", "fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The element with the id "+id+" having the text "+actualText+" in the webpage is not loaded due to unkown error");
			reportStep("The element with the id "+id+" having the text "+actualText+" in the webpage is not loaded due to unkown error", "fail");
		}		
		return text;
	}

	public String verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		String actualText=driver.findElementByXPath(xpath).getText();
		try {
			if(actualText.equals(text))
			{
				//System.out.println("The actualText "+actualText+" is matched with the given text "+text);
				reportStep("The actualText "+actualText+" is matched with the given text "+text, "pass");
			}else
			{
				//System.err.println("The actualText "+actualText+" is not matched with the given text "+text);
				reportStep("The actualText "+actualText+" is not matched with the given text "+text, "pass");
				
			}
		} catch (NoSuchElementException e)		
		{
			// TODO Auto-generated catch block
			//System.err.println("The element with the xpath "+xpath+" having text "+actualText+" is not found in the DOM");
			reportStep("The element with the xpath "+xpath+" having text "+actualText+" is not found in the DOM", "fail");
		}catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with the xpath "+xpath+" having text "+actualText+" is not found in the application");
			reportStep("The element with the xpath "+xpath+" having text "+actualText+" is not found in the application", "fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with the xpath "+xpath+" having text "+actualText+" is not interactable in the application");
			reportStep("The element with the xpath "+xpath+" having text "+actualText+" is not interactable in the application", "fail");
		}catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with the xpath "+xpath+" having text "+actualText+" is detached from the current DOM");
			reportStep("The element with the xpath "+xpath+" having text "+actualText+" is detached from the current DOM", "fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The element with the xpath "+xpath+ " having text "+actualText+ " in the webpage is not loaded due to unknown error");
			reportStep("The element with the xpath "+xpath+ " having text "+actualText+ " in the webpage is not loaded due to unknown error", "fail");
		}
		return text;
	}
	

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		String textContains=driver.findElementByXPath(xpath).getText();
		try {
			if(textContains.contains(text))
			{
				//System.out.println("The element with  xpath "+xpath+ " contains the text "+text);
				reportStep("The element with  xpath "+xpath+ " contains the text ", "pass");
			}else
			{
				//System.err.println("The element with the xpath "+xpath+ " does not contain the text "+text);
				reportStep("The element with the xpath "+xpath+ " does not contain the text ", "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with  xpath "+xpath+" that contains the text "+text+" is not found in the DOM");
			reportStep("The element with  xpath "+xpath+" that contains the text "+text+" is not found in the DOM", "fail");
		}catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with  xpath "+xpath + " that contains the text "+text+" is not found in the application");
			reportStep("The element with  xpath "+xpath + " that contains the text "+text+" is not found in the application", "fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with  xpath  "+xpath+" that contains the text "+text+" is not interactable in the application");
			reportStep("The element with  xpath  "+xpath+" that contains the text "+text+" is not interactable in the application", "fail");
		}catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xpoath "+xpath+" that contains the text "+text+" is detached in the current DOM");
			reportStep("The element with xpath "+xpath+" that contains the text "+text+" is detached in the current DOM", "fail");
			
		}catch(WebDriverException e)
		{
			//System.err.println("The element with xpath "+xpath+" in the webpage does not contains the text "+text+" due to unkown error");
			reportStep("The element with xpath "+xpath+" in the webpage does not contains the text \"+text+\" due to unkown error", "fail");
		}		
		}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked");
			reportStep("The element with id "+id+" is clicked", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is intercepted to click in the application");
			reportStep("The element with id "+id+" is intercepted to click in the application", "fail");
		}catch(NoSuchElementException e)
		{
			//System.err.println("The element clicked with the  id "+id+" is not found in the DOM");
			reportStep("The element clicked with the  id "+id+" is not found in the DOM", "fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element clicked with id "+id+" is not visible in the application");
			reportStep("The element clicked with id "+id+" is not visible in the application", "fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The element clicked with id "+id+" is not interactable in the appication");
			reportStep("The element clicked with id "+id+" is not interactable in the appication", "fail");
		}catch(StaleElementReferenceException e)
		{
			//System.err.println("The element clicked with id "+id+" is detached from the current DOM");
			reportStep("The element clicked with id "+id+" is detached from the current DOM","false");
		}catch(WebDriverException e)
		{
			//System.err.println("The element with id "+id+" in the webpage is not clickable due to an unknown error");
			reportStep("The element with id "+id+" in the webpage is not clickable due to an unknown error", "fail");
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with ClassName "+classVal+"is clicked");
			reportStep("The element with ClassName "+classVal+"is clicked", "pass");
		}
		catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the class name "+classVal+" is intercepted to click in the application");
			reportStep("The element with the class name "+classVal+" is intercepted to click in the application", "fail");
		}catch(NoSuchElementException e)
		{
			//System.err.println("The element clicked with the class name "+classVal+" is not found in the DOM");
			reportStep("The element clicked with the class name "+classVal+" is not found in the DOM", "fail");
		}catch(ElementNotVisibleException e)
		{
			//System.err.println("The element clicked with the class name "+classVal+" is not visible in the application");
			reportStep("The element clicked with the class name "+classVal+" is not visible in the application", "fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The element clicked with the class name "+classVal+" is not interactable in the application");
			reportStep("The element clicked with the class name "+classVal+" is not interactable in the application", "fail");
		}catch(StaleElementReferenceException e)
		{
			//System.err.println("The element clicked with the class name "+classVal+" is detached from the current DOM");
			reportStep("The element clicked with the class name "+classVal+" is detached from the current DOM", "fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The element with the class name "+classVal+" is not clickable due to unknown error");
			reportStep("The element with the class name "+classVal+" is not clickable due to unknown error", "fail");
		}
		}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with Name "+name+" is clicked");
			reportStep("The element with Name "+name+" is clicked", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with the name "+name+" is intercepted to click in the application");
			reportStep("The element with the name "+name+" is intercepted to click in the application", "fail");
		}catch(NoSuchElementException e)
		{
			//System.err.println("The element clicked with the name "+name+" is not found in the application");
			reportStep("The element clicked with the name "+name+" is not found in the application", "fail");
			
		}catch(ElementNotVisibleException e)
		{
			//System.err.println("The element clicked with the name "+name+" is not visible in the application");
			reportStep("The element clicked with the name "+name+" is not visible in the application", "fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The elemenet clicked with the name "+name+" is not interactable in the application");
			reportStep("The elemenet clicked with the name "+name+" is not interactable in the application", "fail");
		}catch(StaleElementReferenceException e)
		{						
			//System.err.println("The element clicked with the name "+name+" is detached from the current DOM");
			reportStep("The element clicked with the name "+name+" is detached from the current DOM", "fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The element with the name "+name+" is not clickable due to unknown error");
			reportStep("The element with the name \"+name+\" is not clickable due to unknown error", "fail");
		}		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with the LinkText "+name+" is clicked");
			reportStep("The element with the LinkText "+name+" is clicked", "pass");
		} 
		catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The link  with the text "+name+" is intercepted to click in the application");
			reportStep("The link  with the text "+name+" is intercepted to click in the application", "fail");
		}
		catch(NoSuchElementException e)
		{
			//System.err.println("The link  with the text  "+name+" is not found in the application");
			reportStep("The link  with the text  "+name+" is not found in the application","fail");
		}catch(ElementNotVisibleException e)
		{
			//System.err.println("The link  with the text "+name+" is not visible in the application");
			reportStep("The link  with the text "+name+" is not visible in the application","fail");

		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The link  with the text "+name+" is not interactable in the application");	
			reportStep("The link  with the text "+name+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e)
		{
			reportStep("The link  with the text "+name+" is detached from the current DOM","fail");
			//System.err.println("The link  with the text "+name+" is detached from the current DOM","fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The link  with the text "+name+ " is not clickable due to unknown error");
			reportStep("The link  with the text "+name+ " is not clickable due to unknown error","fail");
		}	
	
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with the LinkText "+name+" is clicked");
			reportStep("The element with the LinkText "+name+" is clicked", "pass");
		} 
		catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The link with the text "+name+" is intercepted to click in the application");
			reportStep("The link with the text "+name+" is intercepted to click in the application","fail");
		}catch(NoSuchElementException e)
		{
			//System.err.println("The link with the text "+name+" is not found in the DOM");
			reportStep("The link with the text "+name+" is not found in the DOM","fail");
		}catch(ElementNotVisibleException e)
		{
			//System.err.println("The link with the text "+name+" is not visible in the application");
			reportStep("The link with the text "+name+" is not visible in the application","fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The link with the text "+name+" is not interactable in the application");
			reportStep("The link with the text "+name+" is not interactable in the application","fail");
			
		}catch(StaleElementReferenceException e)
		{
			//System.err.println("The link with the text "+name+" is detached from the current DOM");
			reportStep("The link with the text "+name+" is detached from the current DOM","fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The link with the text "+name+" is not clickable due to unknown error");
			reportStep("The link with the text "+name+" is not clickable due to unknown error","fail");
		}	
	}	

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with the XPath "+xpathVal+" is clicked");
			reportStep("The element with xPath "+xpathVal+" is clicked", "pass");
		} 
		catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is intercepted to click in the application");
			reportStep("The element with xpath "+xpathVal+" is intercepted to click in the application","fail");
		}catch(NoSuchElementException e)
		{
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM" );
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM","fail" );
		}catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application","fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with xpath "+xpathVal+" is not inetractable in the application");
			reportStep("The element with xpath "+xpathVal+" is not inetractable in the application","fail");
		}catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xpath "+xpathVal+" is detached from the current DOM");
			reportStep("The element with xpath "+xpathVal+" is detached from the current DOM","fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The element with the xpath "+xpathVal+" is not clikcable due to unknown error");
			reportStep("The element with the xpath "+xpathVal+" is not clikcable due to unknown error","fail");
		}		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
	try {
		driver.findElementByXPath(xpathVal).click();
		//System.out.println("The element with Xpath "+xpathVal+" is clicked");
		reportStep("The element with Xpath "+xpathVal+" is clicked", "pass");
	}
	catch(ElementClickInterceptedException e)
	{
		//System.err.println("The element with xpath "+xpathVal+" is intercepted to click in the application");
		reportStep("The element with xpath "+xpathVal+" is intercepted to click in the application","fail");
	}	
	catch(NoSuchElementException e)
	{
		//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM" );
		reportStep("The element with xpath "+xpathVal+" is not found in the DOM","fail");
	}
	catch(ElementNotVisibleException e)	
	{
		//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
		reportStep("The element with xpath "+xpathVal+" is not visible in the application","fail");
	}
	catch(ElementNotInteractableException e)
	{
		//System.err.println("The element with xpath "+xpathVal+" is not inetractable in the application");
		reportStep("The element with xpath "+xpathVal+" is not inetractable in the application","fail");
	}
	catch(StaleElementReferenceException e)
	{
		//System.err.println("The element with xpath "+xpathVal+" is detached from the current DOM");
		reportStep("The element with xpath "+xpathVal+" is detached from the current DOM","fail");
	}catch(WebDriverException e)
	{
		//System.err.println("The element with the xpath "+xpathVal+" is not clikcable due to unknown error");
		reportStep("The element with the xpath "+xpathVal+" is not clikcable due to unknown error","fail");
	}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String strIdTxt=null;
		try 
		{
			strIdTxt = driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" the text is  : "+strIdTxt);
			reportStep("The element with id "+idVal+" the text is  : "+strIdTxt,"pass");
		}
			
		catch(NoSuchElementException e)
		{
			//System.err.println("The element with id "+idVal+ "having the text" +strIdTxt+" is not found in the DOM" );
			reportStep("The element with id "+idVal+ "having the text" +strIdTxt+" is not found in the DOM" ,"fail");
		}
		catch(ElementNotVisibleException e)	
		{
			//System.err.println("The element with id "+idVal+ "having the text" +strIdTxt+"is not visible in the application");
			reportStep("The element with id "+idVal+ "having the text" +strIdTxt+"is not visible in the application","fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with id "+idVal+"having the text" +strIdTxt+ "is not inetractable in the application");
			reportStep("The element with id "+idVal+"having the text" +strIdTxt+ "is not inetractable in the application","fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with id "+idVal+"having the text" +strIdTxt+ " is detached from the current DOM");
			reportStep("The element with id "+idVal+"having the text" +strIdTxt+ " is detached from the current DOM","fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The element with the id "+idVal+"having the text" +strIdTxt +"is in unknown error");
			reportStep("The element with the id "+idVal+"having the text" +strIdTxt +"is in unknown error","fail");
		}				
		return strIdTxt;
	}

	public String getTextByXpath(String xpathVal) 
	{
		// TODO Auto-generated method stub	
		String strXPathTxt=null;
		try 
		{
			strXPathTxt=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Element with xpath "+xpathVal+" is holding the text "+strXPathTxt);
			reportStep("The element with xpath "+xpathVal+" is holding the text "+strXPathTxt, "pass");
		}
		catch(NoSuchElementException e)
		{
			//System.err.println("The element with xPath "+xpathVal+ "having the text" +strXPathTxt+" is not found in the DOM" );
			reportStep("The element with xPath "+xpathVal+ "having the text" +strXPathTxt+" is not found in the DOM" ,"fail");
		}
		catch(ElementNotVisibleException e)	
		{
			//System.err.println("The element with xPath "+xpathVal+ "having the text" +strXPathTxt+"is not visible in the application");
			reportStep("The element with xPath "+xpathVal+ "having the text" +strXPathTxt+"is not visible in the application","fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with xPath "+xpathVal+"having the text" +strXPathTxt+ "is not inetractable in the application");
			reportStep("The element with xPath "+xpathVal+"having the text" +strXPathTxt+ "is not inetractable in the application","fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with xPath"+xpathVal+"having the text" +strXPathTxt+ " is detached from the current DOM");
			reportStep("The element with xPath"+xpathVal+"having the text" +strXPathTxt+ " is detached from the current DOM","fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The element with the xPath "+xpathVal+"having the text" +strXPathTxt +"is in unknown error");
			reportStep("The element with the xPath "+xpathVal+"having the text" +strXPathTxt +"is in unknown error","fail");
		}		

		return strXPathTxt;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement webEleVisibleTxt=driver.findElementById(id);
			Select selId=new Select(webEleVisibleTxt);
			selId.selectByVisibleText(value);
			//System.out.println("Dropdown is selected with the visible text value "+value);
			reportStep("Dropdown is selected with the visible text value "+value, "pass");			
		}		
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with id "+id+" having the text "+value+"is not selectable in the DOM","fail");
			//System.err.println("The element with id "+id+" having the text "+value+"is not selectable in the DOM");
		}
		catch (ElementClickInterceptedException e) {
				
			reportStep("The element with the id "+id+" having the text "+value +" is intercepted to click","fail");
			//System.err.println("The element with the id "+id+" having the text "+value +" is intercepted to click");

		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The element with the id "+id +" is not interactable in the DOM","fail");
			//System.err.println("The element with the id "+id +" is not interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with the id "+id+"is detatched from the DOM","fail");
			//System.err.println("The element with the id "+id+"is detatched from the DOM");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The element with the id "+id+"is not found in the DOM","fail");
			//System.err.println("The element with the id "+id+"is not found in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with the id "+id+" is in unknown error","fail");
			//System.err.println("The element with the id "+id+" is in unknown error");
		}
	}
	
	

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement webEleIndx=driver.findElementById(id);
			Select selIdIndx=new Select(webEleIndx);
			selIdIndx.selectByIndex(value);
			
			//System.out.println("Dropdown is selected with the index value "+value);
			reportStep("Dropdown is selected with the index value"+value, "pass");
			
		}
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with id "+id+" having the text "+value+"is not selectable in the DOM","fail");
			//System.err.println("The element with id "+id+" having the text "+value+"is not selectable in the DOM");
		}
		catch (ElementClickInterceptedException e) {
				
			reportStep("The element with the id "+id+" having the text "+value +" is intercepted to click","fail");
			//System.err.println("The element with the id "+id+" having the text "+value +" is intercepted to click");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The element with the id "+id +" is not interactable in the DOM","fail");
			//System.err.println("The element with the id "+id +" is not interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with the id "+id+"is detatched from the DOM","fail");
			//System.err.println("The element with the id "+id+"is detatched from the DOM","fail");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The element with the id "+id+"is not found in the DOM","fail");
			//System.err.println("The element with the id "+id+"is not found in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with the id "+id+" is in unknown error","fail");
			//System.err.println("The element with the id "+id+" is in unknown error");
		}		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			
			Set<String> strWinIdAfterClick=driver.getWindowHandles();
			for(String eachWInId:strWinIdAfterClick)
			{
				driver.switchTo().window(eachWInId);
				break;
			}
			
			//System.out.println("driver switched to parent window");
			reportStep("driver switched to parent window","pass");
			} 
		catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window not found in the DOM ");			
			reportStep("The window not found in the DOM ","fail");
		}
		catch(UnreachableBrowserException e)
		{
			//System.err.println("There is a problem in communicating the browser or the selenium server");
			reportStep("There is a problem in communicating the browser or the selenium server","fail");
		}
		catch(ImeActivationFailedException e)
		{
			//System.err.println("This browser  failed to open since IME avtivation is failed");
			reportStep("This browser  failed to open since IME avtivation is failed","fail");
		}catch(ImeNotAvailableException e)
		{
			//System.err.println("This browser failed to open since IME is not available");
			reportStep("This browser failed to open since IME is not available","fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The browser didnt open due to unknown server error");
			reportStep("The browser didnt open due to unknown server error","fail");
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> strWinIds=driver.getWindowHandles();
			for(String eachWinid: strWinIds)
			{
				
				driver.switchTo().window(eachWinid);
			}
			//System.out.println("The driver switched to last window"+strWinIds);
			reportStep("The driver switched to last window"+strWinIds,"pass");
			
		} 
		catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("The window not found in the DOM ");
			reportStep("The window not found in the DOM ","fail");
		}
	catch(UnreachableBrowserException e)
		{
			//System.err.println("There is a problem in communicating the browser or the selenium server");
			reportStep("There is a problem in communicating the browser or the selenium server","fail");
		}
		catch(ImeActivationFailedException e)
		{
			//System.err.println("This browser  failed to open since IME avtivation is failed");
			reportStep("This browser  failed to open since IME avtivation is failed","fail");
		}catch(ImeNotAvailableException e)
		{
			//System.err.println("This browser failed to open since IME  not available");
			reportStep("This browser failed to open since IME  not available","fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The browser didnt open due to unknown server error");
			reportStep("The browser didnt open due to unknown server error","fail");
		}	
		}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted by clicking on OK button");
			reportStep("The alert is accepted by clicking on OK button", "pass");
		}
		catch(UnhandledAlertException e)
		{
			reportStep("Alert is in exception due to the webdriver is unable to perform alert operation","fail");
			//System.err.println("Alert is in exception due to the webdriver is unable to perform alert operation");
		}
		catch(NoAlertPresentException e)
		{
			reportStep("Exception occurs when there is no such alert is avaiable","fail");
			//System.err.println("Exception occurs when there is no such alert is avaiable");
		}catch(WebDriverException e)
		{
			reportStep("Exception occurs due to unknown server error","fail");
			//System.err.println("Exception occurs due to unknown server error");
		}			
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is dismissed by clicking on Cancel button");
			reportStep("The alert is dismissed by clicking on Cancel button", "pass");
		} 
		catch(UnhandledAlertException e)
		{
			reportStep("Alert is in exception due to the webdriver is unable to perform alert operation","fail");
			//System.err.println("Alert is in exception due to the webdriver is unable to perform alert operation");
		}
		catch(NoAlertPresentException e)
		{
			reportStep("Exception occurs when there is no such alert is avaiable","fail");
			//System.err.println("Exception occurs when there is no such alert is avaiable");
		}catch(WebDriverException e)
		{
			reportStep("Exception occures due to unknown server error","fail");
			//System.err.println("Exception occures due to unknown server error");
		}	
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alertText = null;
		try {
		
			 alertText=driver.switchTo().alert().getText();
			//System.out.println("The alert text is "+alertText);
			 reportStep("The alert text is "+alertText, "pass");
		} 
		catch(NoAlertPresentException e)
		{
			reportStep("Exception occurs when there is no such alert is avaiable","fail");
			//System.err.println("Exception occurs when there is no such alert is avaiable");
		}catch(WebDriverException e)
		{
			reportStep("Exception occures due to unknown server error","fail");
			//System.err.println("Exception occures due to unknown server error");
		}
		
		return alertText;
	}
	
	
	public void setAlertText(String alertText) {
		// TODO Auto-generated method stub
		
		try {
		
			driver.switchTo().alert().sendKeys("alertText");
			//System.out.println("The entered alert text is "+alertText);
			reportStep("The entered alert text is "+alertText,"pass");
		} 
		catch(NoAlertPresentException e)
		{
			//System.err.println("Exception occurs when there is no such alert is avaiable");
			reportStep("Exception occurs when there is no such alert is avaiable","fail");
		}catch(WebDriverException e)
		{
			//System.err.println("Exception occures due to unknown server error");
			reportStep("Exception occures due to unknown server error","fail");
		}	
	}
	
	public void switchFrames(String xpath)
	{
		// TODO Auto-generated method stub
		try { 
			WebElement newFrame = driver.findElementByXPath(xpath);			
			driver.switchTo().frame(newFrame);
			//System.out.println("The webpage is switched to new frame");
			reportStep("The webpage is switched to new frame", "pass");
		}		
		catch(NoSuchFrameException e)
		{
			reportStep("Exception occurs when there is no such frame is avaiable","fail");
			//System.err.println("Exception occurs when there is no such frame is avaiable");
		}
		catch(WebDriverException e)
		{
			reportStep("Exception occurs due to unknown server error","fail");
			//System.err.println("Exception occurs due to unknown server error");
		}			
	}

	
/*
	public void takeSnap()  {
		// TODO Auto-generated method stub
		try {
			File tmp=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshots/snap1.jpeg");		
			FileUtils.copyFile(tmp, dest);
		//	System.out.println("Screenshot of the active webpage" +tmp+ "is taken and placed in the specified destination path : "+dest);
		} catch (ScreenshotException e) {		
			System.err.println("Screenshot of the page is not taken:");
		} catch(FileNotFoundException e)
		{
			System.err.println("Screenshot file is not found");
		}catch (IOException e) {		
			System.err.println("Destination file is not available");
		}catch(WebDriverException e)
		{
			System.err.println("The screenshot is not taken due to unknown error in the browser");
		}		
	}
*/
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The current browser is closed");
			reportStep("The current browser is closed", "pass", false);
		}catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser is in unknown server error");
			reportStep("The browser is in unknown server error", "fail", false);
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All the browsers got closed");
			reportStep("All the browsers got closed", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser is in unknown server error");
			reportStep("The browser is in unknown server error", "fail", false);			
		}	
		
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);			
			//System.out.println("The waiting time for the field is done");
			reportStep("The waiting time for the field is done", "pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The waiting time is not done for the field");
			reportStep("The waiting time is not done for the field", "fail");
		}
	}

	public void webPageDown(String xPath) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xPath).sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The WebPage is scrolled down");
			reportStep("The WebPage scrolled down", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block			
			//System.out.println("The WebPage not scrolled down");
			reportStep("The WebPage not scrolled down", "fail");
		}
	}
	
	public void webPageUp(String xPath) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xPath).sendKeys(Keys.PAGE_UP);
			//System.out.println("The WebPage is scrolled up");
			reportStep("The WebPage is scrolled up", "pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The WebPage is not scrolled up");
			reportStep("The WebPage is not scrolled up", "fail");
		}
	}
	
public void elementKeyTab(String id)
{
	try {
		driver.findElementById("id").sendKeys(Keys.TAB);
		//System.out.println("The control went to next field");
		reportStep("The control went to next element", "pass");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		//System.err.println("The control not moved to next field");
		reportStep("The control not moved to next element","fail");
	}
}


	public void selectVisibileTextByXPath(String XPath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement webEleVisibleTxt=driver.findElementByXPath(XPath);
			Select selId=new Select(webEleVisibleTxt);
			selId.selectByVisibleText(value);
			//System.out.println("Dropdown is selected with the visible text value "+value);
			reportStep("Dropdown is selected with the xpath "+XPath+ "have the  value "+value, "pass");
		}
		
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with xPath "+XPath+" having the text "+value+"is not selectable in the DOM","fail");
			//System.err.println("The element with xPath "+XPath+" having the text "+value+"is not selectable in the DOM");
		}
		catch (ElementClickInterceptedException e) {
				
			reportStep("The element with the XPath "+XPath+" having the text "+value +" is intercepted to click","fail");
			//System.err.println("The element with the XPath "+XPath+" having the text "+value +" is intercepted to click");

		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The element with the XPath "+XPath +" is not interactable in the DOM","fail");
			//System.err.println("The element with the XPath "+XPath +" is not interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with the XPath "+XPath+"is detatched from the DOM","fail");
			//System.err.println("The element with the XPath "+XPath+"is detatched from the DOM");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The element with the XPath "+XPath+"is not found in the DOM","fail");
			//System.err.println("The element with the XPath "+XPath+"is not found in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with the XPath "+XPath+" is in unknown error","fail");
			//System.err.println("The element with the XPath "+XPath+" is in unknown error");
		}
		}
	public void clickByPartialLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByPartialLinkText(name).click();
			//System.out.println("The element with the LinkText "+name+" is clicked");
			reportStep("The element with the LinkText "+name+" is clicked", "pass");
		
		} 
		catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The link  with the text "+name+" is intercepted to click in the application");
			reportStep("The link  with the text "+name+" is intercepted to click in the application","fail");
		}catch(NoSuchElementException e)
		{
			//System.err.println("The link  with the text  "+name+" is not found in the application");
			reportStep("The link  with the text  "+name+" is not found in the application","fail");
		}catch(ElementNotVisibleException e)
		{
			//System.err.println("The link  with the text "+name+" is not visible in the application");
			reportStep("The link  with the text "+name+" is not visible in the application","fail");
		}catch(ElementNotInteractableException e)
		{
			//System.err.println("The link  with the text "+name+" is not interactable in the application");
			reportStep("The link  with the text "+name+" is not interactable in the application","fail");
		}catch(StaleElementReferenceException e)
		{
			//System.err.println("The link  with the text "+name+" is detached from the current DOM");
			reportStep("The link  with the text "+name+" is detached from the current DOM","fail");
		}catch(WebDriverException e)
		{
			//System.err.println("The link  with the text "+name+ " is not clickable due to unknown error");
			reportStep("The link  with the text "+name+ " is not clickable due to unknown error","fail");
		}
		
	}

	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement webEleVisibleTxt=driver.findElementByName(name);
			Select selId=new Select(webEleVisibleTxt);
			selId.selectByVisibleText(value);
			//System.out.println(" Dropdown is selected with the visible text value "+value);
			reportStep("Dropdown is selected with the visible text value "+value, "pass");
		}
		
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with id "+name+" having the text "+value+"is not selectable in the DOM","fail");
			//System.err.println("The element with id "+name+" having the text "+value+"is not selectable in the DOM");
		}
		catch (ElementClickInterceptedException e) {
				
			reportStep("The element with the id "+name+" having the text "+value +" is intercepted to click","fail");
			//System.err.println("The element with the id "+name+" having the text "+value +" is intercepted to click");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The element with the id "+name +" is not interactable in the DOM","fail");
			//System.err.println("The element with the id "+name +" is not interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with the id "+name+"is detatched from the DOM","fail");
			//System.err.println("The element with the id "+name+"is detatched from the DOM");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The element with the id "+name+"is not found in the DOM","fail");
			//System.err.println("The element with the id "+name+"is not found in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with the id "+name+" is in unknown error","fail");
			//System.err.println("The element with the id "+name+" is in unknown error");
		}		
	
	}

	public void selectValueByXPath(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement webEleValue=driver.findElementByName(name);
			Select selId=new Select(webEleValue);
			selId.selectByValue(value);
			//System.out.println(" Dropdown is selected with the visible text value "+value);
			reportStep("Dropdown is selected with the visible text value "+value, "pass");
		}
		
		catch(ElementNotSelectableException e)
		{
			reportStep("The element with xpath "+name+" having the text "+value+"is not selectable in the DOM","fail");
			//System.err.println("The element with id "+name+" having the text "+value+"is not selectable in the DOM");
		}
		catch (ElementClickInterceptedException e) {
				
			reportStep("The element with xpath "+name+" having the text "+value +" is intercepted to click","fail");
			//System.err.println("The element with the id "+name+" having the text "+value +" is intercepted to click");
		}
		catch(ElementNotInteractableException e)
		{
			reportStep("The element with the xpath "+name +" is not interactable in the DOM","fail");
			//System.err.println("The element with the id "+name +" is not interactable in the DOM");
		}
		catch(StaleElementReferenceException e)
		{
			reportStep("The element with the xpath "+name+"is detatched from the DOM","fail");
			//System.err.println("The element with the id "+name+"is detatched from the DOM");
		}
		catch(NoSuchElementException e)
		{
			reportStep("The element with the xpath "+name+"is not found in the DOM","fail");
			//System.err.println("The element with the id "+name+"is not found in the DOM");
		}
		catch(WebDriverException e)
		{
			reportStep("The element with the xpath "+name+" is in unknown error","fail");
			//System.err.println("The element with the id "+name+" is in unknown error");
		}		
	
	}

	public void mouseHoverByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			
			WebElement element = driver.findElementByXPath(xpath);
			
			builder.moveToElement(element).perform();
		//	System.out.println("The element with the xpath "+xpath+" is selected with the xpath value "+element);
			reportStep("The element with the xpath "+xpath+" is selected with the xpath value "+element, "pass");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("The element with the xpath "+xpath+" is not located in the DOM","fail");
			//System.err.println("The element with the id "+xpath+" is not located in the DOM");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			reportStep("The element with the xpath "+xpath+" is not visible in the application","fail");
			//System.err.println("The element with the id "+xpath+" is not visible in the application");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			reportStep("The element with the xpath "+xpath+" is not interactable in the application","fail");
			//System.err.println("The element with the id "+xpath+" is not interactable in the application");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			reportStep("The eelemnt with the xpath "+xpath+" is not stable in the application","fail");
			//System.err.println("The eelemnt with the id "+xpath+" is not stable in the application");
		} catch (WebDriverException e) {
			// TODO: handle exception
			reportStep("The element with the xpath "+xpath+" is not located due to unknown error","fail");
			//System.err.println("The element with the id "+xpath+" is not located due to unknown error");
		}

	
}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		try {
			
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./reports/screenshots/"+number+".png");
			
			FileUtils.copyFile(tmp, dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
		
	}
}
