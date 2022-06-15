@numberzero
Feature: US002 kullanici AutomationExercise sitesini test eder

  Background: Launch browser
    Given automationExercise Url adresine git
    And anasayfanin gorunur oldugunu dogrula

  Scenario: TC01 Register User
    And SignupLogin butonuna tikla
    And New User Signup gorunur oldugunu dogrula
    And isim ve email gir
    But Signup butonuna tikla
    But ENTER ACCOUNT INFORMATION yazisinin gorunur oldugunu dogrula
    Then Title, Name, Email, Password, Date of birth kutularini doldur
    And Sign up for our newsletter! checkbox secimi yap
    And Receive special offers from our partners! checkbox secimi yap
    And First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number kutularini doldur
    And Create Account button butonunu tikla
    And ACCOUNT CREATED! gorunur oldugunu dogrula
    And Continue butonuna tikla
    But Logged in as username gorunurlugunu dogrula
    And Delete Account butonuna tikla
    And deleteclick

#   yurumezse 33. satira bak
  Scenario: TC02 Register User with existing email adres
    And logout
    And SignupLogin butonuna tikla
    And New User Signup gorunur oldugunu dogrula
    And Enter name and already registered email address
    But Click Signup button
    Then  Verify error Email Address already exist! is visible


  Scenario: TC03 Search Product
    And click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    But Enter product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
#duzenle sonuncuyu

  Scenario: Verify Product quantity in Cart
    And Click View Product for any product on home page
    And Verify product detail is opened
    Then Increase quantity to 4
    And Click Add to cart button
    Then Click View Cart button
    But Verify that product is displayed in cart page with exact quantity


  Scenario: Remove Products From Cart
    Then  Add products to cart
    And Click Cart button
    Given Verify that cart page is displayed
    But  Click X button corresponding to particular product
#    And Verify that product is removed from the cart

  Scenario: Add review on product
    But click the product button
    And  Verify user is navigated to ALL PRODUCTS page successfully
    Then Click on View Product button
    And Verify Write Your Review is visible
    But Enter name, email and review
    Given Click Submit button
#    And Verify success message Thank you for your review.
  Scenario: Verify Scroll Up using Arrow button and Scroll Down functionality
    And  Scroll down page to bottom
    And Verify SUBSCRIPTION is visible
    Then Click on arrow at bottom right side to move upward
#  And Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen


