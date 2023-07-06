package deleteAccountTests;/*
* Test Case 2: Login User with correct email and password
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignUpAndLoginPage;
import pages.UserPersonalPage;


public class TestCase2 {
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

        signUpPageAndLoginPage.clickOnAndEnterTheLoginEmail("hairbear2@siyonastudio.com");

        signUpPageAndLoginPage.clickOnAndEnterTheLoginPassword("1235");

        signUpPageAndLoginPage.clickOnLoginButton();

        UserPersonalPage userPersonalPage = new UserPersonalPage(driver);

        userPersonalPage.isLoggedInAsUsernameVisible();

        userPersonalPage.clickOnDeleteAccountButton();

//        WaitUtil wait = new WaitUtil();
//
//        By iFrame = By.cssSelector("body[aria-hidden=true]");
//
//        wait.waitFrameToBecomeVisibleAndSwitchToIt(driver,iFrame);
//        Actions actions = new Actions(driver);
//        actions.click();
//
//        homePage.isAccountDeletedTextVisible();


    }
}
