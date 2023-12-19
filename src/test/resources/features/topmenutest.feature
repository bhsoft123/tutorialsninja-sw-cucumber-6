@regression
Feature: Navigate to Top menu pages successfully
  @author_BP @sanity @regression
  Scenario Outline: VerifyUserShouldNavigateToDesktopsPageSuccessfully
    Given User is on Home page
    When Mouse hover on “Desktops” Tab and click
    And call selectMenu method and pass the menu <menu>
    Then Verify the text ‘Desktops’
    Examples:
      | menu                |
      | "Show AllDesktops" |
  @author_BP @smoke @regression
  Scenario Outline: VerifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
    Given User is on Home page
    When Mouse hover on “Laptops & Notebooks” Tab and click
    And call selectMenu method and pass the menu <menu>
    Then Verify the text ‘Laptops & Notebooks’
    Examples:
      | menu                           |
      | "Show AllLaptops & Notebooks"  |
  @author_BP @regression
  Scenario Outline: VerifyUserShouldNavigateToComponentsPageSuccessfully
    Given User is on Home page
    When Mouse hover on “Components” Tab and click
    And call selectMenu method and pass the menu <menu>
    Then Verify the text ‘Components
    Examples:
      | menu                  |
      | "Show AllComponents"  |