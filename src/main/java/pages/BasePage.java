package pages;

import constants.locators.BaseConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private final WebDriver driver;

    private final By homeButton = By.id(BaseConstants.HOME_BUTTON);
    private final By partnershipButton = By.xpath(BaseConstants.PARTNERSHIP_BUTTON);
    private final By contactUsButton = By.xpath(BaseConstants.CONTACTUS_BUTTON);
    private final By requestDemoButton = By.xpath(BaseConstants.REQUESTDEMO_BUTTON);
    private final By careerButton = By.xpath(BaseConstants.CAREER_BUTTON);

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeButton() {
        return driver.findElement(homeButton);
    }

    public WebElement getPartnershipButton() {
        return driver.findElement(partnershipButton);
    }

    public WebElement getContactUsButton() {
        return driver.findElement(contactUsButton);
    }
    public WebElement getRequestDemoButton(){return driver.findElement(requestDemoButton);}
    public WebElement getCareerButton(){return driver.findElement(careerButton);}
}