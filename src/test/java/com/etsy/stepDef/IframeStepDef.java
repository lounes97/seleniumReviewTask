package com.etsy.stepDef;

import com.etsy.pages.IframePage;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class IframeStepDef {
    IframePage iframePage = new IframePage();

    @Given("User switch to iFrame and check the text {string} is displayed")
    public void user_switch_to_i_frame_and_check_the_text_is_displayed(String expectedIframeText) {
        Driver.getDriver().switchTo().frame("mce_0_ifr");
        Assert.assertEquals(expectedIframeText, iframePage.iFrameText.getText());

    }
    @Then("User exit from iFrame and check the text {string} is displayed")
    public void user_exit_from_i_frame_and_check_the_text_is_displayed(String expectedOutOfFrame) {
    Driver.getDriver().switchTo().parentFrame();
    Assert.assertEquals(expectedOutOfFrame, iframePage.outOfIframeText.getText());

    }
}
