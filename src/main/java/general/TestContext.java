package general;

import lombok.Data;
import pages.*;

@Data
public class TestContext {

    private User user;
    private Flight flight;
    private AccountPageObject accountPage;
    private ConfirmFlightBookingPageObject confirmBookingPage;
    private FlightDetailsPageObject detailsPage;
    private InvoicePageObject invoicePage;
    private LandingPageObject landingPage;
    private LoginPageObject loginPage;
    private SignUpPageObject signupPage;
    private NavigationPageObject navigation;
    private FlightBookingPageObject flightBooking;

    public TestContext() {
        user = new User();
        flight = new Flight();

        accountPage = new AccountPageObject();
        confirmBookingPage = new ConfirmFlightBookingPageObject();
        detailsPage = new FlightDetailsPageObject();
        invoicePage = new InvoicePageObject();
        landingPage = new LandingPageObject();
        loginPage = new LoginPageObject();
        signupPage = new SignUpPageObject();
        navigation = new NavigationPageObject();
        flightBooking = new FlightBookingPageObject();
    }
}
