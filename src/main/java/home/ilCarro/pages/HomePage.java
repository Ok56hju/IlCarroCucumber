package home.ilCarro.pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1")
    WebElement homePageTitle;
    public HomePage isHomePageTitelDisplayed() {
        assert isElementDisplayd(homePageTitle);
        return new HomePage(driver);
    }

    @FindBy(css = ".navigation-link:nth-child(6)")
    WebElement loginLink;
    public LoginPage clickOnLoginClick() {
        click(loginLink);
        return new LoginPage(driver);
    }
    @FindBy(id = "city")
    WebElement cityInput;
    public HomePage inputValidCity(String city) {
        if (city != null){
            type(cityInput,city);
            cityInput.sendKeys(Keys.ENTER);
        }
        return this;
    }
    @FindBy(id = "dates")
    WebElement datesEnter;
    public HomePage enterDates(String[] dates) {
        String os = System.getProperty("os.name");
        for (int i = 0; i < dates.length; i++) {
            if (os.startsWith("Mac")) {
                datesEnter.sendKeys(Keys.COMMAND, "a");
            } else {
                datesEnter.sendKeys(Keys.CONTROL, "a");
            }

            datesEnter.sendKeys(dates[i]);

            if (i < dates.length - 1) {
                datesEnter.sendKeys(Keys.ENTER);
            }
        }

        datesEnter.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;
    public FindYourCarNowPage clickOnYallaButton() {
        click(yallaButton);
        return new FindYourCarNowPage(driver);
    }
}
