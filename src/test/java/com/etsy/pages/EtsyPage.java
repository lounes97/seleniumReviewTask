package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {

    public EtsyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searButton;

}
