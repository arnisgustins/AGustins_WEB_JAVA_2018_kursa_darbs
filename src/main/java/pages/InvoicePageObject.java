package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InvoicePageObject {

    private SelenideElement getAirport(String airport) {
        return $(By.xpath("//table//td[contains(text(), '"+airport+"')]"));
    }

    private SelenideElement getDate(String date) {
        return $(By.xpath("//table//p[contains(text(), '"+date+"')]"));
    }

    private SelenideElement getType(String flightType) {
        return $(By.xpath("//table//h5[contains(text(), '"+flightType.toLowerCase()+"')]"));
    }

    private SelenideElement getClass(String flightClass) {
        return $(By.xpath("//table//h5[contains(text(), '"+flightClass.toLowerCase()+"')]"));
    }

    private SelenideElement getAccountName(String firstName, String lastName) {
        return $(By.xpath("//div[contains(text(), '"+firstName+" "+lastName+"')]"));
    }

    private SelenideElement getPhoneNumber(String number) {
        return $(By.xpath("//div[contains(text(), '"+number+"')]"));
    }


    public boolean isAirportVisible(String airport) {
        return getAirport(airport).isDisplayed();
    }

    public boolean isDateVisible(String date) {
        return getDate(date).isDisplayed();
    }

    public boolean isTypeVisible(String flightType) {
        return getType(flightType).isDisplayed();
    }

    public boolean isClassVisible(String flightClass) {
        return getClass(flightClass).isDisplayed();
    }

    public boolean isNameVisible(String firstName, String lastName) {
        return getAccountName(firstName, lastName).isDisplayed();
    }

    public boolean isPhoneNumberVisible(String number) {
        return getPhoneNumber(number).isDisplayed();
    }

}
