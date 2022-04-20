package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ParentClass;

import java.util.List;

public class WishListPage extends ParentClass {


    public String url = "http://opencart.abstracta.us/index.php?route=common/home";


    public WishListPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div input[name='search']")
    public WebElement eSearchField;

    @FindBy(css = "span.input-group-btn")
    public WebElement eSearchButton;

    @FindBy(xpath = "//div[@class='caption']//a[contains(text(),'Air')]")
    public WebElement eProduct;

    @FindBy(css = "button[data-original-title*='Wish']")
    public WebElement eWishListButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']//a[text()='wish list']")
    public WebElement eTextCheck;

    @FindBy(id = "input-email")
    public WebElement eEmil;

    @FindBy(id = "input-password")
    public WebElement ePassword;

    @FindBy(css = "input[value='Login']")
    public WebElement eLoginButton;

    @FindBy(xpath = "//tr//td//a[text()='MacBook Air']")
    public WebElement eProductName;

    @FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
    public WebElement eLogout;


    //I can not see the list of product in wish list without login....
    //Therefore second expected result can to be achieved.


    // Scenario two locators


    @FindBy(xpath = "(//div[@class='button-group']//button[@data-original-title='Add to Wish List'])[2]")
    public WebElement eWishListButton2;

    @FindBy(xpath = "//h3[text()='Featured']")
    public WebElement eFeaturedText;

    @FindBy(xpath = "//div//a[text()='Your Store']")
    public WebElement eYourStore;

    //Scenario three locator

    @FindBy(xpath = "//li[@class='dropdown']//a[text()='Desktops']")
    public WebElement eBarMenuDesktop;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav']//li)[1]//a")
    public List<WebElement> eHoverBarMenu;

    @FindBy(xpath = "((//ul[@class='nav navbar-nav']//li)[1]//a)[4]")
    public WebElement eAllDesktops;

    @FindBy(xpath = "//div//a[text()='Show All Desktops']")
    public WebElement eDesktopMenu;

    @FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'Mac')]")
    public WebElement eMacButton;

    @FindBy(css = "button[data-original-title*='Wish']")
    public WebElement eWishListButton3;

    @FindBy(xpath = "//div//h2[text()='Mac']")
    public WebElement eScrollToMac;
}
