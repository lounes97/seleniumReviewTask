package com.etsy.stepDef;

import com.etsy.pages.LoginPage;
import com.etsy.utilities.BrowserUtil;
import com.etsy.utilities.ConfigurationReader;
import com.etsy.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class login_StepDef {


    LoginPage loginPage = new LoginPage();

    @Given("user open the website on home page")
    public void user_open_the_website_on_home_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("login"));

        //Thread.sleep(2000);

    }

    @Then("user enter the username {string}")
    public void user_enter_the_username(String userName) throws InterruptedException {
        loginPage.userNameBox.sendKeys(userName);
        //Thread.sleep(2000);


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

    Select select;

    @Then("user see all the three options")
    public void user_see_all_the_three(List<String> expectedOptions) {
        select = new Select(loginPage.productDropDown);
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

    /**
     * task5
     */
    Faker faker = new Faker();

    String fullName = "";
    @Then("user enter appropriate test data")
    public void user_enter_appropriate_test_data() {
        select = new Select(loginPage.productDropDown);
        select.selectByIndex(2);
        loginPage.quantityBox.sendKeys("4");
        fullName = faker.name().fullName();
        System.out.println(fullName);
        loginPage.nameBox.sendKeys(fullName);
        loginPage.masterCard.click();
        loginPage.cardNumber.sendKeys(faker.number().digits(14));
        loginPage.cardExpBox.sendKeys("07/25");
        loginPage.streetBox.sendKeys(faker.address().streetAddress());
        loginPage.cityBox.sendKeys(faker.address().city());
        loginPage.stateBox.sendKeys(faker.address().state());
        loginPage.zipBox.sendKeys(faker.address().zipCode());


    }

    @Then("user clicks process order")
    public void user_clicks_process_order() {
        loginPage.processOrderBox.click();
    }

    @Then("user should see new order in view all orders table")
    public void user_should_see_new_order_in_view_all_orders_table() {
        String orderFullName = loginPage.firstColumnFromTable.getText();

        Assert.assertEquals(fullName, orderFullName);
    }
}

