package com.etsy.stepDef;

import com.etsy.pages.StaleElPage;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class StaleElExceptionStepDefs {

    StaleElPage stalePage = new StaleElPage();

    @Then("verify CYDEO link is displayed")
    public void verify_link_is_displayed() {
        Assert.assertTrue(stalePage.cydeoLink.isDisplayed());
    }
    @Then("refresh the page")
    public void refresh_the_page() {
        Driver.getDriver().navigate().refresh();
    }


}
