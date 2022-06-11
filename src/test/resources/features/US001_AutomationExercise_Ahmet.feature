Feature: US001 kullanici AutomationExercise sitesini test eder

  @ahmet
  Scenario: TC01 kullanici user emaili ve passwordu ile giris yapabilmeli ve  logout olabilmeli
    Given kullanici "autoUrl" sayfasina gider
    And anasayfanin gorunur oldugunu test eder
    And SignUp-Login butonuna tiklar
    And 'Login to your account' yazisinin gorunur oldugunu test eder
    And gecerli email adresini ve passwordu girer
    And login butonuna tiklar
    And 'Logged in as username' textinin gorunur olugunu test eder
    And logOut butonuna tiklar
    And kullanicinin login sayfasina geldigini test eder
    Then sayfayi kapatir

    Scenario: TC02 kullanici tum urunleri ve ozelliklerini goruntuluyebilmeli

      Given  kullanici "autoUrl" sayfasina gider
      And anasayfanin gorunur oldugunu test eder
      And Product butonuna tiklar
      And All product sayfasina gidildigini test eder
      And urun listesinin goruntulendigini test eder
      And ilk urundeki View Product butonunu tiklar
      And ürün adı, kategori, fiyat, bulunabilirlik, durum ve markanin gorunur oldugunu test eder
      Then sayfayi kapatir
