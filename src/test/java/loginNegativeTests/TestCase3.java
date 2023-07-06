package loginNegativeTests;/*
*Test Case 3: Login User with incorrect email and password
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter incorrect email address and password
7. Click 'login' button
8. Verify error 'Your email or password is incorrect!' is visible
*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignUpAndLoginPage;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();


        HomePage homePage = new HomePage(driver);

        homePage.waitForBottomSubscriptionElementToBecomeVisible();
        homePage.isBottomSubscriptionElementVisible();


        homePage.clickOnLoginSignUpButton();


        SignUpAndLoginPage signUpPageAndLoginPage = new SignUpAndLoginPage(driver);

        signUpPageAndLoginPage.isLoginToYourAccountTextVisible();

        signUpPageAndLoginPage.clickOnAndEnterTheLoginEmail("hairbear2@siyonio.com");

        signUpPageAndLoginPage.clickOnAndEnterTheLoginPassword("12390990");

        signUpPageAndLoginPage.clickOnLoginButton();

        signUpPageAndLoginPage.isYourEmailOrPasswordIncorrectTextVisible();
    }
}
