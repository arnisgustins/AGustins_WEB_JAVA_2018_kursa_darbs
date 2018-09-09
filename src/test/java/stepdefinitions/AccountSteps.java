package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import general.TestContext;

public class AccountSteps {

    private TestContext test;

    public AccountSteps(TestContext testContext) {
        this.test = testContext;
    }

    @Given("^I have an existing account$")
    public void iHaveAnExistingAccount() {

    }
}
