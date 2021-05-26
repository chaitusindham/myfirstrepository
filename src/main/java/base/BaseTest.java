package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

public class BaseTest
{
    public static WebDriver driver;

    public static Homepage homePage;

    public static RegisterPage registerPage;

    public static LoginPage loginPage;

    @Before
    public static void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new Homepage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }

   @After
    public static void tearDown()
    {
        driver.quit();
    }



}
