package com.etsy.stepDef;

import com.etsy.pages.JSAlertPage;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class JSAlertStepDef {
    JSAlertPage jsAlertPage = new JSAlertPage();

    @Then("user click to JS Alert button")
    public void user_click_to_js_alert_button() {
    jsAlertPage.JSAlertBtn.click();
    }
    @Then("user click on Ok button")
    public void user_click_on_ok_button() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @Then("user verify that Successfully clicked an alert text is displayed")
    public void user_verify_that_successfully_clicked_an_alert_text_is_displayed() {
        Assert.assertTrue(jsAlertPage.SuccessfulMsg.isDisplayed());
        String expectedMsg = "You successfully clicked an alert";
        Assert.assertEquals(jsAlertPage.SuccessfulMsg.getText(),expectedMsg);
    }

    @Then("user click JS Confirm button")
    public void userClickJSConfirmButton() {
    jsAlertPage.JSConfirmBtn.click();
    }

    @Then("user verify that “You clicked: Ok” text is displayed.")
    public void userVerifyThatYouClickedOkTextIsDisplayed() {
        Assert.assertTrue(jsAlertPage.SuccessfulMsg.isDisplayed());
        String expectedMsg = "You clicked: Ok";
        Assert.assertEquals(jsAlertPage.SuccessfulMsg.getText(),expectedMsg);
    }

    @Then("user click JS prompt button")
    public void userClickJSPromptButton() {
jsAlertPage.JSPromptBtn.click();
    }

    @And("user send {string} text alert")
    public void userSendTextAlert(String message) {
        Alert alert1 =Driver.getDriver().switchTo().alert();
        alert1.sendKeys(message);
        alert1.accept();

    }


    @Then("user verify that You entered: {string} text is displayed")
    public void userVerifyThatYouEnteredTextIsDisplayed(String textMessage) {
        String expectedMsg = "You entered: " + textMessage;
        Assert.assertEquals(expectedMsg,jsAlertPage.SuccessfulMsg.getText());
    }
}
