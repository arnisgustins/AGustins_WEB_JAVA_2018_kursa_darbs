Feature: This feature is about booking a flight

  Scenario: Book a flight
    Given I am on Homepage
    When I create new account and log out
    When I log in this account
      And I navigate to Home page
      And I select FLIGHTS menu in booking section
      And I select Round Trip flight option
      And I set BUSINESS class tickets
      And I set RIGA Arpt as departure airport
      And I set BARCELONA Arpt as arrival airport
      And I set valid departure date
      And I set valid return date
      And I set 2 adults
      And I set 2 children
      And I set 1 infant
      And I search for a flight
      And I book the first flight offer available
      # Done
      And I confirm the booking
      And I navigate to Home page
      And I navigate to Accounts page
      And I open invoice for the newest booking
    Then new booking contains correct flight details