package org.object.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingSearchClass {
	@FindBy(id = "location")
	public static WebElement location;
	@FindBy(id = "hotels")
	public static WebElement Hotels;
	@FindBy(id = "room_type")
	public static WebElement RoomType;
	@FindBy(id = "room_nos")
	public static WebElement RoomNos;
	@FindBy(id = "datepick_in")
	public static WebElement CheckIn;
	@FindBy(id = "datepick_out")
	public static WebElement CheckOut;
	@FindBy(id = "adult_room")
	public static WebElement AdultRoom;
	@FindBy(id = "child_room")
	public static WebElement ChildRoom;

}
