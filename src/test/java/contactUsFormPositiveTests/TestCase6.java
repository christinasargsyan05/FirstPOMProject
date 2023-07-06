/*
Test Case 6: Contact Us Form
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Contact Us' button
5. Verify 'GET IN TOUCH' is visible
6. Enter name, email, subject and message
7. Upload file
8. Click 'Submit' button
9. Click OK button
10. Verify success message 'Success! Your details have been submitted successfully.' is visible
11. Click 'Home' button and verify that landed to home page successfully
*/
package contactUsFormPositiveTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactUsFormPage;
import pages.HomePage;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();


        HomePage homePage = new HomePage(driver);

        homePage.waitForBottomSubscriptionElementToBecomeVisible();
        homePage.isBottomSubscriptionElementVisible();

        homePage.clickOnContactUsButton();

        ContactUsFormPage contactUsFormPage = new ContactUsFormPage(driver);

        contactUsFormPage.isGetInTouchTextVisible();

        contactUsFormPage.enterTheName("John");

        contactUsFormPage.enterTheEmail("markbear@d-ax.xyz");

        contactUsFormPage.enterTheSubject("personal");

        contactUsFormPage.enterTheMessage("hdhfdkhgdhg");

        contactUsFormPage.scrollToSubmitButton();

        contactUsFormPage.clickOnSubmitButton();

        contactUsFormPage.acceptSubmissionAlert();

        contactUsFormPage.isSuccessMessageVisible();

        contactUsFormPage.clickOnHomeButton();

        homePage.isBottomSubscriptionElementVisible();
    }
}
