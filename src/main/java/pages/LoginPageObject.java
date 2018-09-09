package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObject {

    private SelenideElement getEmailField() {
        return $("input[name = 'username']");
    }

    private SelenideElement getPasswordField() {
        return $("input[name = 'password']");
    }

    private SelenideElement getLoginButton() {
        return $(By.xpath("//button[contains(text(), 'Login')]"));
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void pressLogin() {
        getLoginButton().click();
    }
}
