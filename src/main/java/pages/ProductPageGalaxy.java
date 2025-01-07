package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageGalaxy {

    public  ProductPageGalaxy(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    Elements
    @FindBy(xpath = "//h2[normalize-space()='Samsung galaxy s6']")
    public WebElement productName1;

    @FindBy(xpath = "//h3[@class='price-container']")
    public WebElement productPrice1;

    @FindBy(xpath = "//p[contains(text(),'The Samsung Galaxy S6 is powered by 1.5GHz octa-co')]")
    public WebElement productDescription1;

    @FindBy(xpath = "//a[normalize-space()='Add to cart']")
    public WebElement addToCart1;

//    Actions
    public void getProductName1() {
        productName1.getText();
    }
    public void getProductPrice1() {
        productPrice1.getText();
    }
    public void getProductDescription1() {
        productDescription1.getText();
    }
    public void clickAddToCart1() {
        addToCart1.click();
    }
}

