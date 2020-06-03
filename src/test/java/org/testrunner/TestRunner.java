package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", dryRun = false, monochrome = true, 
plugin= {"pretty","html:src\\test\\resources\\Reports\\HtmlReports",
		"junit:src\\test\\resources\\Reports\\JXmlReports\\AdactinPage.xml",
		"json:src\\test\\resources\\Reports\\JsonReports\\AdactinHotel.json"})
public class TestRunner {
	@AfterClass
	public static void JvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+ "\\src\\test\\resources\\Reports\\JsonReports\\AdactinHotel.json");

	}

}
