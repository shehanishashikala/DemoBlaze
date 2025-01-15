package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class TC003_PlaceOrder_Test {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Test
    public void TC003() throws InterruptedException {
        loginUser();
        placeOrders();
        navigateCart();
        placeOrderInfo();
        verifySuccessOrder();
    }

    public void loginUser() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.selectLoginPage();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("Shehani");
        loginPage.enterPassword("Test123");
        loginPage.clickLoginButton();

        Thread.sleep(2000);
    }

    public void placeOrders() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.selectPhones();

        homePage.selectGalaxys6();

        ProductPageGalaxy productPageGalaxy = new ProductPageGalaxy(driver);
        productPageGalaxy.clickAddToCart1();
        Thread.sleep(2000);

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        Thread.sleep(2000);

        ProductPageNokia productPageNokia = new ProductPageNokia(driver);
        productPageNokia.clickAddToCart2();
        Thread.sleep(2000);

        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(2000);
    }

    public void navigateCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.selectCartPage();

        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);
        cartPage.getPlaceOrder();
    }

    public void placeOrderInfo() throws InterruptedException {
        PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);
        placeOrderPage.enterName("Shehani");
        placeOrderPage.enterCountry("SriLanka");
        placeOrderPage.enterCity("ABC");
        placeOrderPage.enterCard("1234567890");
        placeOrderPage.enterMonth("January");
        placeOrderPage.enterYear("2025");
        placeOrderPage.clickPurchase();
        Thread.sleep(2000);
    }

    public void verifySuccessOrder(){
        PlaceOrderSuccessPage placeOrderSuccessPage = new PlaceOrderSuccessPage(driver);
        String successText = placeOrderSuccessPage.verifyOrderSuccess();
        System.out.println(successText);
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
