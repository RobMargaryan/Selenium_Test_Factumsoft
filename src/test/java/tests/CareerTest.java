package tests;
import base.BaseTest;
import org.testng.annotations.*;
import constants.messages.*;

import static org.testng.Assert.assertEquals;

public class CareerTest extends BaseTest {
    @Test
    public void careerAvailableTest() {
        basePage.getCareerButton();
        assertEquals(careerPage.getSqlTitle().getText(), CareerMessages.SQL_MESSAGE);
        assertEquals(careerPage.getJuniorFullTitle().getText(), CareerMessages.JUNIORFULL_MESSAGE);
        assertEquals(careerPage.getMidFullTitle().getText(), CareerMessages.MIDFULL_MESSAGE);
    }
}
