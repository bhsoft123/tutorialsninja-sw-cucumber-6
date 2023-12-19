package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(css ="div[id='content'] h2")
    WebElement desktopsTextElement;
    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> productsList;

    public String getTextDesktops(){
        log.info("getTextFromElement : " + desktopsTextElement.toString());
        return getTextFromElement(desktopsTextElement);
    }
    public List afterSortingOrder(){
        //after sorting name z to a, store in an array list
        List<WebElement> afterSortList = productsList;
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> afterSortProducts = new ArrayList<>();
        for(WebElement e : afterSortList){
            afterSortProducts.add(e.getText());
            temp.add(e.getText());
        }
        System.out.println("Printing sorted order :" +afterSortProducts);
        return afterSortProducts;
    }
    public List defaultOrder(){
        List<WebElement> beforeSortList = productsList;
       // ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> beforeSortProducts = new ArrayList<>();
        for(WebElement e : beforeSortList){
            beforeSortProducts.add(e.getText());
           // temp.add(e.getText());
        }
        //Collections.reverse(beforeSortProducts);
        System.out.println("printing default order: " +beforeSortProducts);
        return beforeSortProducts;
    }
    @CacheLookup
    @FindBy (xpath = "//span[normalize-space()='Currency']")
    WebElement currencyElement;
    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement currencyElement1;

    public void mouseHoverOnCurrencyDropdown(){ mouseHoverToElementAndClick(currencyElement);}
    public void changeCurrencyToPoundSterling(){clickOnElement(currencyElement1);}
    public void selectProduct(String product){
        List<WebElement> products = productsList;
        for(WebElement e : products){
            if(e.getText().equalsIgnoreCase(product)){
                System.out.println("Product name:" +e.getText());
                e.click();
            }
        }


    }


}
