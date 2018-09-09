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
    public void iSelectFLIGHTSMenuInBookingSection(String bookingType) {

    }

    @And("^I select ([^\"]*) flight option$")
    public void iSelectROUNDTRIPFlightOption(String flightOption) {

    }

    @And("^I set ([^\"]*) class tickets$")
    public void iSetFIRSTClassTickets(String flightClass) {

    }

    @And("^I set ([^\"]*) as departure airport$")
    public void iSetRIGAAsDepartureAirport(String departure) {

    }

    @And("^I set ([^\"]*) as arrival airport$")
    public void iSetBARCELONAAsArrivalAirport(String destination) {

    }

    @And("^I set valid departure date$")
    public void iSetValidDepartureDate() {

    }

    @And("^I set valid return date$")
    public void iSetValidReturnDate() {

    }

    @And("^I set ([^\"]*) adults$")
    public void iSetAdults(String adultAmount) {

    }

    @And("^I set ([^\"]*) children$")
    public void iSetChildren(String childAmount) {

    }

    @And("^I set ([^\"]*) infant$")
    public void iSetInfant(String infantAmount) {

    }

    @And("^I search for a flight$")
    public void iSearchForAFlight() {

    }

    @And("^I book the first flight offer available$")
    public void iBookTheFirstFlightOfferAvailable() {

    }

    @And("^I confirm the booking$")
    public void iConfirmTheBooking() {

    }
}
