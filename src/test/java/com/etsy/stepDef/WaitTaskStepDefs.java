package com.etsy.stepDef;

import com.etsy.pages.WaitTaskPage;
import com.etsy.utilities.BrowserUtil;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitTaskStepDefs {

    WaitTaskPage waitTaskPage = new WaitTaskPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2000);

    @Given("user clicks on Remove button and waits until loading bar disappears")
    public void user_clicks_on_remove_button_and_waits_until_loading_bar_disappears() {

        waitTaskPage.removeButton.click();
        wait.until(ExpectedConditions.invisibilityOf(waitTaskPage.loadingBar));
        try {
            Assert.assertFalse(waitTaskPage.loadingBar.isDisplayed());
        }catch (NoSuchElementException e){
            System.out.println("Test Passed!");
            Assert.assertTrue(true);
        }




    }


    @Then("user verify checkbox is not displayed and {string} message is displayed")
    public void user_verify_checkbox_is_not_displayed_and_message_is_displayed(String expectedMsg) {
        try {
            Assert.assertFalse(waitTaskPage.checkbox.isDisplayed());
        }catch (NoSuchElementException e){
            System.out.println("Test Passed!");
            Assert.assertTrue(true);
        }

        String actualMsg = waitTaskPage.msg.getText();

        Assert.assertEquals(expectedMsg, actualMsg);
    }



}
