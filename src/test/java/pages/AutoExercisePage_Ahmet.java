package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutoExercisePage_Ahmet {

    public AutoExercisePage_Ahmet() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//*[text()='Login to your account']")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement userEmailTextBox;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement ikinciLoginButonu;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loginIsAsUserText;

    @FindBy(xpath = "//*[text()=' Logout']")
    public WebElement logOutButonu;

    @FindBy(xpath = "(//button[@class='btn btn-success'])[1]")
    public WebElement testCasesButonu;

    @FindBy(xpath = "//i[@class='material-icons card_travel']")
    public WebElement productButonu;

    @FindBy(xpath = "(//i[@class='fa fa-plus-square'])[1]")
    public WebElement ilkUrunViewProductBtonu;

    @FindBy(xpath = "//*[text()='Blue Top']")
    public WebElement blueTopText;

    @FindBy(xpath = "//*[text()='Category: Women > Tops']")
    public WebElement categoryText;

    @FindBy(xpath = "//*[text()='Rs. 500']")
    public WebElement fiyatText;

    @FindBy(xpath = "//*[text()='Availability:']")
    public WebElement availebletyText;

    @FindBy(xpath = "//*[text()='Condition:']")
    public WebElement conditionText;

    @FindBy(xpath = "//*[text()='Brand:']")
    public WebElement brandText;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement allProductText;

    @FindBy(xpath = "//i[@class='fa fa-plus-square']")
    public List<WebElement> viewProductList;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement ilkUrunSepeteEkleButonu;

    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShoppingButton;


    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
    public WebElement ikinciUrunSepeteEkleButonu;


    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewChartButton;

    @FindBy(xpath = "//*[text()='Men Tshirt']")
    public WebElement menTshirtText;

    @FindBy(xpath = "(//td[@class='cart_price'])[1]")
    public WebElement ilkUrunFiyat;

    @FindBy(xpath = "(//td[@class='cart_price'])[2]")
    public WebElement ikinciUrunFiyat;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement ilkUrunSepetAdet;

    @FindBy(xpath = "(//button[@class='disabled'])[2]")
    public WebElement ikinciUrunSepetAdet;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[1]")
    public WebElement ilkUrunToplamFiyat;

    @FindBy(xpath = "(//p[@class='cart_total_price'])[2]")
    public WebElement ikinciUrunToplamFiyat;

    @FindBy(className = "active")
    public WebElement sepetSayfasiText;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButonu;

    @FindBy(id = "address_delivery")
    public WebElement adresDetayiText;

    @FindBy(className = "form-control")
    public WebElement commenttextBox;

    @FindBy(linkText = "Place Order")
    public WebElement placeOrderButonu;

    @FindBy(name = "name_on_card")
    public WebElement kartUzerindekiIsimTextBox;

    @FindBy(xpath = "(//div[@class='col-md-12 form-group'])[1]")
    public WebElement siparisAlindiText;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchProductTextBox;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement aramaButonu;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement searchedProductsText;

    @FindBy(xpath = "(//div[@class='col-sm-4'])[2]")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    public WebElement chartButton;

    @FindBy(xpath = "//button[@class='form-control btn btn-primary submit-button']")
    public WebElement odemeYapButonu;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement deleteAccountButonu;

    @FindBy(xpath = "//li[@class='active']")
    public WebElement shoppingChartText;

    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement ikinciRegisterButonu;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameTextBox;
    @FindBy (xpath = "//input[@id='id_gender1']")
    public WebElement mrRadioButton;

    @FindBy (xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(linkText = "Continue")
    public WebElement continueButonu;

    @FindBy(linkText = "Download Invoice")
    public WebElement downloadInvoiceButton;
}
