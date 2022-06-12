package pages;

import org.checkerframework.framework.qual.QualifierForLiterals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoExercisePage_Murat {

    public AutoExercisePage_Murat(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//h2)[82]")
    public WebElement subscriptionText;

    @FindBy (xpath = "(//h2)[1]")
    public WebElement fullFledgedText;

    @FindBy (xpath = "//*[text()=' Signup / Login']")
    public WebElement signupLogin;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement signUpUserName;

    @FindBy (id = "id_gender1")
    public WebElement genderMale;

    @FindBy (id = "id_gender2")
    public WebElement genderFeMale;

    @FindBy (xpath = "//select[@id='days']")
    public WebElement dropDownDays;

    @FindBy (xpath = "//select[@id='months']")
    public WebElement dropDownMonths;

    @FindBy (xpath = "//select[@id='years']")
    public WebElement dropDownYears;

    @FindBy (xpath = "(//input[@type='checkbox'])[1]")
    public WebElement newsLetterClick;

    @FindBy (xpath = "//select[@id='country']")
    public WebElement dropDownCountry;

    @FindBy (id = "first_name")
    public WebElement firstNameTextBox;

    @FindBy (xpath = "//*[.='Create Account']")
    public WebElement createAccountButton;

    @FindBy (xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy (xpath = "//a[.='Continue']")
    public WebElement continueButton;

    @FindBy (xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedinAsUserName;

    @FindBy (xpath = "//*[text()='Add to cart']")
    public List<WebElement> addtoCartList;

    @FindBy (xpath = "//a[.='View Cart']")
    public WebElement viewCartButton;

    @FindBy (xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckOut;

    @FindBy (xpath = "(//li[@class='address_address1 address_address2'])[2]")
    public WebElement actualDeliveryAddressWE;

    @FindBy (xpath = "(//li[@class='address_address1 address_address2'])[5]")
    public WebElement actualBillingAddressWE;

    @FindBy (xpath = "//*[text()=' Delete Account']")
    public WebElement deleteButton;

    @FindBy (xpath = "//h1[text()='Delete Account']")
    public WebElement deleteAaccountText;

    @FindBy (xpath = "//*[text()=' Products']")
    public WebElement productsLink;

    @FindBy (xpath = "//h2[text()='Brands']")
    public WebElement brands;

    @FindBy (xpath = "//div[@class='brands-name']//li")
    public List <WebElement> brandsList;

    @FindBy (xpath = "//li[@class='active']")
    public WebElement secilenBrandName;
}
