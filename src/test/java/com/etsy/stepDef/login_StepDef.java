package com.etsy.stepDef;

import com.etsy.pages.LoginPage;
import com.etsy.utilities.BrowserUtil;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class login_StepDef {


    LoginPage loginPage = new LoginPage();

    @Given("user open the website on home page")
    public void user_open_the_website_on_home_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("login"));

        Thread.sleep(2000);

    }

    @Then("user enter the username {string}")
    public void user_enter_the_username(String userName) throws InterruptedException {
        loginPage.userNameBox.sendKeys(userName);
        Thread.sleep(2000);


    }

    @Then("user enter the password {string}")
    public void user_enter_the_password(String password) throws InterruptedException {
        loginPage.passwordBox.sendKeys(password);
        Thread.sleep(2000);


    }

    @Then("user clicks login button")
    public void user_clicks_login_button() throws InterruptedException {
        loginPage.loginBtn.click();
        Thread.sleep(2000);

    }

    @Then("user verify if the URL ends with {string}")
    public void user_verify_if_the_url_ends_with(String keyWord) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(keyWord));

    }

    //Scenario3
    @Given("user click on order option")
    public void user_click_on_order_option() throws InterruptedException {
        loginPage.orderBtn.click();
        Thread.sleep(2000);
    }

    @Then("user see all the three options")
    public void user_see_all_the_three(List<String> expectedOptions) {
        Select select = new Select(loginPage.productDropDown);
        List<WebElement> options = select.getOptions();
        List<String> elementsText = BrowserUtil.getElementsText(options);
        Assert.assertEquals(expectedOptions, elementsText);
    }


    @Then("user clicks on ORDER")
    public void userClicksOnORDER() {

        loginPage.orderBtn.click();

    }

    @And("user can see the radio button to choose the card type")
    public void userCanSeeTheRadioButtonToChooseTheCardType(List<String> expectedCardsType) {
        List<String> actualCardsType = new ArrayList<>();
        actualCardsType.add(loginPage.visaCard.getAttribute("value"));
        actualCardsType.add(loginPage.masterCard.getAttribute("value"));
        actualCardsType.add(loginPage.americanExpressCard.getAttribute("value"));


        Assert.assertEquals(expectedCardsType, actualCardsType);

    }

}