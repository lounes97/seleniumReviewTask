package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {
    public LibraryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInBtn;


@FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement alertMsg;
}
