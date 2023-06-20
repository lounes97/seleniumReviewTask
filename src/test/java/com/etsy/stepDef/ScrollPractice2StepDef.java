package com.etsy.stepDef;

import com.etsy.pages.ScrollPractice2Page;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollPractice2StepDef {
    ScrollPractice2Page scrollPractice2Page=new ScrollPractice2Page();

    @Then("user scroll down to {string} link")
    public void user_scroll_down_to_link(String string) throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",scrollPractice2Page.cydeoLink);
        Thread.sleep(3000);
    }
    @Then("user scroll up to {string} link")
    public void user_scroll_up_to_link(String string) throws InterruptedException {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",scrollPractice2Page.homeLink);
        Thread.sleep(3000);

    }

}
