package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PlaceOrderPage {

    protected WebDriver driver;


    public PlaceOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    public WebElement name_element;

    @FindBy(id = "country")
    public WebElement country_element;

    @FindBy(id = "city")
    public WebElement city_element;

    @FindBy(id = "card")
    public WebElement card_element;

    @FindBy(id = "month")
    public WebElement month_element;

    @FindBy(id = "year")
    public WebElement year_element;

    @FindBy(xpath = "//button[normalize-space()='Purchase']")
    public WebElement purchase_button;

    @FindBy(xpath = "//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']")
    public WebElement close_button;

    @FindBy(xpath = "//h2[normalize-space()='Thank you for your purchase!']")
    public Alert alertText;

//    Actions
    public void enterName(String name){
        name_element.sendKeys(name);
    }
    public void enterCountry(String country){
        country_element.sendKeys(country);
    }
    public void enterCity(String city){
        city_element.sendKeys(city);
    }
    public void enterCard(String card){
        card_element.sendKeys(card);
    }
    public void enterMonth(String month){
        month_element.sendKeys(month);
    }
    public void enterYear(String year){
        year_element.sendKeys(year);
    }
    public void clickPurchase(){
        purchase_button.click();
    }




}
