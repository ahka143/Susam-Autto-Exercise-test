package stepDefinitions;

import com.beust.ah.A;
import com.github.javafaker.Faker;
import com.github.javafaker.File;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AutoExercisePage_Ahmet;
import utilities.ConfigReader;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class AutoStepDefinations_Ahmet {

    AutoExercisePage_Ahmet autoExercisePage_ahmet = new AutoExercisePage_Ahmet();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

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

        Assert.assertEquals("1", autoExercisePage_ahmet.ilkUrunSepetAdet.getText());
        Assert.assertEquals("1", autoExercisePage_ahmet.ikinciUrunSepetAdet.getText());

    }

    @And("sepet sayfasinin goruntulendigini test eder")
    public void sepetSayfasininGoruntulendiginiTestEder() {

        Assert.assertTrue(autoExercisePage_ahmet.sepetSayfasiText.isDisplayed());
    }

    @And("proceed to checkout butonuna tiklar")
    public void proceedToCheckoutButonunaTiklar() {
        autoExercisePage_ahmet.proceedToCheckoutButonu.click();
    }

    @And("siparis adresinin goruntulendigini test eder")
    public void siparisAdresininGoruntulendiginiTestEder() {
        Assert.assertTrue(autoExercisePage_ahmet.adresDetayiText.isDisplayed());
    }


    @And("aciklama alanina bilgi girer ve siparis veri tiklar")
    public void aciklamaAlaninaBilgiGirerVeSiparisVeriTiklar() {
        autoExercisePage_ahmet.commenttextBox.sendKeys("Umarim urun kalitelidir");
        autoExercisePage_ahmet.placeOrderButonu.click();
    }

    @And("kredi karti bilgilerini girer ve siparisi tamamla ve ode'yi tiklar")
    public void krediKartiBilgileriniGirerVeSiparisiTamamlaVeOdeYiTiklar() {
        autoExercisePage_ahmet.kartUzerindekiIsimTextBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB, "23444565656567657567")
                .sendKeys(Keys.TAB, "123")
                .sendKeys(Keys.TAB, "11")
                .sendKeys(Keys.TAB, "2011")
                .perform();

        autoExercisePage_ahmet.odemeYapButonu.click();


        Driver.getDriver().navigate().back();



    }

    @And("Your order has been placed successfully! yazsinin goruntulendigini test eder")
    public void yourOrderHasBeenPlacedSuccessfullyYazsininGoruntulendiginiTestEder() {
        //System.out.println(autoExercisePage_ahmet.siparisAlindiText.getText());
        Assert.assertTrue(autoExercisePage_ahmet.siparisAlindiText.isDisplayed());
    }

    @And("arama kutusuna urun adini yazar ve ara dugmesine tiklar")
    public void aramaKutusunaUrunAdiniYazarVeAraDugmesineTiklar() {
        autoExercisePage_ahmet.searchProductTextBox.sendKeys("blue top");
        autoExercisePage_ahmet.aramaButonu.click();
    }

    @And("SEARCHED PRODUCTS yazisinin gorundugunu test eder")
    public void searchedPRODUCTSYazisininGorundugunuTestEder() {
        Assert.assertTrue(autoExercisePage_ahmet.searchedProductsText.isDisplayed());
    }

    @And("aranan urunlerin goruntulendigini test eder")
    public void arananUrunlerinGoruntulendiginiTestEder() {

        Assert.assertTrue(autoExercisePage_ahmet.blueTopText.isDisplayed());
    }


    @And("sepet butonunu tiklar ve urunun sepette oldugunu test eder")
    public void sepetButonunuTiklarVeUrununSepetteOldugunuTestEder() {
        autoExercisePage_ahmet.chartButton.click();
        Assert.assertTrue(autoExercisePage_ahmet.blueTopText.isDisplayed());
    }

    @And("urunu sepete ekler")
    public void urunuSepeteEkler() {

        autoExercisePage_ahmet.ilkUrunSepeteEkleButonu.click();
    }

    @And("sepeti goruntuleyi tiklar ve urunun sepette oldugunu test eder")
    public void sepetiGoruntuleyiTiklarVeUrununSepetteOldugunuTestEder() {
        autoExercisePage_ahmet.viewChartButton.click();
        Assert.assertTrue(autoExercisePage_ahmet.blueTopText.isDisplayed());

    }

    @And("delete account butonuna basar")
    public void deleteAccountButonunaBasar() {
        autoExercisePage_ahmet.deleteAccountButonu.click();
    }

    @And("sepet sayfasinda oldugunu test eder")
    public void sepetSayfasindaOldugunuTestEder() {
        Assert.assertTrue(autoExercisePage_ahmet.sepetSayfasiText.isDisplayed());
    }

    @And("Register-login butonuna tiklar")
    public void registerLoginButonunaTiklar() {
        autoExercisePage_ahmet.ikinciRegisterButonu.click();
    }

    @And("yeni kullanici olusturur")
    public void yeniKullaniciOlusturur() {
        autoExercisePage_ahmet.nameTextBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB, "adssasd@asdf.com", Keys.ENTER).perform();
        autoExercisePage_ahmet.mrRadioButton.click();
        actions.sendKeys(Keys.TAB, Keys.TAB, "123456")
                .sendKeys(Keys.TAB, Keys.ARROW_DOWN, Keys.TAB, Keys.ARROW_DOWN, Keys.TAB, Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, faker.name().firstName(), Keys.TAB, faker.name().lastName())
                .sendKeys(Keys.TAB, Keys.TAB, faker.address().fullAddress(), Keys.TAB, Keys.TAB, Keys.TAB, faker.address().state())
                .sendKeys(Keys.TAB, faker.address().city(), Keys.TAB, faker.address().zipCode(), Keys.TAB, faker.phoneNumber().cellPhone())
                .sendKeys(Keys.ENTER)
                .perform();

    }

    @And("ACCOUNT CREATED! yazisinin goruntulendigini test eder ve Continue butonuna tiklar")
    public void accountCREATEDYazisininGoruntulendiginiTestEderVeContinueButonunaTiklar() {
        Assert.assertTrue(autoExercisePage_ahmet.accountCreatedText.isDisplayed());
        autoExercisePage_ahmet.continueButonu.click();
    }

    @And("Download Invoice butonuna tiklar ve invoice dosyasinin indigini test eder")
    public void downloadInvoiceButonunaTiklarVeInvoiceDosyasininIndiginiTestEder() {
        autoExercisePage_ahmet.downloadInvoiceButton.click();
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\invoice.txt";
        Assert.assertTrue(Files.exists(Path.of(dosyaYolu)));

    }

    @And("Continue button tiklar")
    public void continueButtonTiklar() {
        autoExercisePage_ahmet.continueButonu.click();
    }

    @And("bir onceki sayfaya gider")
    public void birOncekiSayfayaGider() {
        Driver.getDriver().navigate().forward();
    }
}
