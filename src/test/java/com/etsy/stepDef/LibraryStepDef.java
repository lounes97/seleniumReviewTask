package com.etsy.stepDef;

import com.etsy.pages.LibraryPage;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LibraryStepDef {
    LibraryPage libraryPage = new LibraryPage();
    @Given("user on chrome browser")
    public void user_on_chrome_browser() {

    }
    @When("user go to the library web page")
    public void user_go_to_the_library_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }
    @When("user gives {string}")
    public void user_gives(String email) {
     libraryPage.emailBox.sendKeys(email);
    }

    @And("user put incorrect credential {string}")
    public void userPutIncorrectCredential(String password) {
        libraryPage.passwordBox.sendKeys(password);

    }

    @Then("user see {string}")
    public void userSee(String expectedMsg) {
        String actualMsg = libraryPage.alertMsg.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }

    @When("user sign in")
    public void userSignIn() {
        libraryPage.signInBtn.click();
    }
}
