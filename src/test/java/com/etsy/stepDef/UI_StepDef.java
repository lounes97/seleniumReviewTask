package com.etsy.stepDef;

import com.etsy.pages.EtsyPage;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.yaml.snakeyaml.tokens.Token.ID.Key;

public class UI_StepDef {

    EtsyPage etsyPage = new EtsyPage();

    @Given("user go to Etsy home page")
    public void user_go_to_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com/");
    }

    @Then("title and url should be the same as expected")
    public void title_and_url_should_be_the_same_as_expected() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("user types {string} in search box")
    public void user_types_in_search_box(String searchTerm) {
        etsyPage.searchBox.sendKeys(searchTerm);
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searButton.click();
    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
