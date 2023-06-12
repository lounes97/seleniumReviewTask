package com.etsy.stepDef;

import com.etsy.pages.ForgetPasswordPage;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ForgetPasswordStepDefs {

    ForgetPasswordPage forgPass = new ForgetPasswordPage();

    @Given("user go to {string}")
    public void user_go_to(String url) {
        Driver.getDriver().get(url);
    }
    @Then("verify all web-elements are displayed")
    public void verify_all_web_elements_are_displayed() {
        Assert.assertTrue(forgPass.homeLink.isDisplayed());
        Assert.assertTrue(forgPass.emailText.isDisplayed());
        Assert.assertTrue(forgPass.emailBox.isDisplayed());
        Assert.assertTrue(forgPass.forgetHeader.isDisplayed());
        Assert.assertTrue(forgPass.RetPassButton.isDisplayed());
        Assert.assertTrue(forgPass.PoweredByText.isDisplayed());

    }


}
