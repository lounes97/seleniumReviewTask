package com.etsy.stepDef;

import com.etsy.pages.GooglePage;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDef {
    GooglePage googlePage=new GooglePage();
    @Given("user open the google on home page")
    public void user_open_the_google_on_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("googleURL"));
    }
    @Then("user press Enter")
    public void user_press_enter() {
       googlePage.searchBox.sendKeys(Keys.ENTER);

    }
    @Then("user verify title contains {string}")
    public void user_verify_title_contains(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Then("user types {string} in google search box")
    public void userTypesInGoogleSearchBox(String apple) {
        googlePage.searchBox.click();
        googlePage.searchBox.sendKeys(apple);
    }
}
