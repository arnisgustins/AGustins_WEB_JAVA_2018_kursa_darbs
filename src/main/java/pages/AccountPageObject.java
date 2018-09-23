package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPageObject {

    private SelenideElement getFirstInvoiceButton() {
        return $(By.xpath("//a[contains(text(), 'Invoice')]"));
    }


    public void pressFirstInvoiceButton() {
        getFirstInvoiceButton().click();
    }
}
