package pages;

import constants.locators.CareerConstants;
import constants.locators.PartnershipConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CareerPage {
    private final WebDriver driver;

    private final By sqlTitle = By.xpath(CareerConstants.SQL_TITLE);
    private final By juniorFullTitle = By.xpath(CareerConstants.JUNIORFULL_TITLE);
    private final By midFullTitle = By.xpath(CareerConstants.MIDFULL_TITLE);

    public CareerPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSqlTitle() {
        WebElement getSqlTitle = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(sqlTitle));
        return driver.findElement(sqlTitle);
    }

    public WebElement getJuniorFullTitle() {
        return driver.findElement(juniorFullTitle);
    }

    public WebElement getMidFullTitle() { return driver.findElement(midFullTitle);}
}
