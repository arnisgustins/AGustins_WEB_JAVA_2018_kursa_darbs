package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import general.TestContext;

public class NavigationSteps {

    private TestContext test;

    public NavigationSteps(TestContext testContext) {
        this.test = testContext;
    }

    @And("^I navigate to Home page$")
    public void iNavigateToHomePage() {

    }

    @And("^I navigate to Accounts page$")
    public void iNavigateToAccountsPage() {

    }
}
