package signupNegativeTests;/*
* Test Case 5: Register User with existing email
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and already registered email address
7. Click 'Signup' button
8. Verify error 'Email Address already exist!' is visible
*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignUpAndLoginPage;

public class TestCase5 {
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

        signUpPageAndLoginPage.isNewUserSignUpTextVisible();


        signUpPageAndLoginPage.clickOnSignUpInputField();
        signUpPageAndLoginPage.enterSignUpName("John");

        signUpPageAndLoginPage.clickOnEmailInputField();
        signUpPageAndLoginPage.enterSignUpEmail("l3v8yii6rpk@ccategoryk.com");

        signUpPageAndLoginPage.clickOnSignUpButton();

        signUpPageAndLoginPage.isEmailAddressAlreadyExistTextVisible();
    }
}
