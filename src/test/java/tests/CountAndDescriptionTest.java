package tests;

import base.BaseTest;
import constants.messages.HomePageMessages;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountAndDescriptionTest extends BaseTest {
    @Test
    public void CountAndDescriptionTest(){
        assertEquals(homePage.getGroupTitle().size(), HomePageMessages.GROUP_MESSAGE);
        assertEquals(homePage.getCapTitle().getText(), HomePageMessages.CAP_MESSAGE);
        assertEquals(homePage.getBrickworxTitle().getText(), HomePageMessages.BRICKWORX_MESSAGE);
        assertEquals(homePage.getEuropcarTitle().getText(), HomePageMessages.EUROPCAR_MESSAGE);
    }
}

