package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.TestContext;

import static com.codeborne.selenide.Selenide.switchTo;
import static org.assertj.core.api.Assertions.assertThat;

public class InvoiceSteps {
    private TestContext test;

    public InvoiceSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I open invoice for the newest booking$")
    public void iOpenInvoiceForTheNewestBooking() {
        test.getAccountPage().pressFirstInvoiceButton();
        switchTo().window("Invoice");
        test.getNavigation().waitUntilLoadingisDone();
    }

    @Then("^new booking contains correct airports$")
    public void newBookingContainsCorrectAirports() {
        assertThat(test.getInvoicePage().isAirportVisible(test.getFlight().getDeparture())).isTrue();
        assertThat(test.getInvoicePage().isAirportVisible(test.getFlight().getDestination())).isTrue();
    }

    @And("^new booking contains correct flight type and class$")
    public void newBookingContainsCorrectFlightTypeAndClass(){
        assertThat(test.getInvoicePage().isTypeVisible(test.getFlight().getFlightType())).isTrue();
        assertThat(test.getInvoicePage().isClassVisible(test.getFlight().getFlightClass())).isTrue();
    }

    @And("^new booking contains correct user name and phone number$")
    public void newBookingContainsCorrectUserNameAndPhoneNumber() {
        assertThat(test.getInvoicePage().isNameVisible(
                test.getUser().getFirstName(), test.getUser().getLastName())).isTrue();
        assertThat(test.getInvoicePage().isPhoneNumberVisible(test.getUser().getMobileNumber())).isTrue();
    }

    @And("^new booking contains correct dates$")
    public void newBooingContainsCorrectDates() {
        assertThat(test.getInvoicePage().isDateVisible(test.getFlight().getDepartureDate())).isTrue();
        assertThat(test.getInvoicePage().isDateVisible(test.getFlight().getReturnDate())).isTrue();
    }
}
