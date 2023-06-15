package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddElPage {
    public AddElPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
@FindBy(xpath = "//button[.='Add Element']")
    public WebElement addElBtn;

    @FindBy(xpath = "//button[@class='added-manually']")
    public WebElement deleteBtn;
}
