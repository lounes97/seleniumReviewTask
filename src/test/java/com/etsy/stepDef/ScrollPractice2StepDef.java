package com.etsy.stepDef;

import com.etsy.pages.ScrollPractice2Page;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollPractice2StepDef {
    ScrollPractice2Page scrollPractice2Page=new ScrollPractice2Page();

    @Then("user scroll down to {string} link")
    public void user_scroll_down_to_link(String string) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",scrollPractice2Page.cydeoLink);
    }
    @Then("user scroll up to {string} link")
    public void user_scroll_up_to_link(String string) {

        scrollPractice2Page.homeLink.click();
    }

}
