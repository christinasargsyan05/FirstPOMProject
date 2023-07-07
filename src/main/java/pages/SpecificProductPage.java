package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificProductPage extends BasePage {

    private final WebElement PRODUCT_NAME = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
    private final WebElement CATEGORY = driver.findElement(By.xpath("//p[contains(text(),'Category')]"));
    private final WebElement PRICE = driver.findElement(By.xpath("//span[contains(text(),'Rs')]"));
    private final WebElement AVAILABILITY = driver.findElement(By.xpath("//b[contains(text(),'Availability:')]"));
    private final WebElement CONDITION = driver.findElement(By.xpath("//b[contains(text(),'Condition')]"));
    private final WebElement BRAND = driver.findElement(By.xpath("//b[contains(text(),'Brand:')]"));

    public SpecificProductPage(WebDriver driver) {
        super(driver);
    }

    public void isProductNameDisplayed() {
        System.out.println("product name is displayed -- " + PRODUCT_NAME.isDisplayed());
    }

    public void isCategoryDisplayed() {
        System.out.println("category of the product is displayed -- " + CATEGORY.isDisplayed());
    }

    public void isPriceDisplayed() {
        System.out.println("the price of the product is displayed -- " + PRICE.isDisplayed());
    }

    public void isAvailabilityDisplayed() {
        System.out.println("the availability of the product is displayed -- " + AVAILABILITY.isDisplayed());
    }

    public void isConditionDisplayed() {
        System.out.println("the condition of the product is displayed -- " + CONDITION.isDisplayed());
    }

    public void isBrandDisplayed() {
        System.out.println("the brand of the product is displayed -- " + BRAND.isDisplayed());
    }
}
