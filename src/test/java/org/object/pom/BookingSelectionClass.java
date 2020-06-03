package org.object.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingSelectionClass {
	@FindBy(id = "radiobutton_0")
	public static WebElement selectedHotel;
	@FindBy(id = "continue")
	public static WebElement Continue;

}
