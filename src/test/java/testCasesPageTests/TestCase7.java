package testCasesPageTests;/*
* Test Case 7: Verify Test Cases Page
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Test Cases' button
5. Verify user is navigated to test cases page successfully
*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.TestCasesPage;

public class TestCase7 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();


        HomePage homePage = new HomePage(driver);


        homePage.waitForBottomSubscriptionElementToBecomeVisible();
        homePage.isBottomSubscriptionElementVisible();

        homePage.clickOnTestCasesButton();

        TestCasesPage testCasesPage = new TestCasesPage(driver);

        testCasesPage.isTestCasesPageTitleVisible();
    }
}
