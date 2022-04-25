package pages;

import constants.locators.PartnershipConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PartnershipPage {
    private final WebDriver driver;

    private final By educationTitle = By.cssSelector(PartnershipConstants.EDUCATION_TITLE);
    private final By biReportTitle = By.xpath(PartnershipConstants.BIREPORT_TITLE);
    private final By quickLinkTitle = By.xpath(PartnershipConstants.QUICKLINK_TITLE);

    public PartnershipPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBusinessTitle() {
        return driver.findElement(educationTitle);
    }

    public WebElement getBIReportTitle() {
        return driver.findElement(biReportTitle);
    }

    public WebElement getQuickLinkeTitle() { return driver.findElement(quickLinkTitle);}
}
