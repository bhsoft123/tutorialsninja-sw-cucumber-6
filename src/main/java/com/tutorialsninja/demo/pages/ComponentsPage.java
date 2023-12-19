package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class.getName());

    @CacheLookup
    @FindBy(css ="div[id='content'] h2")
    WebElement componentsTexElement;

    public String getTextComponents() {
        log.info("getTextComponents: " + componentsTexElement.toString());
        return getTextFromElement(componentsTexElement);
    }
}