package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    private static final By SIGNUP_LOGIN_BUTTON = By.cssSelector("i.fa.fa-lock");
    private static final By TEST_CASES_BUTTON = By.xpath("//li//child::a[contains(text(),' Test Cases')]");
    private static final By CONTACT_US_BUTTON = By.cssSelector("i.fa.fa-envelope");
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
    }

    public void clickOnLoginSignUpButton() {
        clickOnWebElement(SIGNUP_LOGIN_BUTTON);
    }

    public void waitForBottomSubscriptionElementToBecomeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Subscription']")));
    }

    public void isBottomSubscriptionElementVisible() {
        System.out.println("Home Page Loaded successfully -- " +
                driver.findElement(By.xpath("//h2[text()='Subscription']")).isDisplayed());
    }

    public void isAccountDeletedTextVisible() {
        System.out.println("Account Deleted Text is Visible -- " +
                driver.findElement(By.xpath("//h2[@data-qa='account-deleted']/b[text()='Account Deleted!']")).isDisplayed());
    }

    public void clickOnTestCasesButton(){clickOnWebElement(TEST_CASES_BUTTON);}

    public void clickOnContactUsButton(){clickOnWebElement(CONTACT_US_BUTTON);}



}
