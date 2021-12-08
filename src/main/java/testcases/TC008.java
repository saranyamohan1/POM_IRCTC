package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.page.PanIndia;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC008";
		testCaseDescription="To apply for new Pan Card";
		author="Saranya";
		category="Smoke";
		browserName="chrome";
		appName="panindia";
	}
	@Test
	public void panIndiaValidation() 
	{
		new PanIndia()
		.selectFullNameTitle("MRS.")
		.enterPanFirstName("Saranya")
		.enterPanMiddleName("Varsha")
		.enterPanLastName("Vasanth")
		.enterPanFathersFirstName("Mohan")
		.enterPanFathersMiddleName("Suganthi")
		.enterPanFathersLastName("Munusamy")
		.enterPanMobileNumber("7358095317")
		.enterPanEmail("saranyamohan.be@gmail.com")
		.selectPanSourceOfIncome("Salary")
		.clickOnOffice()
		.enterPanDob("24091988")
		.pageDown()
		.enterPanResidenceHouseNo("1")
		.enterPanResidenceArea("wyz colony")
		.enterPanResidenceCity("Chennai")
		.selectPanResidenceStateOrUnionTerritory("Tamil Nadu")		
		.enterPanResidencePincode("600024")		
		//.pageDown()
		.waitProp(5000)
		.enterPanOfficeName("TVS")
		.enterPanOfficeNo("No 9,Pandian street")
		.enterPanOfficeArea("Padi")
		.enterPanOfficeCity("Chennai")
		.selectOfficeStateOrUnionTerritory("Tamil Nadu")
		.enterPanOfficePincode("600013")		
		.selectPanIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectPanAddressProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectPanDOBProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectPanAadhaarProof("Copy of Aadhaar Card / Letter")
		.selectPanOfficeAddressProof("Credit Card statement carrying Office Address");
	}

}
