package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountCreatedPage extends BasePage {
    private final WebElement CONTINUE_BUTTON = driver.findElement(By.xpath("//a[@data-qa='continue-button']"));

    public NewAccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    public void isAccountCreatedTextVisible() {
        System.out.println("Account Created Text is Visible -- " + driver.findElement(By.xpath("//h2[@data-qa='account-created']/b[text()='Account Created!']"))
                .isDisplayed());
    }


    public void clickOnContinueButton() {
        CONTINUE_BUTTON.click();
    }
}
