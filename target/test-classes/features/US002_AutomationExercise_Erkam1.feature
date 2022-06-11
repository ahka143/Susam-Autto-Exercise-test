
Feature:
  @numberone
  Scenario: Register User Test Case
    Given AutomationExercise Url adresine git
    And anasayfanin gorunur oldugunu dogrula
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
#   'ACCOUNT DELETED!' gorunur oldugunu dogrula
#   'Continue' butonuna tikla
