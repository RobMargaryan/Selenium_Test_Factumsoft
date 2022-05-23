package pages;

import constants.locators.BlogConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {
    private final WebDriver driver;


    private final By erpPricingTitle = By.xpath(BlogConstants.ERPPRICING_TITLE);
    private final By filterTitle = By.xpath(BlogConstants.FILTER_TITLE);

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getERPPricingTitle() {
        WebElement getERPPricingTitle = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(erpPricingTitle));
        return getERPPricingTitle;
    }

    public void getFilterTitle(){
        WebElement getFilterTitle = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(driver -> driver.findElement(filterTitle));
        Select filtered = new Select (getFilterTitle);
        filtered.selectByIndex(2);
    }

}
