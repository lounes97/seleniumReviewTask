package com.etsy.stepDef;

import com.etsy.pages.CheckboxPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.awt.*;

public class CheckboxStepDef {
    CheckboxPage checkboxPage = new CheckboxPage();
    @Given("user confirm checkbox 1 is NOT selected by default")
    public void user_confirm_checkbox_is_not_selected_by_default() {
        Assert.assertTrue(!checkboxPage.checkBox1.isSelected());
    }
    @Given("user confirm checkbox 2 is SELECTED by default")
    public void user_confirm_checkbox_is_selected_by_default() {
     Assert.assertTrue(checkboxPage.checkBox2.isSelected());
    }
    @Then("user click to select checkbox 1")
    public void user_click_to_select_checkbox() {
    checkboxPage.checkBox1.click();
    }
    @Then("user click checkbox 2 to deselect it")
    public void user_click_checkbox_to_deselect_it() {
     checkboxPage.checkBox2.click();
    }
    @When("user confirm checkbox 1 is selected")
    public void user_confirm_checkbox_is_selected() {
        Assert.assertTrue(checkboxPage.checkBox1.isSelected());
    }
    @When("user confirm checkbox 2 is not selected")
    public void user_confirm_checkbox_is_not_selected() {
        Assert.assertTrue(!checkboxPage.checkBox2.isSelected());
    }

}
