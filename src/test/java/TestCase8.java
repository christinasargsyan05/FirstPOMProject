/*
Test Case 8: Verify All Products and product detail page
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. The products list is visible
7. Click on 'View Product' of first product
8. User is landed to product detail page
9. Verify that detail is visible: product name, category, price, availability, condition, brand
*/
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AllProductsPage;
import pages.HomePage;
import pages.SpecificProductPage;


public class TestCase8 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();


        HomePage homePage = new HomePage(driver);

        homePage.waitForBottomSubscriptionElementToBecomeVisible();
        homePage.isBottomSubscriptionElementVisible();

        homePage.clickOnProductsButton();

        AllProductsPage allProductsPage = new AllProductsPage(driver);

        allProductsPage.isAllProductsTextVisible();

        allProductsPage.clickOnFirstProduct();

        SpecificProductPage specificProductPage = new SpecificProductPage(driver);

        specificProductPage.isProductNameDisplayed();

        specificProductPage.isCategoryDisplayed();

        specificProductPage.isPriceDisplayed();

        specificProductPage.isAvailabilityDisplayed();

        specificProductPage.isConditionDisplayed();

        specificProductPage.isBrandDisplayed();

    }
}
