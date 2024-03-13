package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    //create the constructor and initialize the driver with object
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@id='W0wltc']")
    public WebElement cookiesReject;

    @FindBy(xpath = "//a[@href='https://www.etsy.com/ch/']")
    public WebElement etsyEntranceThroughGoogle;
}
