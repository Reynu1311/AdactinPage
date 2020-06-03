package org.object.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingDetailsClass {
	@FindBy(id = "first_name")
	public static WebElement firstname;
	@FindBy(id = "last_name")
	public static WebElement lastname;
	@FindBy(id = "address")
	public static WebElement BillingAddress;
	@FindBy(id = "cc_num")
	public static WebElement creditcardNumber;
	@FindBy(id = "cc_type")
	public static WebElement credicardType;
	@FindBy(id = "cc_exp_month")
	public static WebElement CredicardExpMonth;
	@FindBy(id = "cc_exp_year")
	public static WebElement CreditcardExpYear;
	@FindBy(id = "cc_cvv")
	public static WebElement CreditcardCVV;
	@FindBy(id = "book_now")
	public static WebElement bookNow;

}
