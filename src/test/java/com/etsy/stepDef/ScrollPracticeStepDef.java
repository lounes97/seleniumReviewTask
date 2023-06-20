package com.etsy.stepDef;

import com.etsy.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;

public class ScrollPracticeStepDef {
    @Then("User scroll with javaScript {int} pixels down {int} times")
    public void user_scroll_with_java_script_pixels_down_times(Integer pixels, Integer scrollTimes) throws InterruptedException {
        for (int i = 0; i < scrollTimes; i++) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,+" + pixels + ")");
            Thread.sleep(500);
        }
        Thread.sleep(2000);
    }

    @Then("User scroll with javaScript {int} pixels up {int} times")
    public void user_scroll_with_java_script_pixels_up_times(Integer pixels, Integer scrollTimes) throws InterruptedException {
        for (int i = 0; i < scrollTimes; i++) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollBy(0,-" + pixels + ")");
            Thread.sleep(500);
        }
        Thread.sleep(3000);
    }
}
