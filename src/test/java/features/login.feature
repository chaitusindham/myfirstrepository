Feature:Login to nop commerce application
  In order to login to application
  As a valid user
  I should provide valid email and password

  Scenario: Verify valid login credentials
    Given I navigate to url"https://demo.nopcommerce.com/"
    Then I should be navigated to home page
    When I click on the login from the navbar
    Then I should be navigate dto loginpage
    When I enter email as "ramasita007@gmail.com"
    And I enter Password as "ramasita"
    And I click on login button
    Then I should be login successfully