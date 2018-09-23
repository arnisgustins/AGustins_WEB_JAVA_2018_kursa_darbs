package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmFlightBookingPageObject {

    private SelenideElement getConfirmBookingTitle() {
        return $(By.xpath("//div[contains(text(), 'Personal Details')]"));
    }

    private SelenideElement getConfirmBookingButton() {
        return $(By.xpath("//button[contains(text(), 'CONFIRM THIS BOOKING')]"));
    }


    public boolean isBookingConfirmationVisible() {
        return getConfirmBookingTitle().isDisplayed();
    }

    public void pressConfirmBookingButton() {
        getConfirmBookingButton().click();
    }

}
