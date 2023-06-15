package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JSAlertPage {
public JSAlertPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
@FindBy(xpath = "//button[.='Click for JS Alert']")
    public WebElement JSAlertBtn;
@FindBy(xpath = "//p[@id='result']")
    public WebElement SuccessfulMsg;
@FindBy(xpath = "//button[.='Click for JS Confirm']")
    public WebElement JSConfirmBtn;
@FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement JSPromptBtn;

}
