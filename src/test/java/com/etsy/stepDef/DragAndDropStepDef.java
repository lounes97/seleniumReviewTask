package com.etsy.stepDef;

import com.etsy.pages.DragAndDropPage;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStepDef {
    DragAndDropPage dragAndDropPage = new DragAndDropPage();
    Actions actions = new Actions(Driver.getDriver());
    @Then("user verify that text in big circle changed to {string}")
    public void user_verify_that_text_in_big_circle_changed_to(String expectedText) {
        String actualText = dragAndDropPage.circleLink.getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @When("user drag and drop small circle into big one expected text should be {string}")
    public void userDragAndDropSmallCircleIntoBigOneExpectedTextShouldBe(String expectedText) throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        actions.dragAndDrop(dragAndDropPage.smallCircle, dragAndDropPage.circleLink).perform();
        String actualText = dragAndDropPage.circleLink.getText();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(2000);
    }

    @Then("user click and hold the circle and the expected text should be {string}")
    public void userClickAndHoldTheCircleAndTheExpectedTextShouldBe(String expectedText) throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        actions.clickAndHold(dragAndDropPage.smallCircle).moveToElement(dragAndDropPage.smallCircle, 0, 200).perform();
        String actualText = dragAndDropPage.circleLink.getText();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(2000);
    }

    @And("user move and drop outside of the circle and the expected text should be {string}")
    public void userMoveAndDropOutsideOfTheCircleAndTheExpectedTextShouldBe(String expectedText) throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        actions.dragAndDropBy(dragAndDropPage.smallCircle,0,200).perform();
        String actualText = dragAndDropPage.circleLink.getText();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(2000);
    }

    @Then("user drag the small circle on top of the big circle, hold it, and verify that text changed to {string}")
    public void userDragTheSmallCircleOnTopOfTheBigCircleHoldItAndVerifyThatTextChangedTo(String expectedText) throws InterruptedException {
        Driver.getDriver().navigate().refresh();
        actions.clickAndHold(dragAndDropPage.smallCircle).moveToElement(dragAndDropPage.circleLink).perform();
        String actualText = dragAndDropPage.circleLink.getText();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(2000);
    }
}
