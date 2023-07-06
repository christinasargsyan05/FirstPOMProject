package deleteAccountTests;/*
        * Test Case 1: Register User
        1. Launch browser
        2. Navigate to url 'http://automationexercise.com'
        3. Verify that home page is visible successfully
        4. Click on 'Signup / Login' button
        5. Verify 'New User Signup!' is visible
        6. Enter name and email address
        7. Click 'Signup' button
        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        9. Fill details: Title, Name, Email, Password, Date of birth
        10. Select checkbox 'Sign up for our newsletter!'
        11. Select checkbox 'Receive special offers from our partners!'
        12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        13. Click 'Create Account button'
        14. Verify that 'ACCOUNT CREATED!' is visible
        15. Click 'Continue' button
        16. Verify that 'Logged in as username' is visible
        17. Click 'Delete Account' button
        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
*/

import baseTest.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;


public class TestCase1 extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
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

        Thread.sleep(2000);
        signUpPageAndLoginPage.clickOnSignUpInputField();
        signUpPageAndLoginPage.enterSignUpName("John");

        signUpPageAndLoginPage.clickOnEmailInputField();
        signUpPageAndLoginPage.enterSignUpEmail("l3v8yii6rpk@ccategoryk.com");

        Thread.sleep(2000);
        signUpPageAndLoginPage.clickOnSignUpButton();

        SignUpPage signUpPage = new SignUpPage(driver);

        Thread.sleep(2000);
        signUpPage.isEnterAccountInfoTextDisplayed();


        signUpPage.clickOnTitleRadioButton();


        signUpPage.scrollToPasswordInputField();
        signUpPage.clickOnPasswordInputField();
        signUpPage.enterSignUpPassword("1245");


        signUpPage.scrollToDaysDropDown();
        signUpPage.selectDaysDropDownByVisibleText("20");
        signUpPage.selectMonthDropDownByVisibleText("May");
        signUpPage.selectYearDropDownByVisibleText("2000");


        signUpPage.scrollToSignUpForNewsCheckbox();
        signUpPage.clickOnSignUpForNewsCheckbox();
        signUpPage.clickOnReceiveSpecialOffersCheckbox();


        signUpPage.clickOnFirstNameInputField();
        signUpPage.enterFirstName("John");


        signUpPage.clickOnLastNameInputField();
        signUpPage.enterTheLastName("Smith");


        signUpPage.clickOnCompanyNameInputField();
        signUpPage.enterTheCompanyName("Company Name");


        signUpPage.clickOnAndEnterTheAddress1InputField("Address 1");
        signUpPage.clickOnAndEnterTheAddress2InputField("Address 2");


        signUpPage.clickOnCountryDropDownByVisibleText("Canada");

        signUpPage.scrollToStateInputFiled();
        signUpPage.clickOnAndEnterTheStateName("British Columbia");

        signUpPage.clickOnAndEnterTheCityName("Vancouver");

        signUpPage.clickOnAndEnterTheZipCode("00088776");

        signUpPage.clickOnAndEnterTheMobileNumber("89653563254536");

        signUpPage.clickOnCreateAccountButton();


        NewAccountCreatedPage newAccountCreatedPage = new NewAccountCreatedPage(driver);

        newAccountCreatedPage.isAccountCreatedTextVisible();

        newAccountCreatedPage.clickOnContinueButton();


        UserPersonalPage userPersonalPage = new UserPersonalPage(driver);

        userPersonalPage.isLoggedInAsUsernameVisible();

        userPersonalPage.clickOnDeleteAccountButton();

        homePage.isAccountDeletedTextVisible();

    }
}
