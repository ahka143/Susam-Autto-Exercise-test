package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutoExercisePage_Ahmet;
import utilities.ConfigReader;
import utilities.Driver;

public class AutoStepDefinations_Ahmet {

    AutoExercisePage_Ahmet autoExercisePage_ahmet=new AutoExercisePage_Ahmet();


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
       Assert.assertTrue(!autoExercisePage_ahmet.loginToYourAccountText.isDisplayed());
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
}
