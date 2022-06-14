package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoExercisePage_Sena;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutoStepDefinations_Sena {

    AutoExercisePage_Sena page = new AutoExercisePage_Sena();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Then("Launch browser and navigate to url automationexercise")
    public void launchBrowserAndNavigateToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    }

    @Then("Verify that home page is visible successfully")
    public void verifyHomePageIsVisible() {
        String expectedUrl = ConfigReader.getProperty("autoUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Then("Click on Signup Login button")
    public void click_on_signup_login_button() {
        page.signupLoginButton.click();
    }

    @Given("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        Assert.assertTrue(page.loginYourAccountTextBox.isDisplayed());
    }

    @Given("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        page.loginYourAccountEmailBox.sendKeys(ConfigReader.getProperty("validEmail"));
        page.loginYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("validPassword"));
    }

    @Given("Click login button")
    public void click_login_button() {
        page.loginButton.click();
    }

    @Given("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        Assert.assertTrue(page.userNameElement.isDisplayed());
    }

    @Given("Click Delete Account button")
    public void click_delete_account_button() {
        page.deleteAccountElement.click();
        page.deleteButton.click();
    }

    @Given("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        String pageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(pageUrl.contains("delete_account"));

    }

    @Given("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        page.loginYourAccountEmailBox.sendKeys(ConfigReader.getProperty("autoExInvalidEmail"));
        page.loginYourAccountPasswordBox.sendKeys(ConfigReader.getProperty("autoExInvalidPassword"));
    }

    @And("Close browser")
    public void closeBrowser() {
        Driver.closeDriver();
    }

    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
        page.contactUsButton.click();
    }

    @Given("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        Assert.assertTrue(page.getInTouchTextElement.isDisplayed());
    }

    @Given("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        actions.click(page.contactUsNameBox).sendKeys(faker.funnyName().name())
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.harryPotter().spell())
                .sendKeys(Keys.TAB).sendKeys(faker.lorem().sentence(9))
                .perform();
    }

    @Given("Upload file")
    public void upload_file() {
        String filePath = System.getProperty("user.home") + "\\OneDrive\\Masaüstü\\Deneme.docx";
        page.uploadFileButton.sendKeys(filePath);
    }

    @Given("Click Submit button")
    public void click_submit_button() {
        page.contactUsSubmitButton.click();
    }

    @Given("Click OK button")
    public void click_ok_button() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @Given("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        Assert.assertTrue(page.contactUsAlertSuccessText.isDisplayed());
    }

    @Given("Click Home button and verify that landed to home page successfully")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
        page.contactUsSuccessHomeButton.click();
        String expectedUrl = ConfigReader.getProperty("autoUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }


    @Given("Scroll down to footer")
    public void scroll_down_to_footer() {
        ReusableMethods.scrollIntoView(page.subscriptionTitle);

    }

    @Given("Verify text SUBSCRIPTION")
    public void verify_text_subscription() {
        Assert.assertTrue(page.subscriptionTitle.isDisplayed());
    }

    @Given("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() {
        page.subscriptionTextBox.sendKeys(ConfigReader.getProperty("autoExInvalidEmail") + Keys.ENTER);
    }

    @Given("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
        Assert.assertTrue(page.footerElement.getText().contains("You have been successfully subscribed!"));
    }

    @And("Add products to cart")
    public void addProductsToCart() {
        for (int i = 0; i < 5; i++) {
            page.addToCartButtons.get(i).click();
            page.continueShoppingButton.click();
        }
    }

    @And("Click Cart button")
    public void clickCartButton() {
        page.cartButton.click();
    }

    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        String expectedUrl = ConfigReader.getProperty("cartPageUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        page.proceedToCheckoutButton.click();
    }

    @And("Click Register Login button")
    public void clickRegisterLoginButton() {
        page.registerLoginButton.click();
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() throws InterruptedException {
        actions
                .sendKeys(page.signUpNameTextBox,ConfigReader.getProperty("validName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("validEmail2"))
                .perform();

        page.signUpButton.click();

        Thread.sleep(5000);

        actions.sendKeys(page.passwordTextBox,ConfigReader.getProperty("validPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();

        page.mobileNumberTextBox.sendKeys(faker.phoneNumber().cellPhone());
        page.createAccountButton.click();

    }

    @And("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        Assert.assertTrue(page.accountCreatedText.isDisplayed());
        page.continueButton.click();
    }

    @And("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        Assert.assertTrue(page.loggedInAsText.isDisplayed());
    }


    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        Assert.assertTrue(page.addressDetailsText.isDisplayed());
        Assert.assertTrue(page.reviewYourOrderText.isDisplayed());
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        page.commentTextArea.sendKeys(faker.hitchhikersGuideToTheGalaxy().quote());
        page.placeOrderButton.click();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        actions.sendKeys(page.nameOnCardTextArea,faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.finance().creditCard())
                .sendKeys(Keys.TAB)
                .sendKeys("123")
                .sendKeys(Keys.TAB)
                .sendKeys("01")
                .sendKeys(Keys.TAB)
                .sendKeys("2024")
                .sendKeys(Keys.TAB)
                .perform();
    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        page.payAndConfirmButton.click();
    }

    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertTrue(page.orderPlacedText.isDisplayed());
    }


    @And("Click Continue button")
    public void clickContinueButton() {
        page.continueButton.click();
    }

    @And("Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        page.categoryList.forEach(t-> Assert.assertTrue(t.isDisplayed()));
    }

    @And("Click on Women category")
    public void clickOnWomenCategory() {
        page.womenCategoryButton.click();
    }

    @And("Click on any category link under Women category, for example: Tops")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {
        ReusableMethods.waitForVisibility(page.womenCategoryLinks.get(0),10);
        page.womenCategoryLinks.get(1).click();
    }

    @And("Verify that category page is displayed and confirm text")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {
        String expectedTitle = ConfigReader.getProperty("expectedWomenCategoryTitle");
        String actualTitle = page.categoryTitle.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("On left side bar, click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {
        page.menCategoryButton.click();
        page.menCategoryLinks.get(0).click();
    }

    @And("Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {
        String expectedText = "MEN";
        String title = page.categoryTitle.getText();
        Assert.assertTrue(title.contains(expectedText));
    }

    @And("Scroll to bottom of page")
    public void scrollToBottomOfPage() {
        ReusableMethods.scrollIntoView(page.recommendedItemsTitle);
    }

    @And("Verify RECOMMENDED ITEMS are visible")
    public void verifyRECOMMENDEDITEMSAreVisible() {
        Assert.assertTrue(page.recommendedItemsTitle.isDisplayed());
    }

    @And("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        page.recommendedItemAddToCart.click();
    }

    @And("Click on View Cart button")
    public void clickOnViewCartButton() {
        page.viewCartLink.click();
    }

    @And("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {
        Assert.assertTrue(page.productInCart.isDisplayed());
    }
}
