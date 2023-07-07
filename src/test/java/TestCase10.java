/*
Test Case 10: Verify Subscription in home page
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down to footer
5. Verify text 'SUBSCRIPTION'
6. Enter email address in input and click arrow button
7. Verify success message 'You have been successfully subscribed!' is visible
*/
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import static baseTest.BaseTest.closeDriver;

public class TestCase10 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();


        HomePage homePage = new HomePage(driver);

        homePage.scrollToThePageFooter();
        homePage.isBottomSubscriptionElementVisible();

        homePage.enterTheEmailInSubscriptionInputField("voskon@italy-mail.com");
        homePage.clickOnSubscribeButton();

        homePage.isSuccessMessageDisplayed();

        closeDriver();


    }
}
