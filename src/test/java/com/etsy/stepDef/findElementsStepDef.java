package com.etsy.stepDef;

import com.etsy.pages.FindElementsPage;
import com.etsy.utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class findElementsStepDef {
    FindElementsPage findElementsPage = new FindElementsPage();
    @Given("User locate and print all the links on the webPage")
    public void user_locate_and_print_all_the_links_on_the_web_page() {
        for (WebElement each : findElementsPage.links){
            System.out.println(each.getAttribute("href"));
        }

    }
    @Then("User print the number of links we have on the webPage")
    public void user_print_the_number_of_links_we_have_on_the_web_page() {
        System.out.println("findElementsPage.links.size() = " + findElementsPage.links.size());

    }

    @Then("User print all the texts of the links")
    public void userPrintAllTheTextsOfTheLinks() {
        System.out.println(BrowserUtil.getElementsText(findElementsPage.links));
    }
}
