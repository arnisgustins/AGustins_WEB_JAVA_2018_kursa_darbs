package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

public class BookingSteps {

    private TestContext test;

    public BookingSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I select ([^\"]*) menu in booking section$")
    public void iSelectMenuInBookingSection(String bookingType) {
        test.getLandingPage().selectBookingType(bookingType);
    }

    @And("^I select ([^\"]*) flight option$")
    public void iSelectFlightOption(String flightType) {
        test.getLandingPage().selectFlightType(flightType);
        test.getFlight().setFlightType(flightType);
    }

    @And("^I set ([^\"]*) class tickets$")
    public void iSetTicketsClass(String flightClass) {
        test.getFlight().setFlightClass(flightClass);
        test.getLandingPage().selectFlightClass(flightClass);
    }

    @And("^I set ([^\"]*) as departure airport$")
    public void iSetDepartureAirport(String departure) {
        test.getFlight().setDeparture(departure);
        test.getLandingPage().enterDeparture(departure);
        test.getLandingPage().selectSearchResult();
    }

    @And("^I set ([^\"]*) as arrival airport$")
    public void iSetArrivalAirport(String destination) {
        test.getFlight().setDestination(destination);
        test.getLandingPage().enterDestination(destination);
        test.getLandingPage().selectSearchResult();
    }

    @And("^I set valid departure date$")
    public void iSetValidDepartureDate() {
        test.getLandingPage().enterDepartureDate("2019-09-12");
    }

    @And("^I set valid return date$")
    public void iSetValidReturnDate() {
        test.getLandingPage().enterReturnDate("2019-12-12");
    }

    @And("^I set ([^\"]*) adults$")
    public void iSetAdults(String adultAmount) {
        test.getLandingPage().selectGuestsField();
        test.getLandingPage().selectAdultAmount(adultAmount);
    }

    @And("^I set ([^\"]*) children$")
    public void iSetChildren(String childAmount) {
        test.getLandingPage().selectChildAmount(childAmount);
    }

    @And("^I set ([^\"]*) infant$")
    public void iSetInfant(String infantAmount) {
        test.getLandingPage().selectInfantAmount(infantAmount);
        test.getLandingPage().pressGuestsDoneButton();
    }

    @And("^I search for a flight$")
    public void iSearchForAFlight() {
        test.getLandingPage().pressFlightSearchButton();
        test.getNavigation().waitUntilLoadingisDone();
    }

    @And("^I book the first flight offer available$")
    public void iBookTheFirstFlightOfferAvailable() {
        test.getFlightBooking().pressFirstBookingButton();
    }

    @And("^I confirm the booking$")
    public void iConfirmTheBooking() {

    }
}
