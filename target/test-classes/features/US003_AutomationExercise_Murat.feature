Feature: Verify Scroll Up without 'Arrow' button and Scroll Down functionality

  @case26
  Scenario: Case 26 Kullanici automationExercise websitesine gider ve scrool down fonksiyonu test eder

    Given User goes to "autoUrl" website
    Then Verify that home page is visible successfully
    And Scroll down page to bottom
    And Verify SUBSCRIPTION is visible
    And Scroll up page to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
    And Closes the page

  @case23
  Scenario: Case 23 Verify address details in checkout page

    Given User goes to "autoUrl" website
    Then Verify that home page is visible successfully
    Then Click Signup Login button
    And Fill all details in Signup and create account
    And Verify ACCOUNT CREATED! and click Continue button
    And Verify Logged in as username at top
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify that the delivery address is same address filled at the time registration of account
    And Verify that the billing address is same address filled at the time registration of account
    And Click Delete Account button
    And Verify ACCOUNT DELETED! and click Continue button
    And Closes the page

  @wip
  Scenario: Case 19 View & Cart Brand Products

    Given User goes to "autoUrl" website
    And Click on Products button
    And Verify that Brands are visible on left side bar
    And Click on any brand name
    And Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    And Verify that user is navigated to that brand page and can see products
    And Closes the page

