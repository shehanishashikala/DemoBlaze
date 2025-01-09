package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    WebElement placeOrder_button;

    public void getPlaceOrder() {
        placeOrder_button.click();
    }
}
