package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExercisePage_Ahmet;
import utilities.ConfigReader;
import utilities.Driver;

public class AutoStepDefinations_Ahmet {

    AutoExercisePage_Ahmet autoExercisePage_ahmet = new AutoExercisePage_Ahmet();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    }

    @Given("anasayfanin gorunur oldugunu test eder")
    public void anasayfanin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(autoExercisePage_ahmet.testCasesButonu.isDisplayed());
    }

    @Given("SignUp-Login butonuna tiklar")
    public void sign_up_login_butonuna_tiklar() {
        autoExercisePage_ahmet.ilkLoginButonu.click();
    }

    @Given("{string} yazisinin gorunur oldugunu test eder")
    public void yazisinin_gorunur_oldugunu_test_eder(String string) {
        Assert.assertTrue(autoExercisePage_ahmet.loginToYourAccountText.isDisplayed());
    }

    @Given("gecerli email adresini ve passwordu girer")
    public void gecerli_email_adresini_ve_passwordu_girer() {
        autoExercisePage_ahmet.userEmailTextBox.sendKeys(ConfigReader.getProperty("autoValidEmail"));
        autoExercisePage_ahmet.passwordTextBox.sendKeys(ConfigReader.getProperty("autoValidPassword"));
    }

    @Given("login butonuna tiklar")
    public void login_butonuna_tiklar() {
        autoExercisePage_ahmet.ikinciLoginButonu.click();
    }

    @Given("{string} textinin gorunur olugunu test eder")
    public void textinin_gorunur_olugunu_test_eder(String string) {

        Assert.assertTrue(autoExercisePage_ahmet.loginIsAsUserText.isDisplayed());
    }

    @Given("logOut butonuna tiklar")
    public void log_out_butonuna_tiklar() {
        autoExercisePage_ahmet.logOutButonu.click();
    }

    @Then("kullanicinin login sayfasina geldigini test eder")
    public void kullanicinin_login_sayfasina_geldigini_test_eder() {
        Assert.assertTrue(autoExercisePage_ahmet.loginToYourAccountText.isDisplayed());
    }

    @Then("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Product butonuna tiklar")
    public void productButonunaTiklar() {
        autoExercisePage_ahmet.productButonu.click();
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();

    }

    @And("All product sayfasina gidildigini test eder")
    public void allProductSayfasinaGidildiginiTestEder() {
        String expectedText = "products";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedText));
    }

    @And("urun listesinin goruntulendigini test eder")
    public void urunListesininGoruntulendiginiTestEder() {
        Assert.assertTrue(autoExercisePage_ahmet.allProductText.isDisplayed());
    }

    @And("ilk urundeki View Product butonunu tiklar")
    public void ilkUrundekiViewProductButonunuTiklar() {
        autoExercisePage_ahmet.ilkUrunViewProductBtonu.click();
    }

    @And("ürün adı, kategori, fiyat, bulunabilirlik, durum ve markanin gorunur oldugunu test eder")
    public void ürünAdıKategoriFiyatBulunabilirlikDurumVeMarkaninGorunurOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage_ahmet.blueTopText.isDisplayed());
        Assert.assertTrue(autoExercisePage_ahmet.categoryText.isDisplayed());
        Assert.assertTrue(autoExercisePage_ahmet.fiyatText.isDisplayed());
        Assert.assertTrue(autoExercisePage_ahmet.availebletyText.isDisplayed());
        Assert.assertTrue(autoExercisePage_ahmet.conditionText.isDisplayed());
        Assert.assertTrue(autoExercisePage_ahmet.brandText.isDisplayed());
    }

    @And("İlk ürünün üzerine gelir ve sepete ekle'yi tiklar")
    public void i̇lkÜrününÜzerineGelirVeSepeteEkleYiTiklar() {
        actions.moveToElement(autoExercisePage_ahmet.ilkUrunSepeteEkleButonu)
                .click().perform();
    }

    @And("alisverise devam et butonunu tiklar")
    public void alisveriseDevamEtButonunuTiklar() {
        autoExercisePage_ahmet.continueShoppingButton.click();

    }

    @And("ikinci ürünün üzerine gelir ve sepete ekle'yi tiklar")
    public void ikinciÜrününÜzerineGelirVeSepeteEkleYiTiklar() {
        actions.moveToElement(autoExercisePage_ahmet.ikinciUrunSepeteEkleButonu)
                .click().perform();
    }

    @And("sepeti goruntuleyi tiklar")
    public void sepetiGoruntuleyiTiklar() {
        autoExercisePage_ahmet.viewChartButton.click();
    }

    @And("iki urunun de sepete eklendigini test eder")
    public void ikiUrununDeSepeteEklendiginiTestEder() {
        Assert.assertTrue(autoExercisePage_ahmet.blueTopText.isDisplayed());
        Assert.assertTrue(autoExercisePage_ahmet.menTshirtText.isDisplayed());
    }

    @And("urunlerin fiyatlarını, miktarını ve toplam fiyatını dogrular")
    public void urunlerinFiyatlarınıMiktarınıVeToplamFiyatınıDogrular() {
        Assert.assertEquals(autoExercisePage_ahmet.ilkUrunFiyat.getText(),
                autoExercisePage_ahmet.ilkUrunToplamFiyat.getText());

        Assert.assertEquals(autoExercisePage_ahmet.ikinciUrunFiyat.getText(),
                autoExercisePage_ahmet.ikinciUrunToplamFiyat.getText());

        Assert.assertEquals("1",autoExercisePage_ahmet.ilkUrunSepetAdet.getText());
        Assert.assertEquals("1",autoExercisePage_ahmet.ikinciUrunSepetAdet.getText());

    }
}
