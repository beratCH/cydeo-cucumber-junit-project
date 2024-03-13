package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_OrderPage extends WT_BasePAge{

    public WT_OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name="product")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;
    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement mastercardRadioButton;
    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement aExpressRadioButton;

    @FindBy(name="card")
    public List<WebElement> cardTypes;

    @FindBy(xpath = "//select[@name='product']")
    public WebElement productSelectDropdown;

    @FindBy(xpath = "//select[@name='product']/option[1]")
    public WebElement moneyCogOption;

    @FindBy(xpath = "//select[@name='product']/option[2]")
    public WebElement familybeaOption;

    @FindBy(xpath = "//select[@name='product']/option[3]")
    public WebElement screenableOption;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityBox;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerNameBox;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetBox;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityBox;


    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateBox;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement processOrderButton;

    @FindBy(xpath = "//input[@name='cardNo']")
    public WebElement creditCardNumberBox;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement cardExBox;


}
