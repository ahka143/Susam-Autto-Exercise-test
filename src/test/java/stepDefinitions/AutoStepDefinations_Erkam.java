package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExercisePage_Erkam;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class AutoStepDefinations_Erkam {
    AutoExercisePage_Erkam autoExercisePage = new AutoExercisePage_Erkam();

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
        for (WebElement each : autoExercisePage.urunlist) {
            Assert.assertTrue(each.isDisplayed());
        }
    }


    /////////////////////////////////////////////////////////

    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        autoExercisePage.viewProduct.click();
    }

    @And("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        Assert.assertTrue(autoExercisePage.detail.isEnabled());
    }

    @Then("Increase quantity to {int}")
    public void increaseQuantityTo(int a) {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(autoExercisePage.quantity)
                .click()
                .sendKeys(Keys.BACK_SPACE)
                .sendKeys("4")
                .perform();
//                .sendKeys(Keys.ARROW_UP)
//                .sendKeys(Keys.ARROW_UP)
//                .sendKeys(Keys.ARROW_UP)
//                .perform();
    }

    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        autoExercisePage.addcart.click();
    }

    @Then("Click View Cart button")
    public void clickViewCartButton() {
        autoExercisePage.viewCart.click();
    }

    @But("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        String expectedQuantity = "4";
        String actualQuantity = autoExercisePage.quantitySon.getText();
        Assert.assertEquals(expectedQuantity, actualQuantity);
    }

    ////////////////////////////////////////////////////////////////
    @Then("Add products to cart")
    public void addProductsToCart() {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(autoExercisePage.urun1).click().perform();
        //autoExercisePage.urun1.click();
        autoExercisePage.continues.click();
        action.moveToElement(autoExercisePage.urun2).click().perform();
        // autoExercisePage.urun2.click();
        autoExercisePage.continues.click();
    }


    @And("Click Cart button")
    public void clickCartButton() {
        autoExercisePage.cart.click();
    }

    @Given("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        Assert.assertTrue(autoExercisePage.cartpage.isDisplayed());
    }

    @But("Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() throws InterruptedException {
        autoExercisePage.X.click();
        Thread.sleep(1000);
    }

    @And("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
       // Assert.assertTrue(autoExercisePage.maviTsorthList.isEmpty());
        Assert.assertEquals(0,autoExercisePage.maviTsorthList.size());
    }

    //////////////////////////////////////////////////////////
    @But("click the product button")
    public void clickTheProductButton() {
        autoExercisePage.product.click();
    }

    @Then("Click on View Product button")
    public void clickOnViewProductButton() {
        autoExercisePage.viewProduct.click();
    }

    @And("Verify Write Your Review is visible")
    public void verifyWriteYourReviewIsVisible() {
        Assert.assertTrue(autoExercisePage.write.isDisplayed());
    }


    @But("Enter name, email and review")
    public void enterNameEmailAndReview() {
        autoExercisePage.textArea.sendKeys("berbat!");
        autoExercisePage.sonemail.sendKeys("dccc@dd");
        autoExercisePage.yourname.sendKeys("ccccd");
    }

    @Given("Click Submit button")
    public void clickSubmitButton() {
        autoExercisePage.submit.click();
    }

    @And("Verify success message Thank you for your review.")
    public void verifySuccessMessageThankYouForYourReview() {
        Assert.assertTrue(autoExercisePage.tesekkurText.isDisplayed());

    }

    ///////////////////////////////////////////////////////////////////////
    @And("Scroll down page to bottom")
    public void scrollDownPageToBottom() {
        ReusableMethods.scroolDown(autoExercisePage.subscription);

    }

    @And("Verify SUBSCRIPTION is visible")
    public void verifySUBSCRIPTIONIsVisible() {
        Assert.assertTrue(autoExercisePage.subscription.isDisplayed());
    }

    @Then("Click on arrow at bottom right side to move upward")
    public void clickOnArrowAtBottomRightSideToMoveUpward() {
        autoExercisePage.sagOk.click();
    }


    @And("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() {
Assert.assertTrue(autoExercisePage.fullText.isDisplayed());
    }

}
