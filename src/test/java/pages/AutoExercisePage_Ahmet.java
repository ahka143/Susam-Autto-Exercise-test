package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage_Ahmet {

    public AutoExercisePage_Ahmet(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy (xpath = "//i[@class='fa fa-lock']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement userEmailTextBox;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement ikinciLoginButonu;

    @FindBy (xpath = "//*[text()=' Logged in as ']")
    public WebElement loginIsAsUserText;

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logOutButonu;

    @FindBy (xpath = "(//button[@class='btn btn-success'])[1]")
    public WebElement testCasesButonu;


}
