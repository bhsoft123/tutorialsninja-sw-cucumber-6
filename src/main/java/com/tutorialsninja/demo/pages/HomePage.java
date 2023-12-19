package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(css ="#menu .see-all")
    WebElement selectMenuElement;
    @CacheLookup
    @FindBy(css =".dropdown-toggle[href='https://tutorialsninja.com/demo/index.php?route=product/category&path=20']")
    WebElement desktopsElement;
    @CacheLookup
    @FindBy(css =".dropdown-toggle[href='https://tutorialsninja.com/demo/index.php?route=product/category&path=18']")
    WebElement laptopsAndNotebooksTabElement;
    @CacheLookup
    @FindBy(css =".dropdown-toggle[href='https://tutorialsninja.com/demo/index.php?route=product/category&path=25']")
    WebElement componentsTabElement;


    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public void selectMenuMethod(String menu){
        log.info("selectMenuOptions: " + selectMenuElement.toString());
         List<WebElement> topMenuNames = driver.findElements(By.cssSelector("#menu .see-all"));
            for(WebElement names : topMenuNames){
                if(names.getText().equalsIgnoreCase(menu)){
                    names.click();
                    break;
                }
            }
        }

    public void mouseHoverOnDesktopsTabAndClick(){
        mouseHoverToElementAndClick(desktopsElement);
        log.info("mouseHoverToElementAndClick: " + desktopsElement.toString());
    }
    public void mouseHoverOnLaptopsAndNotebooksAndClick(){
        log.info("mouseHoverToElementAndClick: " + desktopsElement.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooksTabElement);
    }
    public void mouseHoverOnComponentsAndClick(){
        log.info("mouseHoverToElementAndClick: " + desktopsElement.toString());
        mouseHoverToElementAndClick(componentsTabElement);
    }
    @CacheLookup
    @FindBy(id ="input-sort")
    WebElement selectSortByDropDown;
    @CacheLookup
    @FindBy(css = "a[title='My Account'] span[class='hidden-xs hidden-sm hidden-md']")
    WebElement myAccountLink;

    public void selectNameZtoA(String nameZToA){
        selectByVisibleTextFromDropDown(selectSortByDropDown, nameZToA);
    }
    public void clickOnMyAccountLink(){
            clickOnElement(myAccountLink);

    }


}
