package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollPractice2Page {
    public ScrollPractice2Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath ="//a[.='Home']")
    public WebElement homeLink;
    @FindBy(xpath ="//a[.='CYDEO']")
    public WebElement cydeoLink;


}
