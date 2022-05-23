package pages;

import constants.locators.ContactUsConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ContactUsPage {
    private final WebDriver driver;

    private final By manufacturingTitle = By.cssSelector(ContactUsConstants.MANUFACTURING_TITLE);
    private final By crmTitle = By.xpath(ContactUsConstants.CRM_TITLE);
    private final By getInTouchHeaderTitle = By.cssSelector(ContactUsConstants.GETINTOUCH_TITLE);
    private final By fullNameTxtBox = By.xpath(ContactUsConstants.FULLNAME_TXTBOX);
    private final By companyTxtBox = By.xpath(ContactUsConstants.COMPANY_TXTBOX);
    private final By emailTxtBox = By.xpath(ContactUsConstants.EMAIL_TXTBOX);
    private final By inquiryDetailsTxtBox = By.xpath(ContactUsConstants.INQUIRYDETAILS_TXTBOX);

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

    public WebElement getFullNameTxtBox() {
        WebElement getFullName = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(fullNameTxtBox));
        return driver.findElement(fullNameTxtBox);
    }

    public WebElement getCompanyTxtBox() {
        return driver.findElement(companyTxtBox);
    }

    public WebElement getEmailTxtBox() {
        return driver.findElement(emailTxtBox);
    }

    public WebElement getInquiryDetailsTxtBox() {
        return driver.findElement(inquiryDetailsTxtBox);
    }


}
