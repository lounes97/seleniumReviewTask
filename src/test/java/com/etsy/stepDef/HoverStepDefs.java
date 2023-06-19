package com.etsy.stepDef;

import com.etsy.pages.HoverPage;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoverStepDefs {

    HoverPage hoverPage = new HoverPage();
    Actions actions = new Actions(Driver.getDriver());
    WebElement element;

    @Given("user hover over first image")
    public void user_hover_over_first_image() {
        actions.moveToElement(hoverPage.user1Img).perform();
        element = hoverPage.user1ImgTxt;
    }
    @Then("user verify {string} is displayed")
    public void user_verify_is_displayed(String expectedValue) {
        System.out.println(expectedValue);
        Assert.assertTrue(element.isDisplayed());
    }
    @Then("user hover over second image")
    public void user_hover_over_second_image() {
        actions.moveToElement(hoverPage.user2Img).perform();
        element = hoverPage.user2ImgTxt;
    }
    @Then("user hover over third image")
    public void user_hover_over_third_image() {
        actions.moveToElement(hoverPage.user3Img).perform();
        element = hoverPage.user3ImgTxt;
    }


}
