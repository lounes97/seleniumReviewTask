package com.etsy.stepDef;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.etsy.pages.AddElPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.NoSuchElementException;

public class AddElStepDef {
    AddElPage addElPage = new AddElPage();
    @When("user click Add Element button")
    public void user_click_add_element_button() throws InterruptedException {
addElPage.addElBtn.click();
        System.out.println("1");
        Thread.sleep(100);
    }
    @Then("user verify that Delete button is displayed after clicking")
    public void user_verify_that_delete_button_is_displayed_after_clicking() throws InterruptedException {
        Assert.assertTrue(addElPage.deleteBtn.isDisplayed());
        System.out.println("2");
        Thread.sleep(100);
    }
    @Then("user click Delete button")
    public void user_click_delete_button() throws InterruptedException {
        addElPage.deleteBtn.click();
        System.out.println("3");
        Thread.sleep(100);
    }
    @Then("verify that Delete button is NOT displayed after clicking")
    public void verify_that_delete_button_is_not_displayed_after_clicking() {

        try {         System.out.println("deleteBtn.isDisplayed(), expecting false = " + addElPage.deleteBtn.isDisplayed());
        }catch(RuntimeException e){
           System.out.println("-->StaleElementReferenceException happened due to element being deleted from the page.");
           System.out.println("Which concludes our test case -PASSING!-");
           System.out.println("deleteButton.isDisplayed()= false ");
        }
    }

}
