package com.etsy.pages;

import com.etsy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverPage {

    public HoverPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h5[.='name: user1']/../..")
    public WebElement user1Img;
    @FindBy(xpath = "//h5[.='name: user1']")
    public WebElement user1ImgTxt;

@FindBy(xpath = "//h5[.='name: user2']/../..")
    public WebElement user2Img;
@FindBy(xpath = "//h5[.='name: user2']")
    public WebElement user2ImgTxt;

@FindBy(xpath = "//h5[.='name: user3']/../..")
    public WebElement user3Img;
@FindBy(xpath = "//h5[.='name: user3']")
    public WebElement user3ImgTxt;

}
