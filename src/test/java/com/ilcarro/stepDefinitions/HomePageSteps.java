package com.ilcarro.stepDefinitions;

import home.ilCarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static home.ilCarro.pages.BasePage.driver;

public class HomePageSteps {
    @Given("User launches Chrome browser")
    public void launch_Chrome_browser(){
        new HomePage(driver).launchBrowser();
    }

    @When("User opens ilCarro HomePage")
    public void open_HomePage(){
        new HomePage(driver).openUrl();
    }
    @Then("User verifies HomePage is displayed")
    public void verify_HomePage_title(){
        new HomePage(driver).isHomePageTitelDisplayed();
    }
    @And("User quites browser")
    public void quites_browser(){
        new HomePage(driver).quit();
    }
    @And("User inputs valid data")
    public void inputs_valid_data(){
        new HomePage(driver).inputValidCity("Jerusalem,Israel").enterDates(new String[] {"25/04/2024","27/04/2024"});
    }
    @And("User click on Yalla button for search")
    public void click_Yalla_button(){
        new HomePage(driver).clickOnYallaButton();
    }


}
