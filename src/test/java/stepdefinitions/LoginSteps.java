package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import general.TestContext;

public class LoginSteps {

    private TestContext test;

    public LoginSteps(TestContext testContext) {
        this.test = testContext;
    }

    @When("^I log in this account$")
    public void iLogInThisAccount() {

    }
}
