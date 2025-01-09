package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


//    Elements
    @FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
    public WebElement home_element;

    @FindBy(xpath = "//a[normalize-space()='Contact']")
    public WebElement contact_element;

    @FindBy(xpath = "//a[normalize-space()='About us']")
    public WebElement about_us_element;

    @FindBy(id = "cartur")
    public WebElement cart_element;

    @FindBy(id = "login2")
    public WebElement login_element;

    @FindBy(id = "signin2")
    public WebElement SignUp_btn_element;

    @FindBy(id = "nameofuser")
    public WebElement nameOfUser_element;

    @FindBy(id = "cat")
    public WebElement Categories_element;

    @FindBy(linkText = "Phones")
    public WebElement Phones_element;

    @FindBy(linkText = "Laptops")
    public WebElement Laptops_element;

    @FindBy(linkText = "Monitors")
    public WebElement Monitors_element;

    @FindBy(id = "prev2")
    public WebElement Previous_element;

    @FindBy(id = "next2")
    public WebElement Next_element;

    @FindBy(xpath = "//a[@id='nameofuser']")
    public WebElement NameOfUser_element;

    @FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
    public WebElement galaxys6_element;

    @FindBy(xpath = "//a[normalize-space()='Nokia lumia 1520']")
    public WebElement Nokia_lumia_element;


//    Actions

    public void selectHomePage() {
        home_element.click();
    }
    public void selectContactPage() {
        contact_element.click();
    }
    public void selectAboutUsPage() {
        about_us_element.click();
    }
    public void selectCartPage() {
        cart_element.click();
    }
    public void selectLoginPage() {
        login_element.click();
    }
    public void selectSignUp() {
        SignUp_btn_element.click();
    }
    public void selectCategories() {
        Categories_element.click();
    }
    public void selectPhones() {
        Phones_element.click();
    }
    public void selectLaptops() {
        Laptops_element.click();
    }
    public void selectMonitors() {
        Monitors_element.click();
    }
    public void clickPrevious() {
        Previous_element.click();
    }
    public void clickNext() {
        Next_element.click();
    }
    public void selectGalaxys6(){
        galaxys6_element.click();
    }
    public void selectNokiaLumia(){
        Nokia_lumia_element.click();
    }

//    public void

}
