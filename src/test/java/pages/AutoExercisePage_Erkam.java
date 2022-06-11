package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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




}
