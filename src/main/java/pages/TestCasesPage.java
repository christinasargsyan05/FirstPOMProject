package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage{
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }

    public void isTestCasesPageTitleVisible(){
        System.out.println("Test Cases page Title is visible -- " +
                driver.findElement(By.xpath("//b[contains(text(),'Test Cases')]")).isDisplayed());
    }
}
