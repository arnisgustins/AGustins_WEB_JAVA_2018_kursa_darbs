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
    private NavigationPageObject navigation;

    public TestContext() {
        user = new User("test@test.com", "test123");
        flight = new Flight();

        accountPage = new AccountPageObject();
        confirmBookingPage = new ConfirmFlightBookingPageObject();
        detailsPage = new FlightDetailsPageObject();
        invoicePage = new InvoicePageObject();
        landingPage = new LandingPageObject();
        loginPage = new LoginPageObject();
        navigation = new NavigationPageObject();
    }
}
