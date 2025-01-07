package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    Elements
    @FindBy(id = "loginusername")
    WebElement loginUsername_field;

    @FindBy(id = "loginpassword")
    WebElement loginPassword_field;

    @FindBy(xpath = "//div[@id='logInModal']//button[@type='button'][normalize-space()='Close']")
    WebElement loginCloseButton_element;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginLoginButton_element;

    @FindBy(xpath = "//div[@id='logInModal']//span[@aria-hidden='true'][normalize-space()='×']")
    WebElement loginCloseIcon_element;


//    Actions
    public void enterUsername(String username) {
        loginUsername_field.sendKeys(username);
    }
    public void enterPassword(String password) {
        loginPassword_field.sendKeys(password);
    }
    public void clickLoginButton() {
        loginLoginButton_element.click();
    }
    public void clickLoginCloseButton() {
        loginCloseButton_element.click();
    }
    public void clickLoginCloseicon() {
        loginCloseIcon_element.click();
    }

}
