package com.etsy.stepDef;

import com.etsy.pages.IframeDClickPage;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class IframeTaskStepDef {
    IframeDClickPage iframeDClickPage = new IframeDClickPage();
    @When("user switch to iframe")
    public void user_switch_to_iframe() {
        Driver.getDriver().switchTo().frame("iframeResult");
    }
    @When("double click on the text")
    public void double_click_on_the_text() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(iframeDClickPage.DCCheck).perform();
        Thread.sleep(2000);

    }
    @Then("user verify that text’s {string} attribute value contains {string}.")
    public void user_verify_that_text_s_attribute_value_contains(String style, String expectedValue) {
        String actualValue = iframeDClickPage.DCCheck.getAttribute(style);
        Assert.assertTrue(actualValue.contains(expectedValue));
    }

}
