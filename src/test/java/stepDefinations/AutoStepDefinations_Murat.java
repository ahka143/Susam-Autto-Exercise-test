package stepDefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutoExercisePage_Murat;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

import static org.openqa.selenium.Keys.*;

public class AutoStepDefinations_Murat {

    Actions actions = actions = new Actions(Driver.getDriver());
    AutoExercisePage_Murat autoExercisePage_murat = new AutoExercisePage_Murat();
    Faker faker = new Faker();
    String expectedAddress;
    String secilenBrand;
    Random rnd;

    @Given("User goes to {string} website")
    public void user_goes_to_website(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-block-pops");
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        //3. Verify that home page is visible successfully
        String expectedTitle = "Automation Exercise";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @Then("Scroll down page to bottom")
    public void scroll_down_page_to_bottom() {
        //4. Scroll down page to bottom
        for (int i = 0; i < 14; i++) {
            actions.sendKeys(PAGE_DOWN).perform();
        }
    }

    @Then("Verify SUBSCRIPTION is visible")
    public void verify_subscription_is_visible() {
        //5. Verify 'SUBSCRIPTION' is visible

        WebElement subscriptionElement = autoExercisePage_murat.subscriptionText;
        Assert.assertTrue(subscriptionElement.isDisplayed());
    }

    @Then("Scroll up page to top")
    public void scroll_up_page_to_top() {
        //6. Scroll up page to top
        for (int i = 0; i < 14; i++) {
            actions.sendKeys(PAGE_UP).perform();
        }
    }

    @Then("Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_full_fledged_practice_website_for_automation_engineers_text_is_visible_on_screen() {
        //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        WebElement full_fledgedElement = autoExercisePage_murat.fullFledgedText;
        Assert.assertTrue(full_fledgedElement.isDisplayed());
    }

    @Then("Click Signup Login button")
    public void click_signup_login_button() {
        autoExercisePage_murat.signupLogin.click();
    }

    @Then("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        actions.click(autoExercisePage_murat.signUpUserName)
                .sendKeys(faker.name().username())
                .sendKeys(TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(ENTER)
                .perform();

        actions.click(autoExercisePage_murat.genderMale)
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(faker.internet().password())
                .perform();

        Select selectDays = new Select(autoExercisePage_murat.dropDownDays);
        selectDays.selectByVisibleText("11");

        Select selectMonths = new Select(autoExercisePage_murat.dropDownMonths);
        selectMonths.selectByVisibleText("November");

        Select selectYears = new Select(autoExercisePage_murat.dropDownYears);
        selectYears.selectByVisibleText("1984");

        expectedAddress = faker.address().fullAddress();

        actions.click(autoExercisePage_murat.firstNameTextBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(TAB)
                .sendKeys(faker.company().name())
                .sendKeys(TAB)
                .sendKeys(expectedAddress)
                .sendKeys(TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(faker.address().state())
                .sendKeys(TAB)
                .sendKeys(faker.address().city())
                .sendKeys(TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();

        Select selectCountry = new Select(autoExercisePage_murat.dropDownCountry);
        selectCountry.selectByVisibleText("United States");

        autoExercisePage_murat.createAccountButton.click();
    }

    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {
        Assert.assertTrue(autoExercisePage_murat.accountCreatedText.isDisplayed());
        autoExercisePage_murat.continueButton.click();

    }

    @Then("Verify Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {
        Assert.assertTrue(autoExercisePage_murat.loggedinAsUserName.isDisplayed());
    }

    @Then("Add products to cart")
    public void add_products_to_cart() {
        for (int i = 0; i < 2; i++) {
            autoExercisePage_murat.addtoCartList.get(i).click();
        }

    }

    @Then("Click Cart button")
    public void click_cart_button() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", autoExercisePage_murat.viewCartButton);
    }

    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        String expectedUrl = "cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @Then("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        autoExercisePage_murat.proceedToCheckOut.click();
    }

    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verify_that_the_delivery_address_is_same_address_filled_at_the_time_registration_of_account() {
        Assert.assertTrue(autoExercisePage_murat.actualDeliveryAddressWE.getText().equals(expectedAddress));
    }

    @Then("Verify that the billing address is same address filled at the time registration of account")
    public void verify_that_the_billing_address_is_same_address_filled_at_the_time_registration_of_account() {
        Assert.assertTrue(autoExercisePage_murat.actualBillingAddressWE.getText().equals(expectedAddress));
    }

    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        autoExercisePage_murat.deleteButton.click();
    }

    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verify_account_deleted_and_click_continue_button() {
        Assert.assertTrue(autoExercisePage_murat.deleteAaccountText.isDisplayed());
    }

    @Given("Click on Products button")
    public void click_on_products_button() {
        autoExercisePage_murat.productsLink.click();
    }

    @Given("Verify that Brands are visible on left side bar")
    public void verify_that_brands_are_visible_on_left_side_bar() {
        Assert.assertTrue(autoExercisePage_murat.brands.isDisplayed());
    }

    @Given("Click on any brand name")
    public void click_on_any_brand_name() {
        rnd = new Random();
        int randomBrand = rnd.nextInt(autoExercisePage_murat.brandsList.size());
        secilenBrand = autoExercisePage_murat.brandsList.get(randomBrand).getText();
        autoExercisePage_murat.brandsList.get(randomBrand).click();

    }

    @Given("Verify that user is navigated to brand page and brand products are displayed")
    public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
        secilenBrand = secilenBrand.substring(4).toLowerCase();
        Assert.assertTrue(autoExercisePage_murat.secilenBrandName.getText().toLowerCase().equals(secilenBrand));
    }

    @Given("On left side bar, click on any other brand link")
    public void on_left_side_bar_click_on_any_other_brand_link() {
        int randomSecondBrand = rnd.nextInt(autoExercisePage_murat.brandsList.size());
        secilenBrand = autoExercisePage_murat.brandsList.get(randomSecondBrand).getText().substring(4).toLowerCase();
        autoExercisePage_murat.brandsList.get(randomSecondBrand).click();
    }

    @Given("Verify that user is navigated to that brand page and can see products")
    public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
        Assert.assertTrue(autoExercisePage_murat.secilenBrandName.getText().toLowerCase().equals(secilenBrand));
    }

    @And("Closes the page")
    public void closesThePage() {
        Driver.getDriver().close();
    }
}
