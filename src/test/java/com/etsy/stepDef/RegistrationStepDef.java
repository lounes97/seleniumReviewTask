package com.etsy.stepDef;

import com.etsy.pages.RegistrationPage;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class RegistrationStepDef {

    RegistrationPage regPage = new RegistrationPage();

    @Given("user go to cydeo registration webPage")
    public void user_go_to_cydeo_registration_web_page() {
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");
    }
    @Then("header text should be {string}")
    public void header_text_should_be(String expHeader) {
        String actHeader = regPage.headerBox.getText();
        Assert.assertEquals(expHeader, actHeader);
    }
    @Then("placeholder attribute value should be {string}")
    public void placeholder_attribute_value_should_be(String string) {
        String actPlaceholder = regPage.firstNameBox.getAttribute("placeholder");
        Assert.assertEquals(string, actPlaceholder);
    }

}
