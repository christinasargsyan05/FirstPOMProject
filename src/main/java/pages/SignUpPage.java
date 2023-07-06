package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SignUpPage extends BasePage {

    private final WebElement TITLE_RADIO_BUTTON1 = driver.findElement(By.id("uniform-id_gender1"));
    private final WebElement TITLE_RADIO_BUTTON2 = driver.findElement(By.id("uniform-id_gender2"));
    private final WebElement INPUT_PASSWORD = driver.findElement(By.cssSelector("input[data-qa=password]"));
    private final WebElement DAY_DROP_DOWN = driver.findElement(By.cssSelector("select[data-qa=days]"));
    private final WebElement MONTH_DROP_DOWN = driver.findElement(By.cssSelector("select[data-qa=months]"));
    private final WebElement YEAR_DROP_DOWN = driver.findElement(By.cssSelector("select[data-qa=years]"));
    private final WebElement SIGN_UP_FOR_NEWSLETTER_CHECKBOX = driver.findElement(By.cssSelector("input[id=newsletter]"));
    private final WebElement RECEIVE_SPECIAL_OFFERS_CHECKBOX = driver.findElement(By.cssSelector("input[id=optin]"));
    private final WebElement INPUT_FIRST_NAME = driver.findElement(By.cssSelector("input[data-qa=first_name]"));
    private final WebElement INPUT_LAST_NAME = driver.findElement(By.cssSelector("input[data-qa=last_name]"));
    private final WebElement INPUT_COMPANY_NAME = driver.findElement(By.cssSelector("input[data-qa=company]"));
    private final WebElement INPUT_ADDRESS1 = driver.findElement(By.cssSelector("input[data-qa=address]"));
    private final WebElement INPUT_ADDRESS2 = driver.findElement(By.cssSelector("input[data-qa=address2]"));
    private final WebElement COUNTRY_DROP_DOWN = driver.findElement(By.cssSelector("select[data-qa=country]"));
    private final WebElement INPUT_STATE = driver.findElement(By.cssSelector("input[data-qa=state]"));
    private final WebElement INPUT_CITY = driver.findElement(By.cssSelector("input[data-qa=city]"));
    private final WebElement INPUT_ZIPCODE = driver.findElement(By.cssSelector("input[data-qa=zipcode]"));
    private final WebElement INPUT_MOBILE_NUMBER = driver.findElement(By.cssSelector("input[data-qa=mobile_number]"));
    private final WebElement CREATE_ACCOUNT_BUTTON = driver.findElement(By.cssSelector("button[data-qa=create-account]"));
    Select daysDropDown = new Select(DAY_DROP_DOWN);
    Select monthDropDown = new Select(MONTH_DROP_DOWN);
    Select yearDropDown = new Select(YEAR_DROP_DOWN);
    Select countryDropDown = new Select(COUNTRY_DROP_DOWN);

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    //    private  final WebElement ENTER_ACCOUNT_INFO_TEXT = driver.findElement
//                    (By.xpath("//h2[@class='title text-center']/b[text()='Enter Account Information']"));
    public void isEnterAccountInfoTextDisplayed() {
        System.out.println("Enter Account Info Text is Displayed -- " +
                driver.findElement(By.xpath("//h2[@class='title text-center']/b[text()='Enter Account Information']")).isDisplayed());
    }

    public void clickOnTitleRadioButton() {
        TITLE_RADIO_BUTTON1.click();
    }

    public void scrollToPasswordInputField() {
        scrollToElement(INPUT_PASSWORD);
    }

    public void clickOnPasswordInputField() {
        INPUT_PASSWORD.click();
    }

    public void enterSignUpPassword(String signUpPassword) {
        INPUT_PASSWORD.sendKeys(signUpPassword);
    }

    public void scrollToDaysDropDown() {
        scrollToElement(DAY_DROP_DOWN);
    }

    public void selectDaysDropDownByVisibleText(String str) {
        daysDropDown.selectByVisibleText(str);
    }

    public void selectMonthDropDownByVisibleText(String str) {
        monthDropDown.selectByVisibleText(str);
    }

    public void selectYearDropDownByVisibleText(String str) {
        yearDropDown.selectByVisibleText(str);
    }

    public void scrollToSignUpForNewsCheckbox() {
        scrollToElement(SIGN_UP_FOR_NEWSLETTER_CHECKBOX);
    }

    public void clickOnSignUpForNewsCheckbox() {
        SIGN_UP_FOR_NEWSLETTER_CHECKBOX.click();
    }

    public void clickOnReceiveSpecialOffersCheckbox() {
        RECEIVE_SPECIAL_OFFERS_CHECKBOX.click();
    }

    public void clickOnFirstNameInputField() {
        INPUT_FIRST_NAME.click();
    }

    public void enterFirstName(String firstName) {
        INPUT_FIRST_NAME.sendKeys(firstName);
    }

    public void clickOnLastNameInputField() {
        INPUT_LAST_NAME.click();
    }

    public void enterTheLastName(String lastName) {
        INPUT_LAST_NAME.sendKeys(lastName);
    }

    public void clickOnCompanyNameInputField() {
        INPUT_COMPANY_NAME.click();
    }

    public void enterTheCompanyName(String companyName) {
        INPUT_COMPANY_NAME.sendKeys(companyName);
    }

    public void clickOnAndEnterTheAddress1InputField(String address1) {
        INPUT_ADDRESS1.click();
        INPUT_ADDRESS1.sendKeys(address1);
    }

    public void clickOnAndEnterTheAddress2InputField(String address2) {
        INPUT_ADDRESS2.click();
        INPUT_ADDRESS2.sendKeys(address2);
    }

    public void clickOnCountryDropDownByVisibleText(String countryName) {
        countryDropDown.selectByVisibleText(countryName);
    }

    public void scrollToStateInputFiled() {
        scrollToElement(INPUT_STATE);
    }

    public void clickOnAndEnterTheStateName(String stateName) {
        INPUT_STATE.click();
        INPUT_STATE.sendKeys(stateName);
    }

    public void clickOnAndEnterTheCityName(String cityName) {
        INPUT_CITY.click();
        INPUT_CITY.sendKeys(cityName);
    }

    public void clickOnAndEnterTheZipCode(String zipCode) {
        INPUT_ZIPCODE.click();
        INPUT_ZIPCODE.sendKeys(zipCode);
    }

    public void clickOnAndEnterTheMobileNumber(String mobileNumber) {
        INPUT_MOBILE_NUMBER.click();
        INPUT_MOBILE_NUMBER.sendKeys(mobileNumber);
    }

    public void clickOnCreateAccountButton() {
        CREATE_ACCOUNT_BUTTON.click();
    }

}
