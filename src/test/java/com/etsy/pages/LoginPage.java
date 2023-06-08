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






}
