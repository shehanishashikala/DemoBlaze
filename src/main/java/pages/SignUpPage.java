package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


//Elements
    @FindBy(id = "sign-username")
    public WebElement username_field;

    @FindBy(id = "sign-password")
    public WebElement password_field;

    @FindBy(xpath = "//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']")
    public WebElement close_button;

    @FindBy(xpath = "//button[normalize-space()='Sign up']")
    public WebElement sign_up_button;

    @FindBy(xpath = "//div[@id='signInModal']//span[@aria-hidden='true'][normalize-space()='×']")
    public WebElement close_icon;

//    Actions
    public void EnterUsername(String username) {
        username_field.sendKeys(username);
    }
    public void EnterPassword(String password) {
        password_field.sendKeys(password);
    }
    public void ClickCloseButton() {
        close_button.click();
    }
    public void ClickSignUpButton() {
        sign_up_button.click();
    }
    public void ClickCloseIcon() {
        close_icon.click();
    }
}
