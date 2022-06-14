package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AutoExercisePage_Erkam1;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;


public class AutoStepDefinations_Erkam1 {
    AutoExercisePage_Erkam1 autoExercisePage = new AutoExercisePage_Erkam1();

    @Given("automationExercise Url adresine git")
    public void automation_exercise_url_adresine_git() {
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    }

    @Given("anasayfanin gorunur oldugunu dogrula")
    public void anasayfanin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(autoExercisePage.testCase.isDisplayed());
    }

    @Given("SignupLogin butonuna tikla")
    public void signup_login_butonuna_tikla() {
        autoExercisePage.signupLoginButton.click();
    }

    @Given("New User Signup gorunur oldugunu dogrula")
    public void new_user_signup_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(autoExercisePage.newUserSignupButton.isDisplayed());
    }

    @Given("isim ve email gir")
    public void isim_ve_email_gir() {
        autoExercisePage.nameBox.sendKeys(ConfigReader.getProperty("isim"));
        autoExercisePage.emailBox.sendKeys(ConfigReader.getProperty("email"));
    }

    @Given("Signup butonuna tikla")
    public void signup_butonuna_tikla() {
        autoExercisePage.signUpBtton.click();
    }

    @Given("ENTER ACCOUNT INFORMATION yazisinin gorunur oldugunu dogrula")
    public void enter_account_information_yazisinin_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(autoExercisePage.enterAccountInfo.isDisplayed());
    }

    @Then("Title, Name, Email, Password, Date of birth kutularini doldur")
    public void title_name_email_password_date_of_birth_kutularini_doldur() {
        autoExercisePage.gender.click();
        autoExercisePage.password.sendKeys("uslumuerkam");
        autoExercisePage.dateofBirth.sendKeys("21" + Keys.TAB + "July" + Keys.TAB + "1994");
    }

    @Then("Sign up for our newsletter! checkbox secimi yap")
    public void sign_up_for_our_newsletter_checkbox_secimi_yap() {
        autoExercisePage.signupForOurNewsletter.click();
    }

    @Then("Receive special offers from our partners! checkbox secimi yap")
    public void receive_special_offers_from_our_partners_checkbox_secimi_yap() {
        autoExercisePage.receiveSpecialOffers.click();
    }

    @Then("First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number kutularini doldur")
    public void first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number_kutularini_doldur() {
        autoExercisePage.firstNameBox.sendKeys("ERKAM");
        autoExercisePage.lastName.sendKeys("uslu");
        autoExercisePage.company.sendKeys("India");
        autoExercisePage.adress.sendKeys("ankara-begonya");
        autoExercisePage.adress2.sendKeys("istanbul-pendik");
        autoExercisePage.country.sendKeys("Dubai");
        autoExercisePage.state.sendKeys("Mekke");
        autoExercisePage.city.sendKeys("NewYork");
        autoExercisePage.zipCode.sendKeys("34");
        autoExercisePage.phoneNumber.sendKeys("345345345");
    }

    @Then("Create Account button butonunu tikla")
    public void create_account_button_butonunu_tikla() {
        autoExercisePage.createAccount.click();
    }

    @Then("ACCOUNT CREATED! gorunur oldugunu dogrula")
    public void account_created_gorunur_oldugunu_dogrula() {
        Assert.assertTrue(autoExercisePage.accountCreated.isDisplayed());
    }

    @Then("Continue butonuna tikla")
    public void continue_butonuna_tikla() {
        autoExercisePage.continue2.click();
    }

    @Then("Logged in as username gorunurlugunu dogrula")
    public void logged_in_as_username_gorunurlugunu_dogrula() {
        Assert.assertTrue(autoExercisePage.logged.isDisplayed());
    }

    @Then("Delete Account butonuna tikla")
    public void delete_account_butonuna_tikla() {
        autoExercisePage.delete.click();

    }

    @And("deleteclick")
    public void deleteclick() {
        autoExercisePage.deleteButton.click();
    }


    ////////////////////////////////////////////////////////////////////////////////////////
    @And("Enter name and already registered email address")
    public void enternameandalreadyregisteredemailaddress() {
        autoExercisePage.nameBox.sendKeys(ConfigReader.getProperty("isim"));
        autoExercisePage.emailBox.sendKeys(ConfigReader.getProperty("email"));
    }

    @But("Click Signup button")
    public void clickSignupButton() {
        autoExercisePage.signUpBtton.click();
    }

    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(autoExercisePage.alreadyExist.isDisplayed());
    }

    @And("logout")
    public void logout() {
        autoExercisePage.logout.click();
    }
/////////////////////////////////////////////////////////////////
    @And("click on Products button")
    public void clickOnProductsButton() {
        autoExercisePage.product.click();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assert.assertTrue(autoExercisePage.allproductpage.isEnabled());
    }

    @But("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
autoExercisePage.searchProduct.sendKeys("Tshirt");
autoExercisePage.searchclick.click();
    }
    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(autoExercisePage.searchProduct.isDisplayed());
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        for (WebElement each: autoExercisePage.urunlist) {
            Assert.assertTrue(each.isDisplayed());
        }
    }
}
