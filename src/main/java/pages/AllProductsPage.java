package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class AllProductsPage extends BasePage {

    private final WebElement PRODUCT_1 = driver.findElement(By.cssSelector("img[src='/get_product_picture/1']"));
    private final WebElement OVERLAY_CONTENT = driver.findElement(By.cssSelector("div.overlay-content a[data-product-id='1']"));
    private final WebElement ALL_PRODUCTS_TEXT = driver.findElement(By.xpath("//h2[contains(text(),'All Products')]"));
    private List<WebElement> VIEW_PRODUCT_BUTTONS_LIST = driver.findElements(By.xpath("//a[contains(text(),'View Product')]/i"));

    public AllProductsPage(WebDriver driver) {
        super(driver);
    }

    public void isAllProductsTextVisible() {
        System.out.println("All products page loaded successfully -- " + ALL_PRODUCTS_TEXT.isDisplayed());
    }

    public void moveToProduct1() {
        Actions action = new Actions(driver);
        action.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).moveToElement(PRODUCT_1).moveToElement(OVERLAY_CONTENT).pause(Duration.ofSeconds(1)).click(OVERLAY_CONTENT).perform();
    }
    
    public void clickOnFirstProduct(){
        VIEW_PRODUCT_BUTTONS_LIST.get(0).click();
    }
}
