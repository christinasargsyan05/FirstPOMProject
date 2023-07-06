package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPersonalPage extends BasePage {
    private final WebElement DELETE_ACCOUNT_BUTTON = driver.findElement(By.cssSelector("i.fa.fa-trash-o"));
    private final WebElement LOGOUT_BUTTON = driver.findElement(By.xpath("//a[contains(text(),' Logout')]"));
    ;

    public UserPersonalPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoggedInAsUsernameVisible() {
        return driver.findElement(By.xpath("//li//child::a[contains(text(),'Logged in')]")).isDisplayed();
    }

    public void clickOnDeleteAccountButton() {
        DELETE_ACCOUNT_BUTTON.click();
    }

    public void clickOnLogoutButton() {
        LOGOUT_BUTTON.click();
    }
}
