package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static utils.WaitUtil.waitForElementLocatedByBecomeClickable;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    protected void clickOnWebElement(By by) {
        waitForElementLocatedByBecomeClickable(driver, by);
        getWebElement(by).click();
    }

    protected void performClickOnWebElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getWebElement(by)).pause(Duration.ofMillis(500)).click().perform();
    }


    protected void enterText(By by, String text) {
        getWebElement(by).sendKeys(text);
    }

    protected void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }



}

