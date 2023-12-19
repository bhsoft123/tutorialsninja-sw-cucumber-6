package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    @CacheLookup
    @FindBy(css ="#content h1")
    WebElement productsTextOnProductsPage;

    @CacheLookup
    @FindBy(id ="input-quantity")
    WebElement quantityElement;
    @CacheLookup
    @FindBy(id ="button-cart")
    WebElement addToCartButtonElement;
    @CacheLookup
    @FindBy(xpath = "//div//a[normalize-space()='shopping cart']")
    WebElement shoppingCartDisplayTextElement;
    public void clickOnShoppingCartDisplay() {
        log.info("clickOnShoppingCartDisplay: " + shoppingCartDisplayTextElement.toString());
        clickOnElement(shoppingCartDisplayTextElement);
    }
    public String verifyProductsText(String productText) {
        log.info("verifyProductsText: " + productsTextOnProductsPage.toString());
        return getTextFromElement(productsTextOnProductsPage);
    }
    public void enterQuantity(String quantity) throws InterruptedException {
        Thread.sleep(3000);
        clearTextFromField(quantityElement);
        sendTextToElement(quantityElement, quantity);
    }
    public void clickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(addToCartButtonElement);
    }
}
