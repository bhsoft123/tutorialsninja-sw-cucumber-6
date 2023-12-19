@regression
Feature:Accounts functionality
  @author_BP @sanity @regression
  Scenario: VerifyUserShouldNavigateToRegisterPageSuccessfully
    When  Click on My Account Link
    And   Call the method selectMyAccountOptions method and pass the parameter "Register"
    Then  Verify the text "Register Account"
  @author_BP @smoke @regression
  Scenario: VerifyUserShouldNavigateToLoginPageSuccessfully
    When  Click on My Account Link
    And   Call the method selectMyAccountOptions method and pass the parameter "Login"
    Then  Verify the text "Returning Customer"
  @author_BP @regression
  Scenario: VerifyThatUserRegisterAccountSuccessfully
    When Click on My Account Link
    And  Call the method selectMyAccountOptions method and pass the parameter "Register"
    And  I enter First Name and I enter Last Name and I enter Email and I enter Telephone and I enter Password and I enter Password Confirm and I select Subscribe Yes radio button and I click on Privacy Policy check box and I click on Continue button
    Then I can see the message 'Your Account Has Been Created!'
    And  Click on Continue button
    When Click on My Account Link
    And  Call the method selectMyAccountOptions method and pass the parameter "Logout"
    And  Verify the text “Account Logout”
    Then Click on Continue button
  @author_BP @regression
  Scenario: VerifyThatUserShouldLoginAndLogoutSuccessfully
    When Click on My Account Link
    And  Call the method selectMyAccountOptions method and pass the parameter "Login"
    And  I enter Email address and Last Name and Password
    Then Click on Login button
    And  Verify text "My Account"
    And  Click on My Account Link
    And  Call the method selectMyAccountOptions method and pass the parameter "Logout"
    And  Verify the text “Account Logout”
    Then Click on Continue button