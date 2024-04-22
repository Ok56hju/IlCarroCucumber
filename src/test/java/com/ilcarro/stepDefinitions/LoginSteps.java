package com.ilcarro.stepDefinitions;

import home.ilCarro.pages.HomePage;
import home.ilCarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static home.ilCarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void clickOnLoginLink(){
        new HomePage(driver).clickOnLoginClick();
    }
    @And("User enters valid data")
    public void enters_valid_data(){
        new LoginPage(driver).enterData("tes676@gm.com","Qwe1234!");
    }

    @And("User click on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }

    @Then("User verifies Success Massage is displayed")
    public void verifies_Success_Massage(){
        new LoginPage(driver).isMassageDisplayed("Logged in success");
    }
}
