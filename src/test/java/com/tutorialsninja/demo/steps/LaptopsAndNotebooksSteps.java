package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.MacBookPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {
    @Then("Verify the Product price will arrange in High to Low order")
    public void verifyTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().verifyPriceArrangedHighToLow();
    }

    @And("Select Product “MacBook”")
    public void selectProductMacBook() {
        new LaptopsAndNotebooksPage().selectProductMacBook();
    }

    @Then("Verify the text “MacBook”")
    public void verifyTheTextMacBook() {
        Assert.assertEquals(new MacBookPage().verifyMacBookText(), "MacBook", "Error");
    }

    @And("Click on ‘Add To Cart’ button")
    public void clickOnAddToCartButton() {
        new MacBookPage().clickOnAddToCartLaptopsAndMacbooks();
    }

    @Then("Verify the message “Success: You have added MacBook to your shopping cart!”")
    public void verifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().successMessageMacBook(), "Success: You have added MacBook to your shopping cart!\n" +
                "×", "Error");
    }

    @And("Change Quantity {string}")
    public void changeQuantity(String quantity) {
        new ShoppingCartPage().changeQuantity(quantity);
    }

    @And("Click on “Update” Tab")
    public void clickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdateButtonOnShoppingCartPage();
    }

    @Then("Verify the message “Success: You have modified your shopping cart!”")
    public void verifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        Assert.assertEquals(new ShoppingCartPage().successMessageMacBook(), "Success: You have modified your shopping cart!\n" +
                "×", "Error");
    }


    @And("Click on “Checkout” button")
    public void clickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckOutPage();
    }

    @And("Verify the text “Checkout”")
    public void verifyTheTextCheckout() {
        Assert.assertEquals(new ShoppingCartPage().verifyCheckoutText(), "Checkout", "Error");
    }

    @And("Verify the Text “New Customer”")
    public void verifyTheTextNewCustomer() throws InterruptedException {
        Assert.assertEquals(new ShoppingCartPage().verifyNewCustomerText(), "New Customer", "Error");
    }

    @And("Click on “Guest Checkout” radio button")
    public void clickOnGuestCheckoutRadioButton() {
        new ShoppingCartPage().clickOnGuestCheckoutRadioButton();
    }

    @And("Click on “Continue” tab")
    public void clickOnContinueTab() {
        new ShoppingCartPage().clickOnContinueTab();
    }

    @And("Fill the mandatory fields")
    public void fillTheMandatoryFields() {
        new ShoppingCartPage().fillMandatoryfields();
    }

    @And("Click on “Continue” Button")
    public void clickOnContinueButton1() {
        new ShoppingCartPage().clickOnContinueButton1();
    }

    @And("Add Comments About your order into text area")
    public void addCommentsAboutYourOrderIntoTextArea() {
        new ShoppingCartPage().addCommentsAboutYourOrder();
    }

    @And("Check the Terms & Conditions check box")
    public void checkTheTermsConditionsCheckBox() {
        new ShoppingCartPage().checkTermsAndConditions();
    }

    @And("Click on “Continue” button")
    public void clickOnContinueButton() {
        new ShoppingCartPage().clickOnContinueButton2();
    }

    @Then("Verify the message “Warning: Payment method required!”")
    public void verifyTheMessageWarningPaymentMethodRequired() {
        Assert.assertEquals(new ShoppingCartPage().warningPaymentRequired(), "Warning: Payment method required!\n" +
                "×", "Error");
    }

    @Then("Verify the Total amount {string}")
    public void verifyTheTotalAmount(String total) {
        }


    @Then("Verify the Total amount £{double}")
    public void verifyTheTotalAmount£(double total) {
        new DesktopsPage().mouseHoverOnCurrencyDropdown();
        new DesktopsPage().changeCurrencyToPoundSterling();
        Assert.assertEquals(new ShoppingCartPage().verifyTotalAmt(), "£"+total, "Error");
    }
}