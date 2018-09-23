package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import general.TestContext;

public class NavigationSteps {

    private TestContext test;

    public NavigationSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        test.getNavigation().waitUntilLoadingisDone();
    }

    @And("^I navigate to Home page$")
    public void iNavigateToHomePage() {
        test.getNavigation().pressHomeButton();
        test.getNavigation().waitUntilLoadingisDone();
    }

    @And("^I navigate to Account page$")
    public void iNavigateToAccountPage() {
        test.getNavigation().pressUserAccountButton(test.getUser().getFirstName());
        test.getNavigation().pressAccountButton();
        test.getNavigation().waitUntilLoadingisDone();
    }
}
