package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.MyAccountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyAccountsSteps {
    @When("Click on My Account Link")
    public void clickOnMyAccountLink() {
        new HomePage().clickOnMyAccountLink();
    }

    @And("Call the method selectMyAccountOptions method and pass the parameter {string}")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String options) throws InterruptedException {
        new MyAccountsPage().selectMyAccountOption(options);
    }

    @Then("Verify the text {string}")
    public void verifyTheText(String registerText) {
        Assert.assertEquals(new MyAccountsPage().getTextFromRegister(),registerText, "Error");
    }

    @Then("Verify the text “Returning Customer”")
    public void verifyTheTextReturningCustomer() {
        Assert.assertEquals(new MyAccountsPage().getTextFromReturningCustomer(), "Returning Customer", "Error");
    }
    @And("I enter First Name and I enter Last Name and I enter Email and I enter Telephone and I enter Password and I enter Password Confirm and I select Subscribe Yes radio button and I click on Privacy Policy check box and I click on Continue button")
    public void iEnterFirstNameAndIEnterLastNameAndIEnterEmailAndIEnterTelephoneAndIEnterPasswordAndIEnterPasswordConfirmAndISelectSubscribeYesRadioButtonAndIClickOnPrivacyPolicyCheckBoxAndIClickOnContinueButton() {
        new MyAccountsPage().fillMandatoryDetails();
    }

    @Then("I can see the message {string}")
    public void iCanSeeTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountsPage().getTextAccountCreated(), "Your Account Has Been Created!", "Error");;
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new MyAccountsPage().clickOnContinueButton();
    }

    @And("Verify the text “Account Logout”")
    public void verifyTheTextAccountLogout() {
        Assert.assertEquals(new MyAccountsPage().getTextAccountLogOut(), "Account Logout","Error");
    }

    @And("I enter Email address and Last Name and Password")
    public void iEnterEmailAddressAndLastNameAndPassword() {
        new MyAccountsPage().fillInEmailPassword();
    }

    @Then("Click on Login button")
    public void clickOnLoginButton() {
        new MyAccountsPage().clickLoginButton();
    }

    @And("Verify text {string}")
    public void verifyText(String myAccount) {
        Assert.assertEquals(new MyAccountsPage().getTextMyAccount(), myAccount,"Error" );
    }


}


