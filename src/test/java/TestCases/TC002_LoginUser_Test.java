package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class TC002_LoginUser_Test {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Test
    public void LoginUser() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.selectLoginPage();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("Shehani");
        Thread.sleep(2000);
        loginPage.enterPassword("Test123");
        loginPage.clickLoginButton();

        Thread.sleep(5000);
        System.out.println(homePage.nameOfUser_element);

    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
