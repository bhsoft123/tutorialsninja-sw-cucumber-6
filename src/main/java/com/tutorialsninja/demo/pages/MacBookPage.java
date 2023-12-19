package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MacBookPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='MacBook']")
    WebElement macBookTextElement;
    @CacheLookup
    @FindBy(css = "#button-cart")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible")
    WebElement textSuccess;
    public String verifyMacBookText(){
        return getTextFromElement(macBookTextElement);
    }
    public void clickOnAddToCartLaptopsAndMacbooks(){
        clickOnElement(addToCartButton);
    }
    public String successMessageMacBook(){
        return getTextFromElement(textSuccess);
    }
}
