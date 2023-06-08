package com.etsy.stepDef;

import com.etsy.pages.CydeoPracticePage;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import javax.swing.*;

public class CydeoPracticeStepDef {
    CydeoPracticePage cydeoPracticePage = new CydeoPracticePage() ;
    @Given("User go to cydeo practice website")
    public void user_go_to_cydeo_practice_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cydeoPractice"));

    }
    @Then("User verify the url contains {string}")
    public void user_verify_the_url_contains(String expectedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }
    @Then("User verify the title is {string}")
    public void user_verify_the_title_is(String expectedTitle) {
    String actualTitle = Driver.getDriver().getTitle();
    Assert.assertEquals(expectedTitle, actualTitle);

    }
    @And("User clicks on {string}")
    public void userClicksOn(String arg0) throws InterruptedException {
    cydeoPracticePage.abTestingBtn.click();
    Thread.sleep(2000);
    }
    @Then("User go back")
    public void user_go_back() {
      Driver.getDriver().navigate().back();


    }
    @Then("User verify again the title is {string}")
    public void userVerifyAgainTheTitleIs(String arg0) {
        Driver.getDriver().getTitle();
    }
}
