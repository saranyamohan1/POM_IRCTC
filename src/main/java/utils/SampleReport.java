package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	
	@Test
	public void generateReport() {
		
		
		// Start Report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start test
		ExtentTest test = report.startTest("TC004", "To verify IRCTC Registration");
		
		test.assignAuthor("Saranya");
		
		test.assignCategory("Functional");
		
		// log test step
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		test.log(LogStatus.PASS, "The browser got launched with the given url successully");
		
		// end Test
		report.endTest(test);
		
		// end report
		report.flush();
		
		
	}
	
	

}
