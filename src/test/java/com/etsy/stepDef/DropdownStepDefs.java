package com.etsy.stepDef;



import com.etsy.pages.DropdownPage;
import com.etsy.utilities.BrowserUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownStepDefs {

DropdownPage dropdownPage = new DropdownPage();

    @And("verify default selected for simpleDropdown value is {string}")
    public void verify_default_selected_for_simple_dropdown_value_is(String expectedOption) {
        String actualSelectedOption = BrowserUtil.getSelectedOption(dropdownPage.simpleDropdown);
        Assert.assertEquals(expectedOption, actualSelectedOption);
    }
    @Given("verify default selected for stateDropdown value is {string}")
    public void verify_default_selected_for_state_dropdown_value_is(String expectedOption) {
        String actualSelectedOption = BrowserUtil.getSelectedOption(dropdownPage.stateDropdown);
        Assert.assertEquals(expectedOption, actualSelectedOption);
    }

    /**
     * TC6
     */

    @Given("user select {string} {int} st, {int} and verify it is selected")
    public void user_select_st_and_verify_it_is_selected(String expectedMonth, Integer expectedDay, Integer expectedYear) {
        Select month = new Select(dropdownPage.monthDropdown);
        Select day = new Select(dropdownPage.dayDropdown);
        Select year = new Select(dropdownPage.yearDropdown);

        month.selectByVisibleText(expectedMonth);
        day.selectByValue(""+expectedDay);
        year.selectByVisibleText(""+expectedYear);

        Assert.assertEquals(expectedMonth, month.getFirstSelectedOption().getText());
        Assert.assertEquals(expectedDay, Integer.valueOf(day.getFirstSelectedOption().getText()));
        Assert.assertEquals(expectedYear, Integer.valueOf(year.getFirstSelectedOption().getText()));
    }

}
