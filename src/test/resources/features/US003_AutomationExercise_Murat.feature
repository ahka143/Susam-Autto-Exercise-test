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

  @case19
  Scenario: Case 19 View & Cart Brand Products

    Given User goes to "autoUrl" website
    And Click on Products button
    And Verify that Brands are visible on left side bar
    And Click on any brand name
    And Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    And Verify that user is navigated to that brand page and can see products
    And Closes the page

  @case15
  Scenario: Case 15 Place Order Register before Checkout

    Given User goes to "autoUrl" website
    And Verify that home page is visible successfully
    And Click Signup Login button
    And Fill all details in Signup and create account
    And Verify ACCOUNT CREATED! and click Continue button
    And Verify Logged in as username at top
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    And Verify ACCOUNT DELETED! and click Continue button
    And Closes the page

  @case11
  Scenario: Case 11 Verify Subscription in Cart page
    Given User goes to "autoUrl" website
    And Verify that home page is visible successfully
    And Click Cart button
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible

  @case7
  Scenario: Case 7 Verify Test Cases Page
    Given User goes to "autoUrl" website
    And Verify that home page is visible successfully
    And Click on Test Cases button
    And Verify user is navigated to test cases page successfully
    And Closes the page

  @case3
  Scenario: Case 3 Login User with incorrect email and password
    Given User goes to "autoUrl" website
    And Verify that home page is visible successfully
    And Click Signup Login button
    And Verify Login to your account is visible
    And Enter incorrect email address and password
    And Click login button
    And Verify error Your email or password is incorrect! is visible
    And Closes the page


