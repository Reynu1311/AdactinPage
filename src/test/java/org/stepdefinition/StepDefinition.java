package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.object.pom.BookingConfirmationClass;
import org.object.pom.BookingDetailsClass;
import org.object.pom.BookingSearchClass;
import org.object.pom.BookingSelectionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("user has to open url of the adactin page")
	public void user_has_to_open_url_of_the_adactin_page() {
		openBrowser();
		loadUrl("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MINUTES);

	}

	@When("user has to give username and password")
	public void user_has_to_give_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("ReynukaDevi");
		driver.findElement(By.id("password")).sendKeys("Reynu@123");
	}

	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.id("login")).click();

	}

	@Then("verify the user can view the next page od adactin")
	public void verify_the_user_can_view_the_next_page_od_adactin() throws InterruptedException {
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MINUTES);

	}

	@Given("To search hotels as per user requirement")
	public void to_search_hotels_as_per_user_requirement() {
		driver.getCurrentUrl();
	}

	@When("user is in search page of hotel give all details like Location Hotels RoomType NoOfRooms CheckInDate CheckOutDate AdultsPerRoom ChildrenPerRoom")
	public void user_is_in_search_page_of_hotel_give_all_details_like_Location_Hotels_RoomType_NoOfRooms_CheckInDate_CheckOutDate_AdultsPerRoom_ChildrenPerRoom() {
		PageFactory.initElements(driver, BookingSearchClass.class);
		s = new Select(BookingSearchClass.location);
		s.selectByVisibleText("Los Angeles");
		s = new Select(BookingSearchClass.Hotels);
		s.selectByVisibleText("Hotel Hervey");
		s = new Select(BookingSearchClass.RoomType);
		s.selectByVisibleText("Double");
		s = new Select(BookingSearchClass.RoomNos);
		s.selectByVisibleText("2 - Two");
		BookingSearchClass.CheckIn.sendKeys("02/06/2020");
		BookingSearchClass.CheckOut.sendKeys("03/06/2020");
		s = new Select(BookingSearchClass.AdultRoom);
		s.selectByValue("2");
		s = new Select(BookingSearchClass.ChildRoom);
		s.selectByValue("0");
	}

	@Then("click search")
	public void click_search() {
		driver.findElement(By.id("Submit")).click();
	}

	@Given("To select the searched hotel as per user's search")
	public void to_select_the_searched_hotel_as_per_user_s_search() {
		PageFactory.initElements(driver, BookingSelectionClass.class);
		BookingSelectionClass.selectedHotel.click();

	}

	@Then("click continue")
	public void click_continue() {
		PageFactory.initElements(driver, BookingSelectionClass.class);
		BookingSelectionClass.Continue.click();
	}

	@Given("To book the hotel and get the order number")
	public void to_book_the_hotel_and_get_the_order_number() throws InterruptedException {
		// driver.get("http://adactinhotelapp.com/BookHotel.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@When("user has to fill the details for booking  {string}, {string}, {string}, {string}, {string}, {string}, {string} {string}")
	public void user_has_to_fill_the_details_for_booking(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {
		PageFactory.initElements(driver, BookingDetailsClass.class);
		BookingDetailsClass.firstname.sendKeys(string);
		BookingDetailsClass.lastname.sendKeys(string2);
		BookingDetailsClass.BillingAddress.sendKeys(string3);
		BookingDetailsClass.creditcardNumber.sendKeys(string4);
		BookingDetailsClass.credicardType.sendKeys(string5);
		s = new Select(BookingDetailsClass.CredicardExpMonth);
		s.selectByVisibleText(string6);
		s = new Select(BookingDetailsClass.CreditcardExpYear);
		s.selectByValue(string7);
		BookingDetailsClass.CreditcardCVV.sendKeys(string8);
		BookingDetailsClass.bookNow.click();
	}

	@Then("Click Book now")
	public void click_Book_now() {
		PageFactory.initElements(driver, BookingConfirmationClass.class);
		String order = BookingConfirmationClass.OrderNo.getAttribute("value");
		System.out.println(order);

	}

}
