Feature: US001 kullanici AutomationExercise sitesini test eder

  Scenario: TC01 kullanici user emaili ve passwordu ile giris yapabilmeli ve  logout olabilmeli

    Given kullanici "autoUrl" sayfasina gider
    And anasayfanin gorunur oldugunu test eder
    And SignUp/Login butonuna tiklar
    And 'Login to your account' yazisinin gorunur oldugunu test eder
    And gecerli email adresini ve passwordu girer
    And login butonuna tiklar
    And 'Logged in as username' textinin gorunur olugunu test eder
    And logOut butonuna tiklar
    Then kullanicinin login sayfasina geldigini test eder
