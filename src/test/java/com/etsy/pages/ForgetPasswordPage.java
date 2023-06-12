package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {

    public ForgetPasswordPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = "a[href='/']")
    public WebElement homeLink;

    @FindBy(css = "h2")
    public WebElement forgetHeader;

    @FindBy(css = "label[for='email']")
    public WebElement emailText;

    @FindBy(css = "input[type='text']")
    public WebElement emailBox;

    @FindBy(css = "button[id='form_submit']")
    public WebElement RetPassButton;

    @FindBy(css = "div[style]")
    public WebElement PoweredByText;

}
