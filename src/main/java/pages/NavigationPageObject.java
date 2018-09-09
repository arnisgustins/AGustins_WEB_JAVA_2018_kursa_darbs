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

    public void waitUntilHomepageIsLoaded() {
        getLoadingIndicator().waitUntil(Condition.attribute("style", "display: none;"), 5000);
    }

    public void pressMyAccountButton() {
        getMyAccountButton().click();
    }

    public void pressLoginButton() {
        getLoginButton().click();
    }

    public void pressHomeButton() {

    }
}
