package stepdefinitions;



import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.FIREFOX;


public class Hooks {

    @Before
    public void launchBrowser() {
        System.setProperty("selenide.browser", CHROME);
    }

    @Before
    public void openHomepage() {
        open("https://www.phptravels.net/");
    }

    @After
    public void closeBrowser() {
        close();
    }
}
