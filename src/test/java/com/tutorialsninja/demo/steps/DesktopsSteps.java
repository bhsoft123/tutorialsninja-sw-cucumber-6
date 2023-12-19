package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.ProductsPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsSteps {
    @And("Select Sort By position {string}")
    public void selectSortByPosition(String sortBy) {
        new HomePage().selectNameZtoA(sortBy);
    }

    @Then("Verify the Product will arrange in Descending order.")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        Assert.assertEquals(new DesktopsPage().afterSortingOrder(),new DesktopsPage().defaultOrder(), "Not sorted Alphabetically");
    }

    @When("Mouse hover on Currency Dropdown and click")
    public void mouseHoverOnCurrencyDropdownAndClick() {
        new DesktopsPage().mouseHoverOnCurrencyDropdown();
    }

    @And("Mouse hover on £Pound Sterling and click")
    public void mouseHoverOn£PoundSterlingAndClick() {
        new DesktopsPage().changeCurrencyToPoundSterling();
    }

    @And("Select product {string}")
    public void selectProduct(String product) {
        new DesktopsPage().selectProduct(product);
    }

    @Then("Verify the Text {string}")
    public void verifyTheText(String productText) {
       Assert.assertEquals(new ProductsPage().verifyProductsText(productText), "x", "Error");
    }
    @And("Enter Qty {string} using select class")
    public void enterQtyUsingSelectClass(String quantity) throws InterruptedException {
        new ProductsPage().enterQuantity(quantity);
    }
    @And("Click on “Add to Cart” button")
    public void clickOnAddToCartButton() throws InterruptedException {
        new ProductsPage().clickOnAddToCartButton();
    }

    @And("Click on link “shopping cart” display into success message")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductsPage().clickOnShoppingCartDisplay();
    }

    @And("Verify the Product name {string}")
    public void verifyTheProductName(String productNameOnShoppingCartPage) {
        Assert.assertEquals(new ShoppingCartPage().productNameText(),productNameOnShoppingCartPage,"Error");
    }

    @Then("Verify the Model {string}")
    public void verifyTheModel(String model) {
        Assert.assertEquals(new ShoppingCartPage().modelNameText(), model, "Error");
    }

    @Then("Verify the Total {string}")
    public void verifyTheTotal(String totalAmount) {
        Assert.assertEquals(new ShoppingCartPage().totalAmountText(),totalAmount, "Error");
    }




    @Then("Verify the Message {string}")
    public void verifyTheMessageSuccessYouHaveAddedToYourShoppingCart(String arg0) {
    }

}

