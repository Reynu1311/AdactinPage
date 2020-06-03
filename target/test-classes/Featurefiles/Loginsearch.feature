Feature: To validate the search of hotels in Adactin page

  @Smoke
  Scenario: To verify the user can login to adactin
    Given user has to open url of the adactin page
    When user has to give username and password
    And click the login button
    Then verify the user can view the next page od adactin

  @Sanity
  Scenario: To search the hotels availability as per user requirement
    Given To search hotels as per user requirement
    When user is in search page of hotel give all details like Location Hotels RoomType NoOfRooms CheckInDate CheckOutDate AdultsPerRoom ChildrenPerRoom
    Then click search

  @Regression
  Scenario: To select the searched hotel
    Given To select the searched hotel as per user's search
    Then click continue

  @Regression
  Scenario Outline: To get the order number after booking hotel
    Given To book the hotel and get the order number
    When user has to fill the details for booking  "<First name>", "<Last name>", "<Billing address>", "<Creditcard no>", "<Creditcard Type>", "<Expiry Date Month>", "<Expiry Date year>" "<CVV Number>"
    Then Click Book now

    Examples: 
      | First name | Last name | Billing address | Creditcard no       | Creditcard Type | Expiry Date Month | Expiry Date year | CVV Number |
      | Renuka     | Devi      | Chennai         | 1234 5678 9874 5879 | VISA            |February  	       | 2015						  |332 |
