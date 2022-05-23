package pages;

import constants.locators.HomePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private final WebDriver driver;

    private final By industryTitle = By.xpath(HomePageConstants.INDUSTRY_TITLE);
    private final By erpModulesTitle = By.cssSelector(HomePageConstants.ERPMODULES_TITLE);
    private final By subscribersTitle = By.cssSelector(HomePageConstants.SUBSCRIBERS_TITLE);
    private final By groupTitle = By.className(HomePageConstants.GROUP_TITLE);
    private final By capTitle = By.xpath(HomePageConstants.CAP_TITLE);
    private final By europcarTitle = By.xpath(HomePageConstants.EUROPCAR_TITLE);
    private final By brickworxTitle = By.xpath(HomePageConstants.BRICKWORX_TITLE);

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

    public List<WebElement> getGroupTitle() {
        return driver.findElements(groupTitle);
    }

    public WebElement getCapTitle() {
        return driver.findElement(capTitle);
    }
    public WebElement getEuropcarTitle() {
        return driver.findElement(europcarTitle);
    }
    public WebElement getBrickworxTitle() {
        return driver.findElement(brickworxTitle);
    }

}