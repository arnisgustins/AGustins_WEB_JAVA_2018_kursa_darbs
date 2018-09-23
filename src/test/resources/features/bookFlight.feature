Feature: This feature is about booking a flight

  Scenario: Book a flight
    Given I am on Homepage
    When I create new account and log out
    When I log in this account
      And I navigate to Home page
      And I select FLIGHTS menu in booking section
      And I select Round trip flight option
      And I set BUSINESS class tickets
      And I set Riga Arpt as departure airport
      And I set Barcelona Arpt as arrival airport
      And I set 2019-09-12 departure date
      And I set 2019-12-12 return date
      And I set 2 adults
      And I set 2 children
      And I set 1 infant
      And I search for a flight
      And I book the first flight offer available
      And I confirm the booking
      And I navigate to Home page
      And I navigate to Account page
      And I open invoice for the newest booking
    Then new booking contains correct airports
      And new booking contains correct flight type and class
      And new booking contains correct user name and phone number
      And new booking contains correct dates