package com.etsy.stepDef;

import com.etsy.pages.WebTablePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WebTablesStepDef {
    WebTablePage webTablePage =new WebTablePage();
    @Then("verify that Bob’s name is listed as {string}")
    public void verify_that_bob_s_name_is_listed_as(String expectedName) {
        String actualName = webTablePage.BMName.getText();
        Assert.assertEquals(expectedName,actualName);
    }
    @Then("verify that Bob Martin’s order date is as {string}")
    public void verify_that_bob_martin_s_order_date_is_as(String expectedDate) {
        String actualDate = webTablePage.date.getText();
        Assert.assertEquals(expectedDate,actualDate);
    }
}
