package pages;

import constants.locators.HomePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;

    private final By industryTitle = By.xpath(HomePageConstants.INDUSTRY_TITLE);
    private final By erpModulesTitle = By.cssSelector(HomePageConstants.ERPMODULES_TITLE);
    private final By subscribersTitle = By.cssSelector(HomePageConstants.SUBSCRIBERS_TITLE);

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getIndustryTitle() {
        return driver.findElement(industryTitle);
    }

    public WebElement getERPModulesTitle() {
        return driver.findElement(erpModulesTitle);
    }

    public WebElement getSubscribersTitle() {
        return driver.findElement(subscribersTitle);
    }

}