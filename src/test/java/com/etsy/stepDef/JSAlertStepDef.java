package com.etsy.stepDef;

import com.etsy.pages.JSAlertPage;
import com.etsy.utilities.Driver;
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
    }
}
