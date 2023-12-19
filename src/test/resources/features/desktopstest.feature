@regression
Feature: Desktops Page functionality test
  @author_BP @smoke @regression
Scenario:  VerifyProductArrangeInAlphaBeticalOrder
    When  Mouse hover on “Desktops” Tab and click
    And   call selectMenu method and pass the menu "Show AllDesktops"
    And   Select Sort By position "Name (Z - A)"
    Then  Verify the Product will arrange in Descending order.
  @author_BP @regression
  Scenario Outline: VerifyProductAddedToShoppingCartSuccessFully
    When  Mouse hover on Currency Dropdown and click
    And   Mouse hover on £Pound Sterling and click
    And   Mouse hover on “Desktops” Tab and click
    And   call selectMenu method and pass the menu "Show AllDesktops"
    And   Select Sort By position "Name (A - Z)"
    And   Select product "<product>"
    Then  Verify the Text "<product>"
    And   Enter Qty "1" using select class
    And   Click on “Add to Cart” button
    Then  Verify the Message 'Success: You have added "<product>" to your shopping cart!'
    And   Click on link “shopping cart” display into success message
    Then  Verify the Text "Shopping Cart"
    And   Verify the Product name "<product>"
    Then  Verify the Model "<model>"
    Then  Verify the Total "<price>"
  Examples:
      | product      | model      | price     |
      | HTC Touch HD | Product 1  | £ 74.73   |
      | iPhone       | product 11 | £ 75.46   |
      | iPod Classic | product 20 | £ 74.73   |
      | MacBook      | Product 16 | £ 368.73  |
      | MacBook Air  | Product 17 | £ 736.23  |
      | Sony VAIO    | Product 19 | £ 736.23  |