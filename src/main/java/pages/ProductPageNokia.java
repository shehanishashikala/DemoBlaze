package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageNokia {

    public ProductPageNokia(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //    Elements
    @FindBy(xpath = "//h2[normalize-space()='Nokia lumia 1520']")
    public WebElement productName2;

    @FindBy(xpath = "//h3[@class='price-container']")
    public WebElement productPrice2;

    @FindBy(xpath = "//p[contains(text(),'The Nokia Lumia 1520 is powered by 2.2GHz quad-cor')]")
    public WebElement productDescription2;

    @FindBy(xpath = "//a[normalize-space()='Add to cart']")
    public WebElement addToCart2;

    //    Actions
    public void getProductName2() {
        productName2.getText();
    }
    public void getProductPrice2() {
        productPrice2.getText();
    }
    public void getProductDescription2() {
        productDescription2.getText();
    }
    public void clickAddToCart2() {
        addToCart2.click();
    }
}
