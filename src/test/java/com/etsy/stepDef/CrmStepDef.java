package com.etsy.stepDef;

import com.etsy.pages.CrmPage;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CrmStepDef {
    CrmPage crmPage = new CrmPage();

    @Given("user go to crm web page")
    public void user_go_to_crm_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("crmUrl"));
    }

    @When("user use incorrect username {string}")
    public void user_use_incorrect_username(String userName) {
        crmPage.userBox.sendKeys(userName);
    }

    @When("user use incorrect password {string}")
    public void user_use_incorrect_password(String password) {
        crmPage.passwordBox.sendKeys(password);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        crmPage.loginBtn.click();
    }

    @Then("user verify error message {string}")
    public void user_verify_error_message(String expectedMsg) {
    String actualMsg = crmPage.alertMsg.getText();
        Assert.assertEquals(expectedMsg,actualMsg);
    }

    @Then("user can see the MSG {string}")
    public void userCanSeeTheMSG(String rememberMeExpected) {
        String actualText = crmPage.rememberMsg.getText();
        Assert.assertEquals(rememberMeExpected,actualText);

    }

    @And("user can see {string} Btn")
    public void userCanSeeBtn(String arg0) {

        Assert.assertTrue(crmPage.forgotPasswordBtn.isEnabled());

    }

    @Then("verify login button as {string}")
    public void verifyLoginButtonAs(String expectedString) {
     String actualString = crmPage.LoginBtn.getAttribute("value");
     Assert.assertEquals(expectedString,actualString);
    }
}
