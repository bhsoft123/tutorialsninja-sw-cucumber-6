package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    @CacheLookup
    @FindBy(css ="body > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(1)")
    WebElement productNameTextElement;

    @CacheLookup
    @FindBy(css = "body > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3)")
    WebElement modelNameTextElement;
    @CacheLookup
    @FindBy(css = "body > div:nth-child(4) > div:nth-child(3) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6)")
    WebElement totalAmountTextElement;

    @CacheLookup
    @FindBy(css = ".alert.alert-success.alert-dismissible")
    WebElement textSuccess;
    @CacheLookup
    @FindBy(css = "div.input-group.btn-block>input")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(css =".fa.fa-refresh")
    WebElement updateTab;

    @CacheLookup
    @FindBy(css = "#content > div.row > div > table > tbody > tr:nth-child(4) > td:nth-child(2)")
    WebElement totalAmount;
    public String productNameText(){
        return getTextFromElement(productNameTextElement);
    }
    public String modelNameText(){
        return getTextFromElement(modelNameTextElement);
    }
    public String totalAmountText(){
        return getTextFromElement(totalAmountTextElement);
    }

    public String successMessageMacBook(){
        return getTextFromElement(textSuccess);
    }
    public void changeQuantity(String quantity){
        clearTextFromField(changeQuantity);
        sendTextToElement(changeQuantity, quantity);
    }
    public void clickOnUpdateButtonOnShoppingCartPage(){
        clickOnElement(updateTab);
    }
    public String verifyTotalAmt(){
        return getTextFromElement(totalAmount);
    }
    @CacheLookup
    @FindBy(css ="a[class='btn btn-primary']")
    WebElement checkOutButton;
    @CacheLookup
    @FindBy(xpath ="//h1[text()='Checkout']")
    WebElement textCheckout;
    @CacheLookup
    @FindBy(xpath ="//h2[text()='New Customer']")
    WebElement textNewCustomer;
    @CacheLookup
    @FindBy(css ="input[value='guest']")
    WebElement guestCheckOutRadio;

    @CacheLookup
    @FindBy(css ="#button-account")
    WebElement continueButton;
    @CacheLookup
    @FindBy(css ="#input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(css ="#input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(css ="#input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy(css ="#input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(css ="#input-payment-address-1")
    WebElement address;
    @CacheLookup
    @FindBy(css ="#input-payment-city")
    WebElement city;
    @CacheLookup
    @FindBy(css ="#input-payment-postcode")
    WebElement postcode;
    @CacheLookup
    @FindBy(css ="#input-payment-zone")
    WebElement zone;
    @CacheLookup
    @FindBy(css ="#button-guest")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(css ="textarea[name='comment']")
    WebElement addCommentsAboutOrder;
    @CacheLookup
    @FindBy(css ="input[type='checkbox']")
    WebElement tncCheckbox;
    @CacheLookup
    @FindBy(css ="#button-payment-method")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(css =".alert.alert-danger.alert-dismissible")
    WebElement textWarning;

    public void clickOnCheckOutPage(){
        clickOnElement(checkOutButton);
    }
    public String verifyCheckoutText(){
        return getTextFromElement(textCheckout);
    }
    public String verifyNewCustomerText() throws InterruptedException {
        Thread.sleep(3000);
        return getTextFromElement(textNewCustomer);
    }
    public void clickOnGuestCheckoutRadioButton(){
        clickOnElement(guestCheckOutRadio);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueButton);
    }
    public void fillMandatoryfields(){
        sendTextToElement(firstName, "Ramesh");
        sendTextToElement(lastName, "Patel");
        sendTextToElement(email, "rameshpatel@gmail.com");
        sendTextToElement(telephone, "76895433452");
        sendTextToElement(address, "Kings Street");
        sendTextToElement(city, "London");
        sendTextToElement(postcode, "WC11BC");
        selectByVisibleTextFromDropDown(zone, "Berkshire");
        log.info("Mandatory fields " );
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public void addCommentsAboutYourOrder(){
        sendTextToElement(addCommentsAboutOrder, "Thank You for Your Order");
    }
    public void checkTermsAndConditions(){
        clickOnElement(tncCheckbox);
    }
    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
    }
    public String warningPaymentRequired(){
        return getTextFromElement(textWarning);
    }
}
