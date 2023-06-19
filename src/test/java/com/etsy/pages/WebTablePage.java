package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
    public WebTablePage (){
     PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//td[.='Bob Martin']")
    public WebElement BMName;

    @FindBy(xpath = "//td[.='12/31/2021']")
    public WebElement date;
}
