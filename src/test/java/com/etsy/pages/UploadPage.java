package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {

    public UploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "file-upload")
    public WebElement id;
    @FindBy(id = "file-submit")
    public WebElement submitBtn;
@FindBy(xpath = "//h3")
    public WebElement fileUploadedText;
}
