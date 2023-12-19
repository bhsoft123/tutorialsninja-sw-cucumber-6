@regression
Feature: Laptopsandnotebooks functionality
  @author_BP @smoke @regression
  Scenario: VerifyProductsPriceDisplayHighToLowSuccessfully
  Given User is on Home page
  When  Mouse hover on “Laptops & Notebooks” Tab and click
  And   call selectMenu method and pass the menu "Show AllLaptops & Notebooks"
  And   Select Sort By position "Price (High > Low)"
  Then  Verify the Product price will arrange in High to Low order
  @author_BP @regression
  Scenario: VerifyThatUserPlaceOrderSuccessfully
  Given User is on Home page
  When  Mouse hover on “Laptops & Notebooks” Tab and click
  And   call selectMenu method and pass the menu "Show AllLaptops & Notebooks"
  And   Select Sort By position "Price (High > Low)"
  And   Select Product “MacBook”
  Then  Verify the text “MacBook”
  And   Click on ‘Add To Cart’ button
  Then  Verify the message “Success: You have added MacBook to your shopping cart!”
  And   Click on link “shopping cart” display into success message
  And   Change Quantity "2"
  And   Click on “Update” Tab
  Then  Verify the message “Success: You have modified your shopping cart!”
  Then  Verify the Total amount £737.45
  And   Click on “Checkout” button
  And   Verify the text “Checkout”
  And   Verify the Text “New Customer”
  And   Click on “Guest Checkout” radio button
  And   Click on “Continue” tab
  And   Fill the mandatory fields
  And   Click on “Continue” Button
  And   Add Comments About your order into text area
  And   Check the Terms & Conditions check box
  And   Click on “Continue” button
  Then  Verify the message “Warning: Payment method required!”
