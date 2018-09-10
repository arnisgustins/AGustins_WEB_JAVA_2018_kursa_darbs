package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $("input[name = 'firstname']");
    }

    private SelenideElement getLastNameField() {
        return $("input[name = 'lastname']");
    }

    private SelenideElement getMobileNumberField() {
        return $("input[name = 'phone']");
    }

    private SelenideElement getEmailField() {
        return $("input[name = 'email']");
    }

    private SelenideElement getPasswordField() {
        return $("input[name = 'password']");
    }

    private SelenideElement getConfirmPasswordField() {
        return $("input[name = 'confirmpassword']");
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//button[contains(text(), 'Sign Up')]"));
    }

    public void enterFirstName(String firstname) {
        getFirstNameField().sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        getLastNameField().sendKeys(lastname);
    }

    public void enterMobileNumber(String number) {
        getMobileNumberField().sendKeys(number);
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void enterConfirmationPassword(String password) {
        getConfirmPasswordField().sendKeys(password);
    }

    public void selectSignUpButton() {
        getSignUpButton().click();
    }

}
