package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

    protected static WebDriver driver;

    //@BeforeTest
    public static void prepareEnv() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

    }

    //@AfterTest
    public static void closeDriver(){
        driver.close();
    }

}
