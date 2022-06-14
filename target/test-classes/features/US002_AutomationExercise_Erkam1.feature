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

#   'Continue' butonuna tikla
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



