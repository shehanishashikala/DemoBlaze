package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderSuccessPage {

    public Object getPlaceOrderSuccess;

    public PlaceOrderSuccessPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[normalize-space()='Thank you for your purchase!']")
    WebElement OrderSuccess_element;

    public String verifyOrderSuccess() {
        return OrderSuccess_element.getText();
    }
}
