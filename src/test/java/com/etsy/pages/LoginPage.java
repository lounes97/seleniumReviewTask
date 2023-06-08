package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "username")
    public WebElement userNameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[.='Login']")
    public WebElement loginBtn;

    @FindBy (xpath = "//button[.='Order']")
    public WebElement orderBtn;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaCard;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCard;

    @FindBy(xpath ="//input[@value='American Express']" )
    public WebElement americanExpressCard;


    @FindBy(xpath = "//input[@placeholder='Full name of the customer']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@placeholder='Enter amount desired']")
    public WebElement quantityBox;

    @FindBy(css = "input[name='street']")
    public WebElement streetBox;

    @FindBy(css = "input[name='cardNo']")
    public WebElement cardNumber;
    @FindBy(css = "input[name='city']")
    public WebElement cityBox;
    @FindBy(css = "input[name='cardExp']")
    public WebElement cardExpBox;
    @FindBy(css = "input[name='zip']")
    public WebElement zipBox;

    @FindBy(css = "button[type='button']")
    public WebElement calculateButton;
    @FindBy(css = "button[type='submit']")
    public WebElement submitButton;


}
