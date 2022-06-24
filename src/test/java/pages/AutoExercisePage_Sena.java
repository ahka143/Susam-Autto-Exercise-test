package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoExercisePage_Sena {
    public AutoExercisePage_Sena(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // deneme

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement userNameElement;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccountElement;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginYourAccountEmailBox;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginYourAccountPasswordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginYourAccountTextBox;

    @FindBy(xpath = "//a[.=' Contact us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//*[.='Get In Touch']")
    public WebElement getInTouchTextElement;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactUsNameBox;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement contactUsSubmitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement contactUsAlertSuccessText;

    @FindBy(xpath = "//span[.=' Home']")
    public WebElement contactUsSuccessHomeButton;

    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscriptionTitle;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement subscriptionTextBox;

    @FindBy(xpath = "//div[@class='footer-widget']")
    public WebElement footerElement;

    @FindBy(xpath = "//div[@class='productinfo text-center']//a[@class='btn btn-default add-to-cart']")
    public List<WebElement> addToCartButtons;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement signUpNameTextBox;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement signUpButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public WebElement mobileNumberTextBox;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedInAsText;

    @FindBy(xpath = "//*[text()='Address Details']")
    public WebElement addressDetailsText;

    @FindBy(xpath = "//*[text()='Review Your Order']")
    public WebElement reviewYourOrderText;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement commentTextArea;

    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement nameOnCardTextArea;

    @FindBy(xpath = "//button[@data-qa='pay-button']")
    public WebElement payAndConfirmButton;

    @FindBy(xpath = "//*[text()='Order Placed!']")
    public WebElement orderPlacedText;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='panel panel-default']")
    public List<WebElement> categoryList;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategoryButton;

    @FindBy(xpath = "//div[@id='Women']//li//a")
    public List<WebElement> womenCategoryLinks;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement categoryTitle;

    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement menCategoryButton;

    @FindBy(xpath = "//div[@id='Men']//li//a")
    public List<WebElement> menCategoryLinks;

    @FindBy(xpath = "//*[text()='recommended items']")
    public WebElement recommendedItemsTitle;

    @FindBy(xpath = "//div[@id='recommended-item-carousel']//div[@class='item active']//a")
    public WebElement recommendedItemAddToCart;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartLink;

    @FindBy(xpath = "//tr[@id='product-1']")
    public WebElement productInCart;
}
