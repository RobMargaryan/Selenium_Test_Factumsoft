package pages;

import constants.locators.RequestDemoConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class RequestDemoPage {
    private final WebDriver driver;

    private final By fullNameTxtBox = By.xpath(RequestDemoConstants.FULLNAME_TXTBOX);
    private final By lastNameTxtBox = By.xpath(RequestDemoConstants.LASTNAME_TXTBOX);
    private final By emailTxtBox = By.xpath(RequestDemoConstants.EMAIL_TXTBOX);
    private final By phoneNumberTxtBox = By.xpath(RequestDemoConstants.PHONENUMBER_TXTBOX);
    private final By companyTxtBox = By.xpath(RequestDemoConstants.COMPANY_TXTBOX);
    private final By websiteTxtBox = By.xpath(RequestDemoConstants.WEBSITE_TXTBOX);


    public RequestDemoPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getFullNameTxtBox() {
        WebElement getFullName = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(fullNameTxtBox));
        return getFullName;
    }

    public WebElement getLastNameTxtBox() {
        return driver.findElement(lastNameTxtBox);
    }

    public WebElement getEmailTxtBox() {
        return driver.findElement(emailTxtBox);
    }

    public WebElement getPhoneNumberTxtBox() {
        return driver.findElement(phoneNumberTxtBox);
    }

    public WebElement getCompanyTxtBox() {
        return driver.findElement(companyTxtBox);
    }

    public WebElement getWebsiteTxtBox() {
        return driver.findElement(websiteTxtBox);
    }


}
