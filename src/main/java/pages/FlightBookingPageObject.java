package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FlightBookingPageObject {

    private SelenideElement getFirstBookingButton() {
        return $(By.xpath("//button[@id='bookbtn']"));
    }


    public void pressFirstBookingButton() {
        getFirstBookingButton().click();
    }
}
