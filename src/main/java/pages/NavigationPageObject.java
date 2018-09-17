package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigationPageObject {

    private SelenideElement getMyAccountButton() {
        return $(By.xpath("//nav/descendant::li[@id = 'li_myaccount' ]"));
    }

    private SelenideElement getLoadingIndicator() {
        return $(By.id("preloader"));
    }

    private SelenideElement getLoginButton() {
        return $(By.xpath("//nav/descendant::a[ contains(text(), 'Login') ]"));
    }

    private SelenideElement getSignUpButton() {
        return $(By.xpath("//nav/descendant::a[ contains(text(), 'Sign Up') ]"));
    }

    private SelenideElement getLogOutButton() {
        return $(By.xpath("//nav/descendant::a[ contains(text(), 'Logout') ]"));
    }

    private SelenideElement getUserAccountButton(String username) {
        return $(By.xpath("//nav/descendant::a[contains(text(), '" + username + "')]"));
    }

    private SelenideElement getHomeButton() {
        return $(By.xpath("//nav/descendant::a[contains(text(), 'Home')]"));
    }

    public void waitUntilLoadingisDone() {
        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"), 5000);
    }

    public void pressMyAccountButton() {
        getMyAccountButton().click();
    }

    public void pressLoginButton() {
        getLoginButton().click();
    }

    public void pressSignUpButton() {
        getSignUpButton().click();
    }

    public void pressHomeButton() {
        getHomeButton().click();
    }

    public void pressUserAccountButton(String username) {
        getUserAccountButton(username).click();
    }

    public void pressLogOutButton() {
        getLogOutButton().click();
    }
}
