package stepdefinitions;

import cucumber.api.java.en.When;
import general.TestContext;

public class SignupSteps {

    private TestContext test;

    public SignupSteps(TestContext testContext) {
        this.test = testContext;
    }

    @When("^I create new account and log out$")
    public void iCreateAccount() {
        test.getNavigation().pressMyAccountButton();
        test.getNavigation().pressSignUpButton();

        test.getSignupPage().enterFirstName(test.getUser().getFirstName());
        test.getSignupPage().enterLastName(test.getUser().getLastName());
        test.getSignupPage().enterFirstName(test.getUser().getFirstName());
        test.getSignupPage().enterEmail(test.getUser().getEmail());
        test.getSignupPage().enterPassword(test.getUser().getPassword());
        test.getSignupPage().enterConfirmationPassword(test.getUser().getPassword());
        test.getSignupPage().enterMobileNumber(test.getUser().getMobileNumber());
        test.getSignupPage().selectSignUpButton();

        test.getNavigation().pressUserAccountButton(test.getUser().getFirstName());
        test.getNavigation().pressLogOutButton();
        test.getNavigation().waitUntilLoadingisDone();
    }
}
