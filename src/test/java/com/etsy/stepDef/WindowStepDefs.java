package com.etsy.stepDef;

import com.etsy.pages.WindowPage;
import com.etsy.utilities.BrowserUtil;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class WindowStepDefs {

    WindowPage windowPage = new WindowPage();

    @Then("verify title is {string}")
    public void verify_title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    Set<String> windowHandles;
    @Then("user click on Click Here")
    public void user_click_on_click_here() {
        windowPage.clickButton.click();
        windowHandles = Driver.getDriver().getWindowHandles();
        System.out.println("windowHandles = " + windowHandles);
    }

    @Then("user switch to new window")
    public void user_switch_to_new_window() {



        for (String windowHandle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(windowHandle);
            if (Driver.getDriver().getTitle().equals("New Window")){
                break;
            }
        }
    }

    @Then("user verify title is {string}")
    public void user_verify_title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
