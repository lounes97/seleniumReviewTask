package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CrmPage {
    public CrmPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath  ="//input[@name='USER_LOGIN']")
                public WebElement userBox;
    @FindBy(xpath ="//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement alertMsg;

    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMsg;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordBtn;

}
