package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(css = "a[href='https://tutorialsninja.com/demo/index.php?route=account/register']")
    WebElement menuOptionsRegister;
    @CacheLookup
    @FindBy(css = "a[href='https://tutorialsninja.com/demo/index.php?route=account/login']")
    WebElement menuOptionsLogin;

    @CacheLookup
    @FindBy(xpath ="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
    WebElement selectRegister;

    @CacheLookup
    @FindBy(xpath ="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
    WebElement selectLogin;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    WebElement textRegister;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomer;

    @CacheLookup
    @FindBy(css = "#input-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(css = "#input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(css = "#input-email")
    WebElement email;
    @CacheLookup
    @FindBy(css = "#input-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(css = "#input-password")
    WebElement password;
    @CacheLookup
    @FindBy(css = "#input-confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(css = "input[type='radio'][name='newsletter'][value='1']")
    WebElement radioYes;
    @CacheLookup
    @FindBy(css = "input[type='checkbox']")
    WebElement checkPrivacy;
    @CacheLookup
    @FindBy(css = "input[value='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement textAccountCreated;
    @CacheLookup
    @FindBy(css = "a[class='btn btn-primary']")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Account Logout']")
    WebElement textAccountLogOut;
    @CacheLookup
    @FindBy(css = ".btn.btn-primary")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(css = "input[value='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement textMyAccount;
    public void selectMyAccountOption(String menu1) throws InterruptedException {

        if (menu1 == "Register") {
            //selectByVisibleTextFromDropDown(menuOptionsRegister, menu1);
            Thread.sleep(2000);
            System.out.println("Register");
            clickOnElement(selectRegister);

        } else if (menu1 == "Login") {
            //selectByVisibleTextFromDropDown(menuOptionsLogin, menu1);
            clickOnElement(selectLogin);
        }

    }
    public String getTextFromRegister() {
        log.info("Get text from element " + textRegister.toString());
        return getTextFromElement(textRegister);
    }
    public String getTextFromReturningCustomer(){
        return getTextFromElement(returningCustomer);
    }

    public void fillMandatoryDetails() {
        sendTextToElement(firstName, "Kavita");
        sendTextToElement(lastName, "Patel");
        sendTextToElement(email, "kavitaxyz123@gmail.com");
        sendTextToElement(telephone, "7856489795");
        sendTextToElement(password, "1343323");
        sendTextToElement(confirmPassword, "1343323");
        clickOnElement(radioYes);
        clickOnElement(checkPrivacy);
        clickOnElement(continueButton);
        log.info("All the information ");
    }

    public void fillInEmailPassword() {
        sendTextToElement(email, "kavitaxyz123@gmail.com");
        sendTextToElement(password, "1343323");
        clickOnElement(loginButton);
        log.info("Email password information ");
    }

    public String getTextAccountCreated() {
        log.info("Get text account created : " + textAccountCreated);
        return getTextFromElement(textAccountCreated);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton1);
        log.info("Click on continue button " + continueButton1);
    }

    public String getTextAccountLogOut() {
        log.info("Get text Account log out " + textAccountLogOut);
        return getTextFromElement(textAccountLogOut);
    }

    public void clickLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
        log.info("Click on continue button " + continueButton2);
    }

    public String getTextMyAccount() {
        log.info("Get text my account " + textMyAccount);
        return getTextFromElement(textMyAccount);
    }
}
