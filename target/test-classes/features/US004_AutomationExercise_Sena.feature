Feature: AutomationExercise sitesini test eder

  @case2 @test
  Scenario: TC02 Login User with correct email and password
    When Launch browser and navigate to url automationexercise
    Then Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible
    And Close browser



  @case6
  Scenario: TC06 Contact Us Form
    When Launch browser and navigate to url automationexercise
    And Verify that home page is visible successfully
    And Click on Contact Us button
    And Verify GET IN TOUCH is visible
    And Enter name, email, subject and message
    And Upload file
    And Click Submit button
    And Click OK button
    And Verify success message Success! Your details have been submitted successfully. is visible
    And Click Home button and verify that landed to home page successfully




  @case10
  Scenario: TC10 Verify Subscription in home page
    Given Launch browser and navigate to url automationexercise
    And Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible



  @case14
  Scenario: TC14 Place Order: Register while Checkout
    Given Launch browser and navigate to url automationexercise
    And Verify that home page is visible successfully
    And Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    And Click Proceed To Checkout
    And Click Register Login button
    And Fill all details in Signup and create account
    And Verify ACCOUNT CREATED! and click Continue button
    And Verify Logged in as username at top
    And Click Cart button
    And Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible



  @case18
  Scenario: TC18 View Category Products
    Given Launch browser and navigate to url automationexercise
    And Verify that categories are visible on left side bar
    And Click on Women category
    And Click on any category link under Women category, for example: Tops
    And Verify that category page is displayed and confirm text
    And On left side bar, click on any sub-category link of Men category
    And Verify that user is navigated to that category page


  @case22
  Scenario: TC22 Add to cart from Recommended items
    Given Launch browser and navigate to url automationexercise
    And Scroll to bottom of page
    And Verify RECOMMENDED ITEMS are visible
    And Click on Add To Cart on Recommended product
    And Click on View Cart button
    And Verify that product is displayed in cart page
