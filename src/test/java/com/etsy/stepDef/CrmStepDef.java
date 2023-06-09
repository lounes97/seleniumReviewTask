package com.etsy.stepDef;

import com.etsy.pages.CrmPage;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
}
