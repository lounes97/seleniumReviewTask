package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {
    public CheckboxPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy(xpath = "//input[@name='checkbox1']")
    public WebElement checkBox1;
    @FindBy(xpath = "//input[@name='checkbox2']")
    public WebElement checkBox2;



}
