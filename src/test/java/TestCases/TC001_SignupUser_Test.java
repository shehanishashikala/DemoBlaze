package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

import java.time.Duration;

public class TC001_SignupUser_Test {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Test
    public void TC001 () throws InterruptedException {
        SignupUser();
    }

    public void SignupUser() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.selectSignUp();

        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.EnterUsername("Shehani");
        signUpPage.EnterPassword("Test123");
        signUpPage.ClickSignUpButton();

        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
