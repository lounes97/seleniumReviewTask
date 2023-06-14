package com.etsy.stepDef;

import com.etsy.pages.HockeyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class HockeyStepDef {
    HockeyPage hockeyPage=new HockeyPage();
    @When("user click on Hockey radio button")
    public void user_click_on_hockey_radio_button() {
        hockeyPage.hockeyBtn.click();

    }
    @Then("Verify Hockey button is selected")
    public void verify_hockey_button_is_selected() {
        //Assert.assertTrue(hockeyPage.hockeyBtn.isSelected());

         Boolean result=isSelected(hockeyPage.hockeyBtn);

         Assert.assertTrue(result);



    }

    private boolean isSelected(WebElement element) {
        return element.isSelected();
    }
}
