package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllProductsPage extends BasePage{

    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

 private final WebElement ALL_PRODUCTS_TEXT = driver.findElement(By.xpath("//h2[contains(text(),'All Products')]"));

    public void isAllProductsTextVisible(){
        System.out.println("All products page loaded successfully -- " +ALL_PRODUCTS_TEXT.isDisplayed());
    }
}
