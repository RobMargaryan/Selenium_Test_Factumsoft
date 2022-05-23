package tests;
import base.BaseTest;
import constants.locators.CareerConstants;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import constants.messages.*;
import pages.CareerPage;

import static org.testng.Assert.assertEquals;

public class CareerTest extends BaseTest {
    @Test
    public void careerAvailableTest() {
        basePage.getCareerButton().click();
        assertEquals(careerPage.getSqlTitle().getText(), CareerMessages.SQL_MESSAGE);
        assertEquals(careerPage.getJuniorFullTitle().getText(), CareerMessages.JUNIORFULL_MESSAGE);
        assertEquals(careerPage.getMidFullTitle().getText(), CareerMessages.MIDFULL_MESSAGE);
    }
}
