package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopsPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {



    //1.2 call selectMenu method and pass the menu = “Show All Desktops”
    //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    //3.2 call selectMenu method and pass the menu = “Show All Components”
    @And("call selectMenu method and pass the menu {string}")
    public void callSelectMenuMethodAndPassTheMenu(String menu) {
        new HomePage().selectMenuMethod(menu);
    }

    //1.1 Mouse hover on “Desktops” Tab and click
    @When("Mouse hover on “Desktops” Tab and click")
    public void mouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsTabAndClick();
    }
    //1.3 Verify the text ‘Desktops’
    @Then("Verify the text ‘Desktops’")
    public void verifyTheTextDesktops() {
        Assert.assertEquals(new DesktopsPage().getTextDesktops(),"Desktops","Error");
    }
    //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    @When("Mouse hover on “Laptops & Notebooks” Tab and click")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksAndClick();
    }
    //2.3 Verify the text ‘Laptops & Notebooks’
    @Then("Verify the text ‘Laptops & Notebooks’")
    public void verifyTheTextLaptopsNotebooks() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getTextNotebooksAndLaptops(),"Laptops & Notebooks","Error");
    }
    //3.1 Mouse hover on “Components” Tab and click
    @When("Mouse hover on “Components” Tab and click")
    public void mouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentsAndClick();
    }
    //3.3 Verify the text ‘Components’
    @Then("Verify the text ‘Components")
    public void verifyTheTextComponents() {
        Assert.assertEquals(new ComponentsPage().getTextComponents(), "Components", "Error");
    }

    @Given("User is on Home page")
    public void userIsOnHomePage() {
    }
}
