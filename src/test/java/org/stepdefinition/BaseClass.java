package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	Select s;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Renuka\\eclipse-workspace\\Cucumber1\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public void loadUrl(String url) {
		driver.get(url);
	}

	public void chooseText(WebElement e, String text) {
		s = new Select(e);
		s.selectByVisibleText(text);

	}

	public void chooseIndex(WebElement e1, int numb) {
		s = new Select(e1);
		s.selectByIndex(numb);

	}

	public void chooseValue(WebElement e2, String value) {
		s = new Select(e2);
		s.selectByValue(value);
	}

	public void close() {
		driver.quit();
	}

}
