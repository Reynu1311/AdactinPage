package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String json) {
		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JvmReports");

		Configuration con = new Configuration(f, "AdactinHotelBooking");
		con.addClassifications("Platform", "Windows");	
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("BrowserVersion", "83.0(64-Bit)");
		con.addClassifications("SprintNo", "14");
		
		List<String> jsonFiles =new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder rb=new ReportBuilder(jsonFiles, con);
		rb.generateReports();

	}

}
