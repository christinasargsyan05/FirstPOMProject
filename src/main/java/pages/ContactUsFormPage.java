package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtil;

public class ContactUsFormPage extends BasePage {

    private static final By INPUT_NAME = By.cssSelector("input[data-qa='name']");
    private static final By INPUT_EMAIL = By.cssSelector("input[data-qa='email']");
    private static final By INPUT_SUBJECT = By.cssSelector("input[data-qa='subject']");
    private static final By INPUT_MESSAGE = By.cssSelector("textarea[data-qa='message']");
    private static final By CHOOSE_FILE_BUTTON = By.cssSelector("input[type='file']");
    private static final By SUBMIT_BUTTON = By.cssSelector("input[data-qa='submit-button']");
    private static final By HOME_BUTTON = By.xpath("//span[contains(text(),'Home')]");
    private final WebElement GET_IN_TOUCH_TEXT = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
    private final WebElement SUCCESS_MESSAGE = driver.findElement(By.cssSelector("div.status.alert.alert-success"));
    public ContactUsFormPage(WebDriver driver) {
        super(driver);
    }

    public void isGetInTouchTextVisible() {
        System.out.println("Get in touch text is visible -- " + GET_IN_TOUCH_TEXT.isDisplayed());
    }

    public void enterTheName(String name) {
        enterText(INPUT_NAME, name);
    }

    public void enterTheEmail(String email) {
        enterText(INPUT_EMAIL, email);
    }

    public void enterTheSubject(String subject) {
        enterText(INPUT_SUBJECT, subject);
    }

    public void enterTheMessage(String message) {
        enterText(INPUT_MESSAGE, message);
    }

    public void clickOnChooseFileButton(){clickOnWebElement(CHOOSE_FILE_BUTTON);}

    public  void scrollToSubmitButton(){scrollToElement(driver.findElement(By.cssSelector("input[data-qa='submit-button']")));}

    public void clickOnSubmitButton(){clickOnWebElement(SUBMIT_BUTTON);}

    public void acceptSubmissionAlert(){
        WaitUtil.waitForAlertToBecomeClickable(driver);
        driver.switchTo().alert().accept();
    }

    public void isSuccessMessageVisible(){
        System.out.println("Submission success message is displayed -- " + SUCCESS_MESSAGE.isDisplayed());
    }

    public void clickOnHomeButton(){clickOnWebElement(HOME_BUTTON);}

}
