package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {

    public DropdownPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@id='dropdown']")
    public WebElement simpleDropdown;
 @FindBy(xpath = "//select[@id='state']")
    public WebElement stateDropdown;
 @FindBy(xpath = "//select[@id='year']")
    public WebElement yearDropdown;
 @FindBy(xpath = "//select[@id='month']")
    public WebElement monthDropdown;
 @FindBy(xpath = "//select[@id='day']")
    public WebElement dayDropdown;

 @FindBy(xpath = "//a[@id='dropdownMenuLink']")
    public WebElement dropdownLink;

 @FindBy(xpath = "//a[.='Facebook']")
    public WebElement facebookLink;


}
