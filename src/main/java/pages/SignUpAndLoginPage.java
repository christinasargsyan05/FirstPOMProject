package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtil;

public class SignUpAndLoginPage extends BasePage {
    private static final By INPUT_SIGNUP_NAME = By.xpath("//input[@data-qa='signup-name']");
    private static final By INPUT_EMAIL = By.xpath("//input[@data-qa='signup-email']");
    private static final By SIGNUP_BUTTON = By.cssSelector("button[data-qa=signup-button]");
    //private final WebElement NEW_USER_SIGNUP_TEXT = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
    //private final WebElement LOGIN_TO_YOUR_ACCOUNT_TEXT = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
    private final WebElement INPUT_LOGIN_EMAIL = driver.findElement(By.cssSelector("input[data-qa='login-email']"));
    private final WebElement INPUT_LOGIN_PASSWORD = driver.findElement(By.cssSelector("input[data-qa='login-password']"));
    private final WebElement LOGIN_BUTTON = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
    WaitUtil wait = new WaitUtil();

    public SignUpAndLoginPage(WebDriver driver) {
        super(driver);
    }

    public void isNewUserSignUpTextVisible() {
        System.out.println("New User Sign Up Text is Visible -- " +
                driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed());
    }

    public void clickOnSignUpInputField() {
        clickOnWebElement(INPUT_SIGNUP_NAME);
    }

    public void enterSignUpName(String signUpName) {
        enterText(INPUT_SIGNUP_NAME, signUpName);
    }

    public void clickOnEmailInputField() {
        clickOnWebElement(INPUT_EMAIL);
    }

    public void enterSignUpEmail(String signUpEmail) {
        enterText(INPUT_EMAIL, signUpEmail);
    }

    public void clickOnSignUpButton() {
        clickOnWebElement(SIGNUP_BUTTON);
    }

    public void isLoginToYourAccountTextVisible() {
        System.out.println("Login To Your Account Text is Visible -- "
                + driver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed());
    }

    public void clickOnAndEnterTheLoginEmail(String loginEmail) {
        INPUT_LOGIN_EMAIL.click();
        INPUT_LOGIN_EMAIL.sendKeys(loginEmail);
    }

    public void clickOnAndEnterTheLoginPassword(String loginPassword) {
        INPUT_LOGIN_PASSWORD.click();
        INPUT_LOGIN_PASSWORD.sendKeys(loginPassword);
    }

    public void clickOnLoginButton() {
        LOGIN_BUTTON.click();
    }

    public void isYourEmailOrPasswordIncorrectTextVisible() {
        System.out.println("Your Email Or Password Incorrect Text is Visible -- " + driver.findElement(By.xpath
                ("//p[text()='Your email or password is incorrect!']")).isDisplayed());
    }

    public void isEmailAddressAlreadyExistTextVisible(){
        System.out.println("Email Address already exist text is visible -- " +
                driver.findElement(By.xpath("//p[text()='Email Address already exist!']")).isDisplayed());
    }

}
