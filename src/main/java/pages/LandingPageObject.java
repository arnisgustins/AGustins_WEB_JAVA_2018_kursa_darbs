package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;

public class LandingPageObject {

    private SelenideElement getBookingTypeButton(String type) {
        return $("li[data-title = '" + type + "']");
    }

    private SelenideElement getFlightTypeCheckbox(String flightType) {
        return $(By.xpath("//label[contains(text(), '"+flightType+"')]/preceding-sibling::div"));
    }

    private SelenideElement getClassSelector() {
        return $("select[name='cabinclass']");
    }

    private SelenideElement getDepartureField() {
        return $("#s2id_location_from input");
    }

    private SelenideElement getDestinationField() {
        return $("#s2id_location_to input");
    }

    private SelenideElement getSearchResult() {
        return $(".select2-result-selectable");
    }

    private SelenideElement getDepartureDateField() {
        return $(By.xpath("//input[@name='departure']"));
    }

    private SelenideElement getReturnDateField() {
        return $(By.xpath("//input[@name='arrival']"));
    }

    private SelenideElement getGuestsField() {
        return $(By.xpath("//input[@name='totalManualPassenger']"));
    }

    private SelenideElement getAdultSelection() {
        return $(By.xpath("//select[@name='madult']"));
    }

    private SelenideElement getChildSelection() {
        return $(By.xpath("//select[@name='mchildren']"));
    }

    private SelenideElement getInfantSelection() {
        return $(By.xpath("//select[@name='minfant']"));
    }

    private SelenideElement getGuestsDoneButton() {
        return $(By.xpath("//button[contains(text(), 'Done')]"));
    }

    private SelenideElement getFlightSearchButton() {
        return $("#flights .search-button button");
    }


    public void selectBookingType(String type) {
        if (type.toUpperCase().equals("FLIGHTS")){
            getBookingTypeButton(type.toLowerCase()).click();
        } else {
            getBookingTypeButton(type.toUpperCase()).click();
        }
    }

    public void selectFlightType(String flightType) {
        getFlightTypeCheckbox(flightType).click();
    }

    public void selectFlightClass(String flightClass) {
        getClassSelector().selectOptionByValue(flightClass.toLowerCase());
    }

    public void enterDeparture(String departure) {
        getDepartureField().sendKeys(departure);
    }

    public void selectSearchResult() {
        getSearchResult().click();
    }

    public void enterDestination(String destination) {
        getDestinationField().sendKeys(destination);
    }

    public void enterDepartureDate(String date) {
        getDepartureDateField().sendKeys(date);
    }

    public void enterReturnDate(String date) {
        getReturnDateField().sendKeys(date);
    }

    public void selectGuestsField() {
        getGuestsField().click();
    }

    public void selectAdultAmount(String adults) {
        getAdultSelection().selectOptionByValue(adults);
    }

    public void selectChildAmount(String children) {
        getChildSelection().selectOptionByValue(children);
    }

    public void selectInfantAmount(String infants) {
        getInfantSelection().selectOptionByValue(infants);
    }

    public void pressGuestsDoneButton() {
        getGuestsDoneButton().click();
    }

    public void pressFlightSearchButton() {
        getFlightSearchButton().click();
    }

}
