$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Featurefiles/Loginsearch.feature");
formatter.feature({
  "name": "To validate the search of hotels in Adactin page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the user can login to adactin",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user has to open url of the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_has_to_open_url_of_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to give username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_has_to_give_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the user can view the next page od adactin",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_the_user_can_view_the_next_page_od_adactin()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To search the hotels availability as per user requirement",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To search hotels as per user requirement",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_search_hotels_as_per_user_requirement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in search page of hotel give all details like Location Hotels RoomType NoOfRooms CheckInDate CheckOutDate AdultsPerRoom ChildrenPerRoom",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_is_in_search_page_of_hotel_give_all_details_like_Location_Hotels_RoomType_NoOfRooms_CheckInDate_CheckOutDate_AdultsPerRoom_ChildrenPerRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_search()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To select the searched hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "To select the searched hotel as per user\u0027s search",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_select_the_searched_hotel_as_per_user_s_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click continue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To get the order number after booking hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "To book the hotel and get the order number",
  "keyword": "Given "
});
formatter.step({
  "name": "user has to fill the details for booking  \"\u003cFirst name\u003e\", \"\u003cLast name\u003e\", \"\u003cBilling address\u003e\", \"\u003cCreditcard no\u003e\", \"\u003cCreditcard Type\u003e\", \"\u003cExpiry Date Month\u003e\", \"\u003cExpiry Date year\u003e\" \"\u003cCVV Number\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click Book now",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First name",
        "Last name",
        "Billing address",
        "Creditcard no",
        "Creditcard Type",
        "Expiry Date Month",
        "Expiry Date year",
        "CVV Number"
      ]
    },
    {
      "cells": [
        "Renuka",
        "Devi",
        "Chennai",
        "1234 5678 9874 5879",
        "VISA",
        "February",
        "2015",
        "332"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To get the order number after booking hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "To book the hotel and get the order number",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_book_the_hotel_and_get_the_order_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to fill the details for booking  \"Renuka\", \"Devi\", \"Chennai\", \"1234 5678 9874 5879\", \"VISA\", \"February\", \"2015\" \"332\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_has_to_fill_the_details_for_booking(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Book now",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.click_Book_now()"
});
formatter.result({
  "status": "passed"
});
});