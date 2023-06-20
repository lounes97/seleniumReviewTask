package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
    public DragAndDropPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@id='droptarget']")
    public WebElement circleLink;

    @FindBy(id = "draggable")
    public WebElement smallCircle;

}
