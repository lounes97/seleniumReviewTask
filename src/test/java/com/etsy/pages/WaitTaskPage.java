package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitTaskPage {

    public WaitTaskPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[id='loading']")
    public WebElement loadingBar;

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement removeButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;
    @FindBy(xpath = "//p[@id='message']")
    public WebElement msg;

}
