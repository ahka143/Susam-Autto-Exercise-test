@ahmet
Feature: US001 kullanici AutomationExercise sitesini test eder

  Background: Ortak adim

    Given kullanici "autoUrl" sayfasina gider
    And anasayfanin gorunur oldugunu test eder


  Scenario: TC01 kullanici user emaili ve passwordu ile giris yapabilmeli ve  logout olabilmeli

    And SignUp-Login butonuna tiklar
    And 'Login to your account' yazisinin gorunur oldugunu test eder
    And gecerli email adresini ve passwordu girer
    And login butonuna tiklar
    And 'Logged in as username' textinin gorunur olugunu test eder
    And logOut butonuna tiklar
    And kullanicinin login sayfasina geldigini test eder
    Then sayfayi kapatir

  Scenario: TC02 kullanici tum urunleri ve ozelliklerini goruntuluyebilmeli


    And Product butonuna tiklar
    And All product sayfasina gidildigini test eder
    And urun listesinin goruntulendigini test eder
    And ilk urundeki View Product butonunu tiklar
    And ürün adı, kategori, fiyat, bulunabilirlik, durum ve markanin gorunur oldugunu test eder
    Then sayfayi kapatir

  Scenario:TC03 kullanici urunleri sepete atabilmeli


    And Product butonuna tiklar
    And İlk ürünün üzerine gelir ve sepete ekle'yi tiklar
    And alisverise devam et butonunu tiklar
    And ikinci ürünün üzerine gelir ve sepete ekle'yi tiklar
    And sepeti goruntuleyi tiklar
    And iki urunun de sepete eklendigini test eder
    And urunlerin fiyatlarını, miktarını ve toplam fiyatını dogrular
    Then sayfayi kapatir

  Scenario: TC04 kullanici siparis verip hesabini silebilmeli

    And SignUp-Login butonuna tiklar
    And gecerli email adresini ve passwordu girer
    And login butonuna tiklar
    And 'Logged in as username' textinin gorunur olugunu test eder
    And İlk ürünün üzerine gelir ve sepete ekle'yi tiklar
    And sepeti goruntuleyi tiklar
    And sepet sayfasinin goruntulendigini test eder
    And proceed to checkout butonuna tiklar
    And siparis adresinin goruntulendigini test eder
    And aciklama alanina bilgi girer ve siparis veri tiklar
    And kredi karti bilgilerini girer ve siparisi tamamla ve ode'yi tiklar
    And Your order has been placed successfully! yazsinin goruntulendigini test eder
  #  And delete account butonuna basar
    Then sayfayi kapatir

  Scenario: TC05

    And Product butonuna tiklar
    And All product sayfasina gidildigini test eder
    And arama kutusuna urun adini yazar ve ara dugmesine tiklar
    And SEARCHED PRODUCTS yazisinin gorundugunu test eder
    And aranan urunlerin goruntulendigini test eder
    And urunu sepete ekler
    And sepeti goruntuleyi tiklar ve urunun sepette oldugunu test eder
    And SignUp-Login butonuna tiklar
    And gecerli email adresini ve passwordu girer
    And login butonuna tiklar
    And sepet butonunu tiklar ve urunun sepette oldugunu test eder
    Then sayfayi kapatir

    Scenario: TC06 kullanici satin alma isleminden sonra faturayi indirebilmeli

      And İlk ürünün üzerine gelir ve sepete ekle'yi tiklar
      And sepeti goruntuleyi tiklar
      And sepet sayfasinda oldugunu test eder
      And proceed to checkout butonuna tiklar
      And Register-login butonuna tiklar
      And yeni kullanici olusturur
      And ACCOUNT CREATED! yazisinin goruntulendigini test eder ve Continue butonuna tiklar
      And 'Logged in as username' textinin gorunur olugunu test eder
      And sepet butonunu tiklar ve urunun sepette oldugunu test eder
      And proceed to checkout butonuna tiklar
      And siparis adresinin goruntulendigini test eder
      And aciklama alanina bilgi girer ve siparis veri tiklar
      And kredi karti bilgilerini girer ve siparisi tamamla ve ode'yi tiklar
      And Your order has been placed successfully! yazsinin goruntulendigini test eder
      And bir onceki sayfaya gider
      And Download Invoice butonuna tiklar ve invoice dosyasinin indigini test eder
      And Continue button tiklar
      Then sayfayi kapatir


