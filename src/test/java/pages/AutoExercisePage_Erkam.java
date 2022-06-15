package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class AutoExercisePage_Erkam {

    public AutoExercisePage_Erkam(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath="(//button[@class='btn btn-success'])[1]")
    public WebElement testCase;

    @FindBy (xpath="//a[@href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath="(//h2['New User Signup!'])[3]")
    public WebElement newUserSignupButton;

    @FindBy(xpath="//input[@data-qa='signup-name']")
    public WebElement nameBox;
    @FindBy(xpath="//input[@data-qa='signup-email']")
    public WebElement emailBox;

    @FindBy (xpath="//button[@data-qa='signup-button']")
    public WebElement signUpBtton;

    @FindBy (xpath="(//b['Enter Account Information'])[1]" )
    public WebElement enterAccountInfo;

    @FindBy (xpath="//input[@value='Mr']")
    public WebElement gender;
    @FindBy (xpath="//input[@class='form-control']")
    public WebElement name;
    @FindBy (xpath="//input[@id='email']")
    public WebElement email;
    @FindBy (xpath="//input[@id='password']")
    public WebElement password;
    @FindBy (xpath="//select[@data-qa='days']")
    public WebElement dateofBirth;

    @FindBy (xpath="//input[@name='newsletter']")
    public WebElement signupForOurNewsletter;
    @FindBy(xpath="(//input[@type='checkbox'])[2]")
    public WebElement receiveSpecialOffers;

    @FindBy(xpath="(//input[@type='text'])[3]")
    public WebElement firstNameBox;
    @FindBy(xpath="(//input[@type='text'])[4]")
    public WebElement lastName;
    @FindBy(xpath="(//input[@type='text'])[5]")
    public WebElement company;
    @FindBy(xpath="(//input[@type='text'])[6]")
    public WebElement adress;
    @FindBy(xpath="(//input[@type='text'])[7]")
    public WebElement adress2;
    @FindBy(xpath="(//select[@id='country'])")
    public WebElement country;
    @FindBy(xpath="(//input[@type='text'])[8]")
    public WebElement state;
    @FindBy(xpath="(//input[@type='text'])[9]")
    public WebElement city;
    @FindBy(xpath="(//input[@type='text'])[10]")
    public WebElement zipCode;
    @FindBy(xpath="(//input[@type='text'])[11]")
    public WebElement phoneNumber;

    @FindBy (xpath="(//button[@type='submit'])[1]")
    public WebElement createAccount;

    @FindBy(xpath="//a[@data-qa='continue-button']")
    public WebElement continue1;
    @FindBy(xpath ="//b[text()='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath="//a[@class='btn btn-primary']")
    public WebElement continue2;
    @FindBy(xpath="//*[text()=' Logged in as ']")
    public WebElement logged;
    @FindBy (xpath="//a[@href='/delete_account']")
    public WebElement delete;
    @FindBy (xpath="//button[@data-toggle='modal']")
    public WebElement deleteButton;
    @FindBy (xpath="//a[@style='color:brown;'][1]")
    public WebElement logout;

////////////////////////////////////////////////////////
    @FindBy(xpath="//h2[.='New User Signup!']")
    public WebElement newUserSignup;
    @FindBy(xpath="//p[@style='color: red;']")
    public WebElement alreadyExist;
///////////////////////////////////////////////////////
    @FindBy(xpath =" //i[@style='font-size: 16px;']")
    public WebElement product;

    @FindBy (xpath ="//div[@class='features_items']")
    public WebElement allproductpage;

    @FindBy (xpath="//input[@id='search_product']")
    public WebElement searchProduct;

    @FindBy (xpath="//i[@class='fa fa-search']")
    public WebElement searchclick;

    @FindBy (xpath="//h2[@class='title text-center']")
    public WebElement searchedproducts;

    @FindBy(xpath="//div[@class='productinfo text-center']")
   public List<WebElement> urunlist;

    @FindBy(xpath="(//a[@style='color: brown;'])[3]")
    public WebElement viewProduct;

    @FindBy (xpath="//div[@class='product-information']")
    public WebElement detail;

    @FindBy (xpath="//input[@type='number']")
    public WebElement quantity;

    @FindBy (xpath="//button[@class='btn btn-default cart']")
    public WebElement addcart;

    @FindBy (xpath="//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath="//button[@class='disabled']")
    public WebElement quantitySon;

    @FindBy (xpath="(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement urun1;
    @FindBy (xpath="(//a[@class='btn btn-default add-to-cart'])[3]")
    public WebElement urun2;
    @FindBy (xpath = "//button[@data-dismiss='modal']")
    public WebElement continues;

    @FindBy (xpath="//a[@href='/view_cart']")
    public WebElement cart;

    @FindBy (xpath="//div[@class='container']")
    public WebElement cartpage;

    @FindBy (xpath="(//i[@class='fa fa-times'])[1]")
    public WebElement X;

@FindBy (xpath="//*[text()='Write Your Review']")
    public WebElement write;

    @FindBy (xpath="//textarea[@name='review']")
    public WebElement textArea;

    @FindBy (xpath="//input[@type='text']")
    public WebElement yourname;

    @FindBy (xpath="//input[@type='email']")
    public WebElement sonemail;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement submit;
    @FindBy (xpath="//*[text()='Subscription']")
    public WebElement subscription;

    @FindBy (xpath="//i[@class='fa fa-angle-up']")
    public WebElement sagOk;

    @FindBy (xpath="//*[text()='Blue Top']")
    public List<WebElement> maviTsorthList;

    @FindBy (xpath="//*[text()='Thank you for your review.']")
    public WebElement tesekkurText;

    @FindBy(xpath="//*[text()='Full-Fledged practice website for Automation Engineers']")
    public WebElement fullText;



}
