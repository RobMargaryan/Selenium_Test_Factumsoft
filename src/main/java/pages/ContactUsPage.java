package pages;

import constants.locators.ContactUsConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ContactUsPage {
    private final WebDriver driver;

    private final By manufacturingTitle = By.cssSelector(ContactUsConstants.MANUFACTURING_TITLE);
    private final By crmTitle = By.cssSelector(ContactUsConstants.CRM_TITLE);
    private final By getInTouchHeaderTitle = By.cssSelector(ContactUsConstants.GETINTOUCH_TITLE);

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getManufacturingTitle() {
        return driver.findElement(manufacturingTitle);
    }

    public WebElement getCRMTitle() {
        return driver.findElement(crmTitle);
    }

    public WebElement getInTouchHeaderTitle() {
        return driver.findElement(getInTouchHeaderTitle);
    }

}
